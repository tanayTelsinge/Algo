package com.practice.algo.slidingwindow;

public class Main {
  public static void main(String[] args) {
    int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
    
    int k = 2;
    int sum = SlidingWindow.findMaxSumSubArrayOpt(arr, k);
    System.out.println("Max sum of subarray of size " + k + " : " + sum);
 
    //smallest subarray having sum >= 8
    int targetSum = 8;
    int minWindowSize = SlidingWindow.minSubArrayGreaterThanTargetSum(arr, targetSum);
    System.out.println("Min window size for target sum >= " + targetSum + " : " + minWindowSize);
    
    String s = "abcabcbb";
    System.out.println(SlidingWindow.lengthOfLongestSubstring(s));
  }
  
}
