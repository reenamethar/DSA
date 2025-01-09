package com.tree;

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 root = new Node1(10);
		root.left = new Node1(20);
		root.right = new Node1(30);
		// root == null means empty tree
	}

}

class Node1{
	int key;
	Node1 left;
	Node1 right;
	Node1(int k){
		key = k;
	}
}
