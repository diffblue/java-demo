package com.diffblue.javademo.tictactoe;

public class Board {

  private Player[][] board;

  /**
   * Create a board when the board size is TicTacToe playable.
   * size (row=col) needs to be odd number and have to be larger than 3.
   *
   * @param size row/col
   */
  public Board(int size) {
    // Check if the board is TicTacToe playable
    if (size % 2 == 0 || size <= 1) {
      throw new IllegalArgumentException("The board size has to be odd number and larger than 3.");
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
   * Get player value for specified cel location.
   *
   * @param row row
   * @param col col
   * @return Player
   */
  public Player getPlayer(int row, int col) {
    if (row < 0 || col < 0 || row >= board.length || col >= board.length) {
      throw new IllegalStateException("The specified [row][col] is out of range of the board.");
    } else {
      return board[row][col];
    }
  }

  /**
   * Set Player.
   *
   * @param row row
   * @param col col
   */
  public void setPlayer(Player player, int row, int col) {
    if (row < 0 || col < 0 || row >= board.length || col >= board.length) {
      throw new IllegalStateException("The specified [row][col] is out of range of the board.");
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
