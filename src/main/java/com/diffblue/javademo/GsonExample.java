package com.diffblue.javademo;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {

  public String convertJson() throws IOException {
    Gson gson = new Gson();
    try (Reader reader = new FileReader("c:\\projects\\user.json")) {
      // Convert JSON File to Java Object
      UserAccess user = gson.fromJson(reader, UserAccess.class);
      return user.toString();
    } catch (IOException e) {
      e.printStackTrace();
      throw new IOException(e);
    }
  }
}