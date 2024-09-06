package com.stack;

public class UsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack = new MyStack();
		stack.push(3);
		stack.push(5);
		stack.push(9);
		stack.push(12);
		stack.print();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.isEmpty());
		

	}

}

class Node{
	int data;
	Node next;
	Node(int x){
		data = x;
	}
}
class MyStack{
	
	static Node head;
	int size;
	public MyStack() {
		// TODO Auto-generated constructor stub
		head = null;
		size =0;
	}
	
	void push(int x) {
		Node temp = new Node(x);
		temp.next = head;
		head  = temp;
		size++;
	}
	
	int pop() {
		if(head == null) {
			return -1;
		}
		int result = head.data;
		head = head.next;
		size--;
		return result;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return (head == null);
	}
	
	int peek() {
		if(head == null) {
			return -1;
		}
		return head.data;
	}
	void print() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	
	
}