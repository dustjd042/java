package com.yeonseong.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;

public class SequencedCollectionTest {

  @Test
  public void sequencedCollection() {

    // list 경우 sequencedCollection 상속 받는다.
    List<String> list = new ArrayList<>();

    System.out.println("=== add ===");
    list.add("2");
    list.addFirst("1");
    list.addLast("3");
    list.add("4");
    list.forEach(x -> System.out.println("-> " + x));

    System.out.println("=== remove ===");
    list.removeFirst();
    list.removeLast();
    list.forEach(x -> System.out.println("-> " + x));

    System.out.println("fisrt: " + list.getFirst() + " last: " + list.getLast());

    System.out.println("=== reversed ===");
    list.reversed().forEach(x -> System.out.println("-> " + x));

    // reversed() 경우 새 콜렉션을 생성하지 않음
    List<String> reverseList = list.reversed();
    reverseList.removeLast();
    list.removeLast();

    System.out.println("=== list ===");
    list.forEach(x -> System.out.println("-> " + x));

    System.out.println("=== reverse ===");
    reverseList.forEach(x -> System.out.println("-> " + x));
  }

  @Test
  public void sequencedSet() {

    // LinkedHashSet의 경우 add 순서를 유지
    System.out.println("=== LinkedHashSet ===");
    SequencedSet<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("2");

    System.out.println("=== add ===");
    linkedHashSet.addLast("1");
    linkedHashSet.addFirst("3");
    linkedHashSet.forEach(x -> System.out.println("-> " + x));

    System.out.println("=== remove ===");
    linkedHashSet.removeFirst();
    linkedHashSet.removeLast();
    linkedHashSet.forEach(x -> System.out.println("-> " + x));

    // TreeSet의 경우 정렬 순서에 따라서 보관 -> addFist, addLast 미지원
    System.out.println("=== TreeSet ===");
    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("2");
    treeSet.add("3");
    treeSet.add("1");
    treeSet.addFirst("100"); // 미지원 에러 발생!!!
  }

  @Test
  public void sequencedMap() {

    System.out.println("=== LinkedHashMap ===");
    SequencedMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(2, "B");
    linkedHashMap.putLast(3, "C");
    linkedHashMap.putFirst(1, "A");
    linkedHashMap.forEach((k, v) -> System.out.println(k + " -> " + v));

    System.out.println("=== sequencedMap ===");
    SequencedMap<Integer, String> hashMap = new TreeMap<>();
    hashMap.putFirst(1, "A");  // 미지원 에러 발생!!!
  }
}
