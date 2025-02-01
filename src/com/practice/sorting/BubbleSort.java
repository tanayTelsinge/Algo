package com.practice.sorting;

public class BubbleSort {
  
  public static void main(String[] args) {
  
    int[] array = {2,6,1,7,8,6};
    int n = array.length;
    
    for(int i = 0; i < n - 1; i++) {
      boolean swapped = false;
      for(int j = i + 1; j < n; j++) {
        if(array[j] < array[i]) {
          //swap
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
          swapped = true;
        }
      }
      // No swaps means the array is sorted
      if(!swapped) break;
    }
  
    for(int element : array) {
      System.out.print(element + " ");
    }
  }
}
