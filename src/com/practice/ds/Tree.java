package com.practice.ds;

public class Tree {
  
  Node root;
  
  public Tree(int data) {
    this.root = new Node(data);
  }
  
  public void print() {
    print(root);
  }
  
  private void print(Node root) {
    if(root != null){
      print(root.left);
      
    }
  }
}

class Node {
  int data;
  Node left;
  Node right;
  
  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

