package com.practice.algo.recursion;

import java.util.stream.Stream;

public class Main {
  
  public static void main(String[] args) {
  
    System.out.println(fact(4));
    fibonacci(2);
    System.out.println(Test.sum(50));
    
    //reverse array
    int[] arr = {1, 2, 3 , 4, 5, 6, 7};
    Test.reverseArray(arr, 0, arr.length - 1);
    
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  
    //Palindrome
    System.out.println();
    System.out.print("Palindrome test : "  + Test.palindrome("MADAM"));
    System.out.println();
    
    //String reverse
    System.out.println("String reverse : " + Test.reverseString("Tanay"));
    System.out.println("fibonacci : ");
    long startTime = System.nanoTime();
    int n = 10;
    for(int i = 1; i <= n; i++){
      System.out.print(Test.fibonacci(i) + " ");
    }
    long endTime = System.nanoTime();
    System.out.println("Total time taken : " + (endTime - startTime)/1000);
    System.out.println();
    startTime = System.nanoTime();
    for(int i = 1; i <= n; i++){
      System.out.print(Test.fibonacciOptimizedWrapper(i) + " ");
    }
    endTime = System.nanoTime();
    System.out.println("Total time taken : " + (endTime - startTime)/1000);
    System.out.println();
    System.out.println("Sum of Natural Numbers : ");
    System.out.println(Test.sumofNaturalNumbers(5));
  
    int[] bsearchArr = {1, 2, 5, 7, 8 , 11, 12};
    System.out.println("Binary search : ");
    System.out.println(Test.binarySearch(bsearchArr, 0, arr.length - 1, 12));
    
    //Reverse LL
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    
    printLL(head);
    Node newHead = Test.reverseLinkedList(head);
    printLL(newHead);
    
    String s = "baccad";
    System.out.println(Test.removeChar(s, "a"));
  
  
    Node testHead = new Node(1);
    testHead.next = new Node(2);
    testHead.next.next = new Node(3);
    testHead.next.next.next = new Node(4);
  
    System.out.println(removeChar("abaccdza", 'a'));
  }
  
  private static void printLL(Node node) {
    System.out.print("Printing LL : ");
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }
  
  public static String removeChar(String s, char c) {
    if(s == null){
      return s;
    }
    String ans = new String();
     if(s.charAt(0) != c) ans+=s.charAt(0);
     if(s.length() == 1) return ans;
     return ans + removeChar(s.substring(1), c);
  }
  
  public static int fact(int n) {
    if(n == 1) return 1;
    return n * fact(n - 1);
  }
  
  public static int fibonacci(int n) {
    //0, 1, 1, 2, 3, 5, 8, 13, 21
    if(n == 1 || n == 0) {
      return n;
    }
    return fibonacci(n - 1)  +  fibonacci(n - 2);
  }
  

}
