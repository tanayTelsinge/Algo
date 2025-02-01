package com.practice.algo.LL;

public class MergeTwoLists {

  // ListNode class definition
  static class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
      this.val = val;
    }
  }

  public static void main(String[] args) {
    // Create the first linked list: 1 -> 2 -> 4
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    // Create the second linked list: 1 -> 3 -> 4
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode list3 = mergeTwoLists(l1, l2);
    System.out.println("--------------");
    while(list3 != null) {
      System.out.print(list3.val + " ");
      list3 = list3.next;
    }
  }

  public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode list3 = new ListNode(-1);
    ListNode head = list3;
    while(list1 != null && list2 != null) {
      System.out.println(list1.val);
      if(list1.val <= list2.val) {
        head.next = list1;
        head = head.next;
        list1 = list1.next;
      } else {
        head.next = list2;
        head = head.next;
        list2 = list2.next;
      }
    }
    return list3.next;
  }
  
}
