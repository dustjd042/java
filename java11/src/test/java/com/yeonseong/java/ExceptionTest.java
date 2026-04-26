package com.yeonseong.java;

import org.junit.jupiter.api.Test;

public class ExceptionTest {

  @Test
  public void nullPointException () {
    Integer a = null;
    int b = 100;
    System.out.println(a + b);
  }
}