package com.yeonseong.java;

import java.util.*;
import org.junit.jupiter.api.Test;

public class InstanceofTest {

  @Test
  public void instaceof() {

    Object object = "---> Hello Java <---";

    if (object instanceof String s) {
      System.out.println("-> " + s);
      System.out.println("-> " + s.repeat(10));
    }
  }

}
