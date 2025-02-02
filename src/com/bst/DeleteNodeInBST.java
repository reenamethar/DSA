package com.bst;

public class DeleteNodeInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 30, 20, 40, 70, 60, 80};
		  Node root = null;
		  for(int i=0; i<arr.length; i++) {
			  root = insert(root, arr[i]);
		  }
		  inorder(root);
		  System.out.println();
		  root = delete(root, 50);
		  inorder(root);
		  
	}
	static void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public static Node insert(Node root, int key) {
		if(root == null) {
			return new Node(key);
		}
		if(key < root.data) {
			root.left = insert(root.left, key);
		}else {
			root.right = insert(root.right, key);
		}
		return root;
		
	}
	
	public static Node delete(Node root, int key) {
		if(root == null) {
			return null;
		}
		if(key < root.data) {
			root.left = delete(root.left, key);
		}
		else if(key > root.data) {
			root.right = delete(root.right, key);
		}
		else {
			// 1. has only 1 child
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			else {
				Node succ = getSuccessor(root.right);
				root.data = succ.data;
				//in-order successor is the immediate right child of the node being deleted. If we don't handle this case carefully, it could cause redundant recursive calls or even lead to infinite recursion under specific implementations.
				if(succ == root.right) {
					root.right = root.right.right;
				}
				root.right = delete(root.right, succ.data);
			}
		}
		return root;
	}
	static Node getSuccessor(Node root) {
		Node curr = root;
		while(curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
}
