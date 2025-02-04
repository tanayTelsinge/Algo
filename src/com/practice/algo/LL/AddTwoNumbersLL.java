/**
 * This class provides a method to add two numbers represented by linked lists.
 * Each node in the linked lists contains a single digit, and the digits are stored in reverse order.
 * The method returns a new linked list representing the sum of the two numbers.
 *
 * Time Complexity: O(max(m, n)), where m and n are the lengths of the two linked lists.
 * Space Complexity: O(max(m, n)), where m and n are the lengths of the two linked lists.
 */
package com.practice.algo.LL;


public class AddTwoNumbersLL {

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode temp = result;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;
      carry = sum / 10;
      temp.next = new ListNode(sum % 10);
      temp = temp.next;
    }

    if (carry > 0) {
      temp.next = new ListNode(carry);
    }
    return result.next;
  }

  /**
   * The main method to test the addTwoNumbers function.
   * It creates two linked lists, adds them, and prints the result.
   */
  public static void main(String[] args) {
    AddTwoNumbersLL adder = new AddTwoNumbersLL();
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);
    ListNode result = adder.addTwoNumbers(l1, l2);

    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }
}