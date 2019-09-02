package com.diffblue.javademo;

import com.diffblue.javademo.TicTacToe;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TicTacToeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void checkTicTacToePositionInput8OutputIllegalArgumentException()
      throws IllegalArgumentException {

    // Arrange
    final TicTacToe ticTacToe = new TicTacToe();
    final int[] board = {32, 0, 0, 0, 0, 0, 0, 0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    ticTacToe.checkTicTacToePosition(board);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkTicTacToePositionInput9OutputIllegalArgumentException()
      throws IllegalArgumentException {

    // Arrange
    final TicTacToe ticTacToe = new TicTacToe();
    final int[] board = {32, 0, 0, 0, 0, 0, 0, 0, 0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    ticTacToe.checkTicTacToePosition(board);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkTicTacToePositionInput9OutputIllegalArgumentException2()
      throws IllegalArgumentException {

    // Arrange
    final TicTacToe ticTacToe = new TicTacToe();
    final int[] board = {0, 0, 3, 0, 0, 0, 0, 0, 0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    ticTacToe.checkTicTacToePosition(board);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkTicTacToePositionInput9OutputIllegalArgumentException3()
      throws IllegalArgumentException {

    // Arrange
    final TicTacToe ticTacToe = new TicTacToe();
    final int[] board = {1, 2, 3, 0, 1, 0, 0, 0, 0};

    // Act
    thrown.expect(IllegalArgumentException.class);
    ticTacToe.checkTicTacToePosition(board);

    // The method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkTicTacToePositionInput9OutputIllegalArgumentException4()
      throws IllegalArgumentException {

    // Arrange
    final TicTacToe ticTacToe = new TicTacToe();
    final int[] board = {1, 1, 1, 1, 1, 1, 1, 1, 1};

    // Act
    thrown.expect(IllegalArgumentException.class);
    ticTacToe.checkTicTacToePosition(board);

    // The method is not expected to return due to exception thrown
  }
}
