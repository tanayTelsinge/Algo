package com.practice.sorting;

import java.util.Arrays;

/**
 * QuickSort implementation
 * Time Complexity: 
 * - Best/Average case: O(n log n) - when partition splits array roughly in half each time
 * - Worst case: O(n^2) - when array is already sorted or reverse sorted
 * 
 * Space Complexity:
 * - O(log n) average case for recursion stack
 * - O(n) worst case for recursion stack
 * - O(1) auxiliary space as sorting is done in-place
 */
public class QuickSort {
  
  public static void main(String[] args) {
    int[] array = {5, 2, 6 , 1, 3, 4};
    
    quickSort(array, 0, array.length - 1);
    
    // Print sorted array
    for(int element : array) {
      System.out.print  (element + " ");
    }
  }
  
  /**
   * Recursively sorts array by partitioning around pivot
   * @param array Array to sort
   * @param low Starting index
   * @param high Ending index
   */
  private static void quickSort(int[] array, int low, int high) {
    if(low < high) {
      // Get partition index and sort subarrays
      int partitionIndex = partition(array, low, high);
      quickSort(array, low, partitionIndex - 1);  // Sort left half
      quickSort(array, partitionIndex + 1, high); // Sort right half
    }
  }
  
  /**
   * Partitions array around pivot (first element)
   * Places smaller elements to left of pivot and larger to right
   * @param array Array to partition
   * @param low Starting index
   * @param high Ending index
   * @return Final position of pivot
   */
  private static int partition(int[] array, int low, int high) {
    int i = low;  // Left pointer
    int j = high; // Right pointer
    int pivot = array[low]; // Choose first element as pivot
    
    while(i < j) {
      // Find element on left greater than pivot
      while(array[i] <= pivot && i <= high) i++;
      // Find element on right smaller than pivot
      while(array[j] > pivot && j >= low) j--;
      
      // Swap elements if pointers haven't crossed
      if (i < j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    
    // Place pivot in its final position
    int temp = array[low];
    array[low] = array[j];
    array[j] = temp;
    return j;
  }

  /*
   * Flow of quickSort:
   * 1. Choose pivot (first element)
   * 2. Partition array:
   *    - Move elements smaller than pivot to left side
   *    - Move elements larger than pivot to right side
   *    - Place pivot in final sorted position
   * 3. Recursively sort left and right subarrays:
   *    - quickSort(left half)
   *    - quickSort(right half)
   * 4. Continue until subarrays are size 1 or empty
   *
   * Example array: [5,2,9,1,7,6,3]
   * First partition:
   * - Pivot = 5 (first element)
   * - i starts at index 0, j starts at index 6
   * - Step 1: i finds 7 (> pivot), j finds 3 (< pivot), swap -> [5,2,3,1,7,6,9]
   * - Step 2: i finds 7 (> pivot), j finds 1 (< pivot), swap -> [5,2,3,1,7,6,9]
   * - Step 3: i finds 7 (> pivot), j at 1 (< pivot), pointers crossed
   * - Final step: swap pivot with j position -> [1,2,3,5,7,6,9]
   * - 5 is now in correct position (index 3)
   * - Recursively sort left half [1,2,3] and right half [7,6,9]
   */
}
