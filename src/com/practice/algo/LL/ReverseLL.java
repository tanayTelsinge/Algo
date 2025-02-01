package com.practice.algo.LL;

/**
 * Class to reverse a linked list iteratively and recursively
 * 
 * Time Complexity:
 * - Iterative reversal: O(n) where n is number of nodes
 * - Recursive reversal: O(n) where n is number of nodes
 * 
 * Space Complexity:
 * - Iterative reversal: O(1) as only uses constant extra space
 * - Recursive reversal: O(n) due to recursive call stack
 */
public class ReverseLL {
    
    /**
     * Reverses linked list iteratively
     * Uses three pointers to track previous, current and next nodes
     * @param head Head of linked list
     * @return New head after reversal
     */
    public Node reverseLL(Node head){
      Node prev = null;
      Node curr = head;
      Node next = null;
      
      while(curr != null){
        next = curr.next;      // Store next node
        curr.next = prev;      // Reverse current node's pointer
        prev = curr;           // Move prev pointer one step forward
        curr = next;           // Move current pointer one step forward
      }
      head = prev;             // Update head to last node
      return head;
    }

    /**
     * Reverses linked list recursively
     * Recursively reaches end of list and reverses links while backtracking
     * @param head Head of linked list
     * @return New head after reversal
     */
    public Node recursiveReverse(Node head) {
      if (head == null || head.next == null) {
        return head;
      }
      
      Node newHead = recursiveReverse(head.next);
      head.next.next = head;   // Reverse link of next node
      head.next = null;        // Set current node's next to null
      
      return newHead;
    }
    
    public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ReverseLL rll = new ReverseLL();
      int[] arr = {1, 2, 3, 4, 5};
      Node head = ll.arrToLinkedList(arr);
      ll.printLL(head);
      System.out.println();
      head = rll.reverseLL(head);
      ll.printLL(head);
    }
}
