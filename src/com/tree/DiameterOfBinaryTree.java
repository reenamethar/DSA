package com.tree;

public class DiameterOfBinaryTree {
	 int res =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	public static int diameterNaive(NodeTree root) {
		// O(n^2) time complexity
		if(root == null) {
			return 0;
		}
		int d1 = 1+ height(root.left)+ height(root.right);
		int d2 = diameterNaive(root.left);
		int d3 = diameterNaive(root.right);
		return Math.max(Math.max(d1, d2), d3);
		
	}
	
	public static int height(NodeTree root) {
		if(root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		//res = Math.max(res, 1+lh+rh);  this will give diameter
		return Math.max(lh, rh)+1;
		
	}

}

class NodeTree{
	NodeTree left;
	NodeTree right;
	int data;
	NodeTree(int data){
		this.data = data;
		left = null;
		right = null;
	}
}
