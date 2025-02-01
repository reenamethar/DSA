package com.tree;

import java.util.Stack;

public class IterativeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void iterativeInorder(Node root) {
		Stack<Node> st = new Stack<Node>();
		Node curr = root;
		while(curr != null || st.isEmpty() == false) {
			while(curr != null) {
				st.push(curr);
				curr = curr.left;
			}
			curr = st.peek();
			st.pop();
			System.out.println(curr.data);
			curr = curr.right;
		}
	}

}
