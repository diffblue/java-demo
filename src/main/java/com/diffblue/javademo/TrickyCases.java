package com.diffblue.javademo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class TrickyCases {

  /**
   * Delete a file.
   **/
  public static boolean deleteFile(String filename) throws IOException {
    File file = new File("target");
    file.delete();
    return true;
  }

  /**
   * Open a file.
   **/
  public static boolean openFile(String filename) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader("target"));
    String line;
    while ((line = reader.readLine()) != null) {
    }
    reader.close();
    return true;
  }

  /**
   * Create a new file.
   **/
  public static boolean createFile(String filename) throws IOException {
    File file = new File("target");
    file.createNewFile();
    return true;
  }

  /**
   * Return a random number.
   **/
  public static double random() {
    return Math.random();
  }

  /**
   * Return the current date.
   **/
  public static Date now() {
    return new Date();
  }

}
