package com.commons.standard;

public class BaseEnum {
  private int id;
  private String name;

  public BaseEnum(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public BaseEnum(int id) {
    this.id = id;
  }
}
