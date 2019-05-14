package com.diffblue.javademo;

    import com.commons.standard.BaseEnum;

public class StandardEnum extends BaseEnum {

  public static final StandardEnum CAR =
      new StandardEnum(1, "BMW");
  public static final StandardEnum BIKE =
      new StandardEnum(2, "Harley");
  public static final StandardEnum AEROPLANE =
      new StandardEnum(3, "Boeing");

  public StandardEnum(int id) {
    super(id);
  }

  public StandardEnum(int id, String name) {
    super(id, name);
  }

}
