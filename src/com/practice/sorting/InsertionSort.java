package com.practice.sorting;

/**
 * Insertion Sort Algorithm
 * 
 * Workflow:
 * 1. Iterate through array starting from index 1
 * 2. For each element (key), compare with previous elements
 * 3. Shift larger elements to the right to make space for the key
 * 4. Insert the key in its correct position
 * 
 * Time Complexity:
 * - Best Case: O(n) when array is already sorted
 * - Average Case: O(n²)
 * - Worst Case: O(n²) when array is reverse sorted
 * 
 * Space Complexity: O(1) - In-place sorting algorithm
 */
public class InsertionSort {
  
  public static void main(String[] args) {
    int[] array = {5, 2, 4, 6, 1, 3};
  
    int n = array.length;
    
    // Outer loop: iterate through array starting from second element
    for(int i = 1; i < n; i++) {
      // Store current element as key to be inserted
      int key = array[i];
      
      // Inner loop: shift elements that are greater than key
      int j = i - 1;
      while(j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      // Place key in its correct position
      array[j + 1] = key;
    }
    
    // Print sorted array
    for(int element : array) {
      System.out.print(element + " ");
    }
  }
}
