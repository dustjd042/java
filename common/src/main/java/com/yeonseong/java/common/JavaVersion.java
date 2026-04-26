package com.yeonseong.java.common;

public class JavaVersion {

  public static void print() {
    System.out.println("Java Version: " + System.getProperty("java.version"));
    System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    System.out.println("Java Home: " + System.getProperty("java.home"));
  }
}