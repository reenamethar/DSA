package com.bst;

public class FloorInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 30, 20, 40, 35, 70, 60, 80};
		  Node root = null;
		  for(int i=0; i<arr.length; i++) {
			  root = insert(root, arr[i]);
		  }
		  inorder(root);
		  System.out.println();
		  System.out.println(floorIterative(root, 45));
		  System.out.println(floorRec(root, 79));
	}
	static int floorIterative(Node root, int key) {
		Node res = null;
		while(root != null) {
			if(root.data == key) {
				return root.data;
			}
			else if(root.data >key) {
				root = root.left;
			}else {
				res = root;
				root = root.right;
			}
		}
		return res.data;
	}
	static int floorRec(Node root, int key) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		if(root.data == key) {
			return root.data;
		}
		if(root.data > key) {
			return floorRec(root.left, key);
		}
		int floorValue = floorRec(root.right, key);
		return (floorValue <=key)? floorValue : root.data;
		
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

}
