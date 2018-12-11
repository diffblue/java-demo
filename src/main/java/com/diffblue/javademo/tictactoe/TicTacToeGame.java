package com.diffblue.javademo.tictactoe;

public class TicTacToeGame {

  private Board board = new Board(3);

  /**
   * Check players on board made a valid move.
   */
  public boolean isValidMove() {
    int diff;
    int countO = 0;
    int countX = 0;
    for (int row = 0; row < board.getSize(); row++) {
      for (int col = 0; col < board.getSize(); col++) {
        if (board.getPlayer(row, col) == Player.O) {
          ++countO;
        }
        if (board.getPlayer(row, col) == Player.X) {
          ++countX;
        }
      }
    }
    // Fail if one player has made too many moves compared to the other
    if (countO > countX) {
      int tmp = countO;
      countO = countX;
      countX = tmp;
    }
    diff = Math.abs(countO - countX);
    if (diff > 1) {
      throw new IllegalArgumentException("One player has made too many moves");
    }
    return true;
  }

  /**
   * Check Winner.
   *
   * @return winner as char.
   */

  public char checkWinner() {
    if (isValidMove()) {
      // check if a row has won
      for (int row = 0; row < board.getSize(); row++) {
        int col = 0;
        if (board.getPlayer(row, col) == board.getPlayer(row, col + 1)
            && board.getPlayer(row, col) == board.getPlayer(row, col + 2)) {
          if (board.getPlayer(row, col) == Player.O) {
            return 'O';
          } else if (board.getPlayer(row, col) == Player.X) {
            return 'X';
          }
        }
      }

      // Check if a col has won
      for (int col = 0; col < board.getSize(); col++) {
        int row = 0;
        if (board.getPlayer(row, col) == board.getPlayer(row + 1, col)
            && board.getPlayer(row, row) == board.getPlayer(row + 2, col)) {
          if (board.getPlayer(row, row) == Player.O) {
            return 'O';
          } else if (board.getPlayer(row, row) == Player.X) {
            return 'X';

          }
        }
      }

      // Check if major diagonal has won
      if (board.getPlayer(0, 0) == board.getPlayer(1, 1) && board.getPlayer(0, 0) == board
          .getPlayer(2, 2)) {
        if (board.getPlayer(0, 0) == Player.O) {
          return 'O';
        } else if (board.getPlayer(0, 0) == Player.X) {
          return 'X';
        }
      }

      // Check if minor diagonal has won
      if (board.getPlayer(2, 0) == board.getPlayer(1, 1) && board.getPlayer(2, 0) == board
          .getPlayer(0, 2)) {
        if (board.getPlayer(2, 0) == Player.O) {
          return 'O';
        } else if (board.getPlayer(2, 0) == Player.X) {
          return 'X';
        }
      }
    }

    // Neither player has won yet
    return '-';
  }
}
