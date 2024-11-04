package com.queue;

import java.util.Stack;
public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueClass q = new QueueClass();
		q.enqueue(5);
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println("-------------------------------");
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.size());

	}

}

class QueueClass{
	static Stack<Integer> st1 = new Stack<Integer>();
	static Stack<Integer> st2 = new Stack<Integer>();
	static int size;
	public QueueClass() {
		size=0;
	}
	void enqueue(int x) {
		// by making enqueue operation costly
		while(!st1.isEmpty()) {
			st2.push(st1.peek());
			st1.pop();
		}
		st1.push(x);
		size++;
		while(!st2.isEmpty()) {
			st1.push(st2.peek());
			st2.pop();
		}
	}
	
	int dequeue() {
		size--;
		return st1.pop();
	}
	// making dequeue operation costly
	/*
	 * int dequeue() { if(st1.isEmpty() && st2.isEmpty()) { return -1; }
	 * if(st2.isEmpty()) { while(!st1.isEmpty()) { st2.push(st1.peek()); st1.pop();
	 * } } int poppedElement = st2.pop(); size--; return poppedElement; }
	 * 
	 * void enqueue(int x) { st1.push(x); size++; }
	 */
	int peek() {
		return st1.peek();
	}
	int size() {
		return size;
	}
}
