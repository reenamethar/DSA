package com.tree;

public class ConstructTree {
// construct a binary tree from preorder and inorder traversal
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	int preIndex =0;
	Node3 cTree(int[]in, int[]pre, int is, int ie) {
		if(is>ie) {
			return null;
		}
		Node3 root = new Node3(pre[preIndex]);
		int index =0;
		for(int i=is; i<=ie; i++) {
			if(in[i] == root.data) {
				index = i;
				break;
			}
		}
		
		root.left = cTree(in, pre, is, index-1);
		root.right = cTree(in, pre, index+1, ie);
		return root;
		
	}

}

class Node3{
	Node3 left;
	Node3 right;
	int data;
	Node3(int x){
		this.data = x;
	}
}
