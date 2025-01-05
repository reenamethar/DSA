package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintSpiralTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.left.left.left = new TreeNode(8);
		root.left.left.right = new TreeNode(9);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(11);
		
		
		//printSpiral(root);
		printSpiralMethodTwo(root);

	}
	public static void printSpiral(TreeNode root) {
		// some items processed 4 times those needed to be printed in reverse order
		if(root == null) {
			return;
		}
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Stack<Integer> s = new Stack<Integer>();
		boolean reverse = false;
		q.add(root);
		while(q.isEmpty() == false) {
			int size = q.size();
			for(int i=0; i<size; i++) {
				TreeNode curr = q.poll();
				if(reverse) {
					//System.out.println("curr data "+ curr.data);
					s.push(curr.data);
				}
				else {
					System.out.print(curr.data+ " ");
				}
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
			if(reverse) {
				int count =s.size();
				for(int i=0; i<count;i++) {
					System.out.print(s.pop()+ " ");
				}
			}
			reverse = !(reverse);
			System.out.println();			
		}
	}
	public static void printSpiralMethodTwo(TreeNode root) {
		// items processed not more than 2 times
		if(root == null) {
			return;
		}
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(root);
		while(s1.isEmpty() == false || s2.isEmpty() == false) {
			while(s1.isEmpty() == false) {
				TreeNode curr = s1.pop();
				System.out.print(curr.data + " ");
				if(curr.left != null) {
					s2.push(curr.left);
				}
				if(curr.right != null) {
					s2.push(curr.right);
				}
			}
			while(s2.isEmpty() == false) {
				TreeNode curr2 = s2.pop();
				System.out.print(curr2.data + " ");
				if(curr2.right != null) {
					s1.push(curr2.right);
				}
				if(curr2.left != null) {
					s1.push(curr2.left);
				}
				
				
			}
			
		}
		System.out.println();
	}

}

class TreeNode{
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode(int x){
		this.data = x;
	}
}
