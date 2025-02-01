package com.practice.algo.LL;

public class LinkedList {
  
  Node head;
  /**
   * Takes array and converts it to linked list
   * @param arr
   * @return head of linked list
   */
  public Node arrToLinkedList(int[] arr){
    this.head = new Node(arr[0]);
    Node temp = head;
    for(int i = 1; i < arr.length; i++){
      temp.next = new Node(arr[i]);
      temp = temp.next;
    }
    return head;
  }
  
  public void printLL(Node head){
    Node temp;
    temp = head;
    while( temp != null ){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}
