package com.queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(4);
		q.add(6);
		q.add(9);
		q.add(10);
		System.out.println(q.peek());
		//reverseIterative(q);
		reverseRecursive(q);
		System.out.println(q.peek());

	}
	static void reverseIterative(Queue<Integer> q) {
		Stack<Integer> st= new Stack<Integer>();
		while(!q.isEmpty()) {
			st.push(q.peek());
			q.remove();
		}
		while(!st.isEmpty()) {
			q.add(st.peek());
			st.pop();
		}
	}
	static void reverseRecursive(Queue<Integer> q) {
		if(q.isEmpty()) {
			return;
		}
		int x = q.peek();
		q.remove();
		reverseRecursive(q);
		q.add(x);
	}

}
