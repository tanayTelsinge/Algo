package com.practice.sorting;

import java.util.Arrays;

public class SelectionSort {
  
  public static void main(String[] args) {
    
    int[] array = {2,6,1,7,8,6};
    
    for(int i = 0; i < array.length - 1; i++) {
      int minValueIndex = i;
      for(int j = i + 1; j < array.length; j++) {
        if(array[j] < array[minValueIndex]) {
          minValueIndex = j;
        }
      }
      int temp = array[i];
      array[i] = array[minValueIndex];
      array[minValueIndex] = temp;
    }
  
    for(int element : array) {
      System.out.print(element + " ");
    }
    
  }
}
