package com.practice.algo.LL;

/**
 * This class represents a linked list and provides methods 
 * to find the nth node from the end of the list.
 * 
 * Intuition -> Two pointers, gap between fast and slow pointer is n.
 * 
 * Why it works -> imagine a bangle on rod, if its 2 size thick fit from front, it will fit from back as well of same size.
 */
public class FindNthFromEndLL {

  /**
   * This inner class represents a node in the linked list.
   */
  public static class ListNode {
    int val;
    ListNode next;

    /**
     * Constructs a new ListNode with the given value.
     * @param val the value of the node
     */
    public ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  /**
   * The main method to test the functionality of the linked list.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.println(findNthFromEnd(head, 2));
  }

  public static void deleteNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode slow = dummy;
    ListNode fast = dummy;

    // Move the fast pointer n nodes ahead
    for (int i = 0; i <= n; i++) {
      fast = fast.next;
    }

    // Move both pointers until the fast pointer reaches the end
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    // Delete the nth node from the end
    slow.next = slow.next.next;
  }
  public static int findNthFromEnd(ListNode head, int n) {
    ListNode slow = head;
    ListNode fast = head;

    for(int i = 0; i < n; i++) {
      fast = fast.next;
    }

    while(fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow.val;
  }
}
