package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(5);
		st.push(10);
		st.push(15);
		st.push(20);
		System.out.println(st.top());
		System.out.println(st.size());
		st.pop();
		System.out.println(st.top());
		System.out.println(st.size());
		

	}
	

}
class Stack{
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	static int size;
	Stack(){
		size =0;
	}
	static void push(int x) {
		// by making push operation costly
		size++;
		q2.add(x);
		while(!q1.isEmpty()) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		Queue<Integer> q = q1;
		q1 = q2;
		q2= q;
	}
	static void pop() {
		if(q1.isEmpty()) {
			return ;
		}
		q1.remove();
		size--;
	}
	static int top() {
		if(q1.isEmpty()) {
			return -1;
		}
		return q1.peek();
	}
	static int size() {
		return size;
	}
	// while making pop operation costly 
	/*
	 * static void push(int x) { q1.add(x); size++; } static void pop() {
	 * while(q1.size() !=1) { q2.add(q1.peek()); q1.remove(); } int poppedItem =
	 * q1.remove(); size--; Queue<Integer> q = q1; q1 = q2; q2 =q; }
	 */
	
}
