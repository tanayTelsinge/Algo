package com.practice.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {
  
  /**
   * find max sum for subarray of fixed size k
   * @param arr
   * @param k
   */
  public static int findMaxSumSubArray(int[] arr, int k) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    if(arr.length <= k) {
      return -1;
    }
    int l = 0, r = 0;
    while(l <= r && r < arr.length){
      int diff = r - l;
      if( diff < k) {
        currSum += arr[r];
        maxSum = Math.max(currSum, maxSum);
        r++;
      } else {
        currSum -= arr[l];
        l++;
      }
    }
    return maxSum;
  }
  
  public static int findMaxSumSubArrayOpt(int[] arr, int k) {
    int maxSum = Integer.MIN_VALUE;
    int currSum = 0;
    int n = arr.length;
    
    // Check if the length of the array is less than or equal to k
    if (n <= k) {
      return -1;
    }
    
    // Calculate the sum of the first k elements to initialize currSum
    for (int i = 0; i < k; i++) {
      currSum += arr[i];
    }
    
    // Slide the window to calculate the maximum sum
    for (int i = k; i < n; i++) {
      int leftElement = arr[i];
      int rightElement = arr[i - k];
      currSum = currSum + leftElement - rightElement ; // Add the next element and remove the leftmost element of the window
      maxSum = Math.max(maxSum, currSum);
    }
    
    return maxSum;
  }
  
  public static int minSubArrayGreaterThanTargetSum(int[] arr, int targetSum) {
    int minSubArraySize = Integer.MAX_VALUE;
    int currSum = 0;
    int l = 0;
    for(int r = 0; r < arr.length; r++){
      currSum += arr[r];
      while( currSum >= targetSum ){
        minSubArraySize = Math.min(minSubArraySize, r - l + 1);
        currSum -= arr[l];
        l++;
      }
    }
    return minSubArraySize;
  }
  
  public static int findLength(String str, int k) {
    int windowStart = 0, maxLength = 0;
    Map<Character, Integer> charFrequencyMap = new HashMap<>();
    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
      char rightChar = str.charAt(windowEnd);
      charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
  
      while (charFrequencyMap.size() > k) {
        char leftChar = str.charAt(windowStart);
        charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
        if (charFrequencyMap.get(leftChar) == 0) {
          charFrequencyMap.remove(leftChar);
        }
        windowStart++;
      }
      maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
    }
    return maxLength;
  }
  
  /**
   * Example 1:
   *
   * Input: s = "abcabcbb"
   * Output: 3
   * Explanation: The answer is "abc", with the length of 3.
   * Example 2:
   *
   * Input: s = "bbbbb"
   * Output: 1
   * Explanation: The answer is "b", with the length of 1.
   * @param s
   * @return length
   */
  public static int lengthOfLongestSubstring(String s) {
   return 0;
  }
}
