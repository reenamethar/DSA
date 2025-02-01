package com.tree;

import java.util.ArrayList;

public class LCANaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		System.out.println(lca(root, 3, 7).data);
	}
	static boolean findPath(Node root, ArrayList<Node> p, int n) {
		if(root == null) {
			return false;
		}
		p.add(root);
		if(root.data == n) return true;
		if(findPath(root.left, p, n) || findPath(root.right, p, n)) {
			return true;
		}
		p.remove(p.size()-1);
		return false;
	}
	static Node lca(Node root, int n1, int n2) {
		ArrayList<Node> path1 = new ArrayList<Node>();
		ArrayList<Node> path2 = new ArrayList<Node>();
		if(findPath(root, path1, n1) == false || findPath(root, path2, n2) == false) {
			return null;
		}
		for(int i=0; i<path1.size()-1 && i<path2.size()-1; i++) {
			if(path1.get(i+1) != path2.get(i+1)) {
				return path1.get(i);
			}
		}
		return null;
	}
}
