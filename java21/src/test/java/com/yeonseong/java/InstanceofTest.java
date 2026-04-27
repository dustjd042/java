package com.yeonseong.java;

import org.junit.jupiter.api.Test;

public class InstanceofTest {

  record User (String name, String job) {}

  @Test
  public void recordInstanceOf() {
    Object object = new User("YeonSeong", "Programmer");
    if (object instanceof User(String n, String j)) {
      System.out.println("Name: " + n +  "Job" + j);
    }
  }

}
