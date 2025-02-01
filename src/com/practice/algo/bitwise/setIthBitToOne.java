package com.practice.algo.bitwise;

public class setIthBitToOne {
  
  public static void main(String[] args) {
    String s = "0P";
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    System.out.println(isPalindromeRec(s, 0, s.length() - 1));
    
  }
  
  public static boolean isPalindromeRec(String s, int start, int end) {
    if (start >= end)
      return true;
    return (s.charAt(start) == s.charAt(end)) && isPalindromeRec(s, start + 1, end - 1);
  }
}
