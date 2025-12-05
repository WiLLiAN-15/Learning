package com.tcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyTest {

  @ParameterizedTest
  @CsvSource({
      "00000000000, 1",
      "11111111111, 2",
      "22222222222, 3",
  })
  public void mainTest(String number, Integer expected) {
    Main mainTest = new Main();
    Assertions.assertEquals(expected, mainTest.getType(number));
  }
}
