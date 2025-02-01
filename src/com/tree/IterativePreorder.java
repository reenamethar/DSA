package com.tree;

import java.util.Stack;

public class IterativePreorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	void preorder(Node root) {
		// time -> O(N) & space -> O(N)
		if(root  == null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		st.push(root);
		while(st.isEmpty() == false) {
			Node curr = st.peek();
			st.pop();
			if(curr.right != null) {
				st.push(curr.right);
			}
			if(curr.left !=  null) {
				st.push(curr.left);
			}
		}
	}
	void optimizedPreorder(Node root) {
		// keep traversing left and print left child along with pushing right child to stack
		//time o(n) & space o(h)
		if(root == null) {
			return;
		}
		Stack<Node> st = new Stack<Node>();
		Node curr = root;
		while(curr != null || st.isEmpty() == false) {
			while(curr != null) {
				System.out.println(curr.data);
				if(curr.right != null) {
					st.push(curr.right);
				}
				curr = curr.left;
			}
			if(st.isEmpty() == false) {
				curr = st.peek();
				st.pop();
			}
		}
	}

}
