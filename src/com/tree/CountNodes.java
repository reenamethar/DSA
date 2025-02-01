package com.tree;

public class CountNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	int countNodes(Node root) {
		// time complexity is theta(n)
		if(root == null) {
			return 0;
		}
		return 1+ countNodes(root.left) + countNodes(root.right);
	}
	int countNodesEfficient(Node root) {
		// only for complete binary tree(left to right)
		// O(logn * logn)
		if(root == null) {
			return 0;
		}
		Node curr = root;
		int lh =0;
		while(curr != null) {
			lh++;
			curr = curr.left;
		}
		curr = root;
		int rh =0;
		while(curr != null) {
			rh++;
			curr = curr.right;
		}
		if(lh==rh) {
			return (int) (Math.pow(2, lh)-1);
		}
		return 1+ countNodesEfficient(root.left) + countNodesEfficient(root.right);
	}
}
