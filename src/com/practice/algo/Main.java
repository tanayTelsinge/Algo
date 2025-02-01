package com.practice.algo;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
  
    List<Integer> arr = Arrays.asList(3, 5, 6, 8, 10, 14, 16, 20, 26, 32, 40, 42);
    int key = 3;
    //Binary Search
    int index = BinarySearch.bsIterative(arr, key);
    printBsResult(key, index);
    
    index = BinarySearch.bsRecursive(0, arr.size() - 1, arr, key);
    printBsResult(key, index);
  
    int mergeArr[] = { 12, 11, 13, 5, 6, 7 };
    
   // MergeSort.mergeSort(mergeArr, 0, mergeArr.length - 1);
  }
  
  private static void printBsResult(int key, int index) {
    if(index == -1){
      System.out.println("not present");
    } else {
      System.out.println("Key : " + key + " is at index " + index);
    }
  }
}