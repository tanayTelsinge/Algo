package com.practice.algo;

import java.util.List;

public class BinarySearch {
  
  //iterative
  public static int bsIterative(List<Integer> arr, int key) {
    int l = 0, h = arr.size() - 1;
  
    while (l <= h) {
      int mid = (l + h) / 2;
      if (arr.get(mid) == key) { return mid; }
      if (arr.get(mid) < key) { l = mid + 1;}
      else { h = mid - 1; }
    }
    return -1;
  }
  
  //recursive
  public static int bsRecursive(int l, int h, List<Integer> arr, int key){
    //exit condition
    if ( l > h){
      return -1;
    }
    int mid = (l + h) / 2;
    if(arr.get(mid) == key) {
      return mid;
    } else if(arr.get(mid) < key){
      return bsRecursive(mid + 1, h, arr, key);
    } else {
      return bsRecursive(l, mid - 1, arr, key);
    }
  }
}
