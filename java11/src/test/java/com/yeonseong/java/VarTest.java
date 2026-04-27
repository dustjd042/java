package com.yeonseong.java;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.jupiter.api.Test;

public class VarTest {

  @Test
  public void type () throws MalformedURLException {

    var score = Integer.valueOf(100);
    System.out.println("score -> " + score.getClass());

    var text = "Hello Test";
    System.out.println("text -> " + text.getClass());

    var url = new URL("http:://www.google.com");
    System.out.println("url -> " + url.getClass());
  }

}
