package com.practice.algo.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
 //          5
 //         / \
//         3   6
//        /   / \
//       1   4   8
public class Main {
  public static void main(String[] args) {
    Node root = new Node(5);
    root.left = new Node(3);
    root.right = new Node(6);
    root.left.left = new Node(1);
    root.right.right = new Node(8);
    root.right.left = new Node(4);
    System.out.print("DFS : ");
    printDFS(root);
    System.out.print("BFS : ");
    printBFS(root);
    int target = 1;
    System.out.print("Contains target : ");
    System.out.println(containsTarget(target, root));
    System.out.print("Contains target rec : ");
    System.out.println(containsTargetRec(target, root));
    System.out.print("Tree sum : ");
    System.out.println(treeSum(root));
    System.out.print("Find min : ");
    System.out.println(findMinElement(root));
    System.out.println("Preorder Traversal : ");
    Node rootTrav = new Node(1);
    rootTrav.right = new Node(2);
    rootTrav.right.left = new Node(3);
    List<Integer> integers = preorderTraversal(rootTrav);
    System.out.println(levelOrder(root));
  
    System.out.println("Binary Tree Right Side view : ");
  }
  
   private static int findMinElement(Node root) {
    if(root == null) {
      return 0;
    }
    int curr = Math.min(findMinElement(root.left), findMinElement(root.right));
    return curr;
   }
  
   private static int treeSum(Node root) {
    if(root == null){
      return 0;
    }
    return root.data + treeSum(root.left) + treeSum(root.right);
   }
  
   private static void printDFS(Node root) {
    Stack<Node> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      Node current = stack.pop();
      System.out.print(current.data + " ");
      if (current.right != null) stack.push(current.right);
      if (current.left != null) stack.push(current.left);
    }
    System.out.println();
  }
  
   private static void printBFS(Node root) {
     Queue<Node> queue = new ArrayDeque<>();
     queue.add(root);
     while (!queue.isEmpty()) {
       Node current = queue.poll();
       System.out.print(current.data + " ");
       if (current.right != null) queue.add(current.right);
       if (current.left != null) queue.add(current.left);
     }
     System.out.println();
   }
  
  /* private static void BFS(Node root) {
     Queue<Node> queue = new ArrayDeque<>();
     queue.add(root);
     while (!queue.isEmpty()) {
       Node current = queue.poll();
       System.out.print(current.data + " ");
       if (current.right != null) queue.add(current.right);
       if (current.left != null) queue.add(current.left);
     }
     System.out.println();
   }*/
  
   public static List<Integer> preorderTraversal(Node root) {
     if(root == null){
       return new ArrayList<>();
     }
     Stack<Node> s = new Stack<>();
     ArrayList<Integer> ar = new ArrayList<>();
     s.push(root);
     while(!s.isEmpty()){
       root = s.pop();
       ar.add(root.data);
       if(root.right != null) s.push(root.right);
       if(root.left != null) s.push(root.left);
     }
     return ar;
   }
  
   private static boolean containsTarget(int target, Node root) {
     Queue<Node> queue = new ArrayDeque<>();
     queue.add(root);
     while (!queue.isEmpty()) {
       Node current = queue.poll();
       if(current.data == target) return true;
       if (current.right != null) queue.add(current.right);
       if (current.left != null) queue.add(current.left);
     }
     return false;
   }
  
   private static boolean containsTargetRec(int target, Node node) {
     if(node == null){
       return false;
     }
     if(node.data == target) return true;
     return containsTargetRec(target, node.left) || containsTargetRec(target, node.right);
   }
  
   public static List<List<Integer>> levelOrder(Node root) {
     List<List<Integer>> a = new ArrayList<>();
     Queue<Node> q = new LinkedList<>();
     Math.pow(1,2);
     q.offer(root);
     int levelSize = 0;
     while(!q.isEmpty()){
       levelSize = q.size();
       List<Integer> arr = new ArrayList<>();
       for(int i = 0; i < levelSize; i++){
         Node currNode = q.poll();
         if(currNode.left != null) q.offer(currNode.left);
         if(currNode.right != null) q.offer(currNode.right);
         arr.add(currNode.data);
       }
       a.add(arr);
     }
     return a;
   }
}
