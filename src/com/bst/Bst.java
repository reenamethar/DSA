package com.bst;

public class Bst {
	
	/*
	 * A binary Search Tree is a node-based binary tree data structure which has the following properties:  

The left subtree of a node contains only nodes with keys lesser than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree. 
There must be no duplicate nodes.

search, minimum and maximum can be done fast.
*
*
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] arr = {20, 6, 25, 8, 12, 9, 13, 89, 1, 91};
	  Node root = null;
	  for(int i=0; i<arr.length; i++) {
		  root = insertRec(root, arr[i]);
	  }
		inorder(root);
		System.out.println();
		System.out.println(searchRec(root, 13));
		System.out.println(searchRec(root, 31));
		root = insertIterative(root, 15);
		root = insertIterative(root, 99);
		inorder(root);
		System.out.println();
		System.out.println(searchIterative(root, 89));
		System.out.println(searchIterative(root, 98));
	}
	
	public static Node insertRec(Node root, int key) {
		if(root == null) {
			return new Node(key);
		}
		if(key < root.data) {
			root.left = insertRec(root.left, key);
		}else {
			root.right = insertRec(root.right, key);
		}
		return root;
		
	}
	
	static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	static boolean searchRec(Node root, int key) {
		if(root == null) {
			return false;
		}
		if(root.data == key ) {
			return true;
		}
		if(key < root.data) {
			return searchRec(root.left, key);
		}
		return searchRec(root.right, key);
	}
	
	static Node insertIterative(Node root, int key) {
		Node node = new Node(key);
		if(root == null) {
			return node;
		}
		Node parent = null;
		Node curr = root;
		while(curr != null) {
			parent = curr;
			if(key < curr.data) {
				curr = curr.left;
			}else {
				curr = curr.right;
			}
		}
		if(key <parent.data) {
			parent.left = node;
		}
		else {
			parent.right = node;
		}
		return root;
	}
	
	static boolean searchIterative(Node root, int key) {
		while(root != null) {
			if(root.data == key) {
				return true;
			}
			else if(key < root.data) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		return false;
	}
}

class Node{
	int data;
	Node left, right;
	Node(int data){
		this.data = data;
	}
}
