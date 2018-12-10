package com.diffblue.javademo.tictactoe;


public class Board {

  private Player[][] board;

  /**
   * Initialize board.
   *
   * @param size row
   */
  public Board(int size) {
    // Check if the board is TicTacToe playable
    if (size % 2 == 0 || size <= 1) {
      throw new IllegalArgumentException("The board is not suited to play TicTacToe.");
    } else {
      // Initialize board
      this.board = new Player[size][size];
      for (int row = 0; row < size; row++) {
        for (int col = 0; col < board[0].length; col++) {
          setPlayer(Player.empty, row, col);
        }
      }
    }
  }


  /**
   * Get player value.
   *
   * @param row row
   * @param col col
   * @return Player
   */
  public Player getPlayer(int row, int col) {
    if (row < 0 || col < 0) {
      throw new IllegalStateException("The board is invalid");
    } else {
      return board[row][col];
    }
  }

  /**
   * Get row of Player.
   *
   * @param row row
   * @return Player[]
   */
  public Player[] getPlayerRow(int row) {
    if (row < 0) {
      throw new IllegalStateException("The board is invalid");
    } else {
      return board[row];
    }
  }

  /**
   * Set Player.
   *
   * @param row row
   * @param col col
   */
  public void setPlayer(Player player, int row, int col) {
    if (row < 0 || col < 0) {
      throw new IllegalStateException("The board is invalid");
    } else {
      this.board[row][col] = player;
    }
  }

  /**
   * Get board size.
   *
   * @return board length
   */

  public int getSize() {
    return this.board.length;
  }

}

