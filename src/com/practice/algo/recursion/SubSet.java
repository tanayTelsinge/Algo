package com.practice.algo.recursion;

import java.util.ArrayList;

public class SubSet {
  
  public static void main(String[] args) {
  
    String s = "abc";
    
   // subset("", s);
    
    int[] arr = {1,2,3};
    subsetWithReturningList("", s).stream().forEach(System.out::println);
  }
  
  private static void subset(String processed, String unprocessed) {
    if(unprocessed.isEmpty()) {
      System.out.println(processed);
      return;
    }
    
    char ch = unprocessed.charAt(0);
    
    subset(processed + ch, unprocessed.substring(1));
    subset(processed, unprocessed.substring(1));
  }
  
  
  private static ArrayList<String> subsetWithReturningList(String processed, String unprocessed) {
    if(unprocessed.isEmpty()) {
      ArrayList<String> res = new ArrayList<>();
      res.add(processed);
      return res;
    }
    
    char ch = unprocessed.charAt(0);
    ArrayList<String> left = subsetWithReturningList(processed + ch, unprocessed.substring(1));
    ArrayList<String> right = subsetWithReturningList(processed, unprocessed.substring(1));
    left.addAll(right);
    return left;
  }
  
  
}
