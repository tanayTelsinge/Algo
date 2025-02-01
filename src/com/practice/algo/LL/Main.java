package com.practice.algo.LL;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    LinkedList ll = new LinkedList();
    Node head = ll.arrToLinkedList(arr);
    ll.printLL(head);
    int choice;
    Scanner sc = new Scanner(System.in);
    System.out.println("Select options : \n 1. Insert a node \n.2. Delete a node \n. ");
    System.out.println("Enter choice : ");
  }
}
