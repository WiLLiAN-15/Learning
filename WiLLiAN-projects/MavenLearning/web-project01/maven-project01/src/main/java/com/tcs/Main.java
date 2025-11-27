package com.tcs;

public class Main {
  public static void main(String[] args) {
  }

  public Integer getType(String number) {
    if (number == null || number.length() != 11) {
      throw new IllegalArgumentException(("無効なパラメータ"));
    }

    String type = number.substring(8,9);
    if (type.equals("0")) {
      return 1;
    } else if (type.equals("1")) {
      return 2;
    } else {
      return 3;
    }
  }
}