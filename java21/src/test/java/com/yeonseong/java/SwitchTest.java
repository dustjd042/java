package com.yeonseong.java;

import org.junit.jupiter.api.Test;

public class SwitchTest {

  @Test
  public void _null() {

    Integer day = null;

    switch (day) {
      case null -> System.out.println("알 수 없음");
      case 1 -> System.out.println("월요일");
      case 2 -> System.out.println("화요일");
      case 3 -> System.out.println("수요일");
      default -> System.out.println("알 수 없음");
    }
  }

  @Test
  public void pattern() {

    Object object = "switch test";

    switch (object) {
      case null -> System.out.println("알 수 없음");
      case String s when s.length() > 5 -> System.out.println(s);
      case String s when s.length() > 10 -> System.out.println(s);
      case Integer i -> System.out.println(i);
      default -> System.out.println("알 수 없음");
    }
  }

}
