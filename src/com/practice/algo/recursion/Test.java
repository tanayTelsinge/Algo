package com.practice.algo.recursion;

public class Test {
  
  public static int sum(int n) {
    if( n == 0 ){
      return 0;
    }
    return n + sum(n - 1 );
  }
  
  public static String reverseString(String s){
    if(s.isEmpty()) return "";
    return reverseString(s.substring(1)) + s.charAt(0);
  }
  public static boolean palindrome(String s) {
    if (s.length() == 0 || s.length() == 1) {
      return true;
    }
    return s.charAt(0) == s.charAt(s.length() - 1) ? palindrome(s.substring(1, s.length() - 1)) : false;
  }
  
  public static int fibonacci(int n) {
    if(n < 2){
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  

  public static void reverseArray(int [] arr, int l, int r) {
    if(l >= r ){
      return;
    }
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    reverseArray(arr, l + 1, r - 1);
  }
  
  public static int fibonacciOptimizedWrapper(int n) {
    int[] mem = new int[n + 1];
   return fibonacciOptimized(n, mem);
  }
  
  private static int fibonacciOptimized(int n, int[] mem) {
    if(mem[n] > 0){
      return mem[n];
    }
    if(n < 2) {
      mem[n] = n;
      return mem[n];
    }
    mem[n] = fibonacciOptimized(n - 2, mem) + fibonacciOptimized(n - 1, mem);
    return mem[n];
  }
  
  public static int sumofNaturalNumbers(int n){
    if(n == 0){
      return 0;
    }
    return sumofNaturalNumbers(n - 1) + n;
  }
  
  public static int binarySearch(int[] arr, int l, int r, int key){
    if(l > r){
      return -1;
    }
 //   int mid = (l + r) / 2;
    int mid = l + (r - l) / 2;
    if(arr[mid] == key) {
      return mid;
    } else if (arr[mid] > key){
      return binarySearch(arr, l, mid - 1, key);
    } else {
      return binarySearch(arr, mid + 1, r, key);
    }
  }
  // 1  - 2 - 3 - 4
  public static Node reverseLinkedList(Node node){
    if (node == null || node.next == null) {
      return node;
    }
    Node p = reverseLinkedList(node.next);
    node.next.next = node;
    node.next = null;
    return p;
  }
  
  public static String removeChar(String s, String a) {
    if(s.isEmpty()){
      return s;
    }
    String s1 = String.valueOf(s.charAt(1));
    if(s.charAt(0) == a.charAt(0)){
      return s1;
    }
    return s.charAt(0) + removeChar(s.substring(1), a);
  }
  
  
  public static Node swapPairs(Node head) {
    if(head == null || head.next == null) {
      return head;
    }
    swapPairs(head.next.next);
    Node first = head;
    Node second = head.next;
    head = second;
    first.next = null;
    head.next = first;
    return second;
  }
}
