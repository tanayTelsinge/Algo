package com.practice.sorting;

public class MergeSort {
  // Sample array: {64, 34, 25, 12, 22, 11, 90}
  //  Index:        0   1   2   3   4   5   6
  public static void main(String[] args) {
    int[] arr = {64, 34, 25, 12, 22, 11, 90};
    mergeSort(arr, 0, arr.length - 1);

    for (int num : arr) {
      System.out.println(num + " ");
    }
  }

  public static void mergeSort(int[] arr, int low, int high) {
    int mid = low + (high - low) / 2;
    mergeSort(arr, low, mid);
    mergeSort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void merge(int[] arr, int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = high;
    int[] temp = new int[arr.length];
    while(i <= mid && j < k){
      if(arr[i] < arr[j]){
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }

    while(i <= mid){
      temp[k] = arr[i];
      i++;
      k++;
    }

    while(j <= high){
      temp[k] = arr[j];
      j++;
      k++;
    }

    for(int m = low; m <= high; m++){
      arr[m] = temp[m];
    }
  }
}
