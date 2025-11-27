package com.tcs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("JUnit Test")
public class MainTest {

  @DisplayName("TCS")
  @Test
  public void testMain() {
    Main mainTest = new Main();
    Integer type = mainTest.getType("12345678901");
    System.out.println(type);
  }

  @DisplayName("AJ")
  @ParameterizedTest
  @NullSource
  @ValueSource(strings = {"00","00000000000","11111111111","12345678901"})
  public void testMain2(String number) {
    Main mainTest = new Main();
    Integer type = mainTest.getType(number);

    Assertions.assertEquals(1, type);
    System.out.println(type);
  }
}
