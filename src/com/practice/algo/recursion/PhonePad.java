package com.practice.algo.recursion;

public class PhonePad {
  
  public static void main(String[] args) {
    pad("", "12");
  }
  
  public static void pad(String p, String u) {
    if(u.isEmpty()) {
      System.out.println(p);
      return;
    }
    
    int digit = Integer.parseInt(u.charAt(0) + "");
    for(int i = (digit - 1) * 3; i < digit * 3; i++) {;
      char ch = (char) ('a' + i);
      System.out.println(ch);
      pad(p + ch, u.substring(1));
    }
  }
}
