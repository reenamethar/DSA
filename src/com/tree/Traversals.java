package com.tree;

public class Traversals {
public static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.left = new Node(2);
        head.right = new Node(3);
        head.left.left = new Node(4);
        head.left.right = new Node(5);
        inorderTraversal(head);
        System.out.println();
        System.out.println("Post Traversal");
        postorderTraversal(head);
        System.out.println();
        System.out.println("Pre Traversal");
        preorderTraversal(head);
        System.out.println();
        System.out.println("Height of the tree is");
        System.out.println(height(head));
        System.out.println("K distance nodes");
        printKDist(head, 2);
	}
	public static void inorderTraversal(Node node ) {
		if(node == null) {
			return;
		}
		inorderTraversal(node.left);
		System.out.print(node.data + " -> ");
		inorderTraversal(node.right);
	}
	
	public static void postorderTraversal(Node node) {
		if(node == null) {
			return;
		}
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.data + " -> ");
		
	}
	public static void preorderTraversal(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " -> ");
		preorderTraversal(node.left);
		preorderTraversal(node.right);
	}
	
	public static int height(Node node) {
		if(node == null) {
			return 0;
		}
		return (Math.max(height(node.left), height(node.right)))+1;
	}
	
	public static void printKDist(Node node, int k) {
		if(node == null) {
			return;
		}
		if(k ==0) {
			System.out.print(node.data + " ");
			return;
		}
		else {
			printKDist(node.left, k-1);
			printKDist(node.right, k-1);
		}
		
	}

}

class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
