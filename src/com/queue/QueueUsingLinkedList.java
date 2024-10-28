package com.queue;

class Node{
	int data;
	Node next;
	Node(int x){
		this.data = x;
		next = null;
	}
}

class QueueLL{
	Node front, rear;
	int size=0;
	public QueueLL() {
		front = rear = null;
	}
	void enqueue(int x) {
	Node temp = new Node(x);
	if(front == null) {
		front = rear = temp;
		size++;
		return;
	}
	rear.next = temp;
	rear = temp;
	size++;
	}
	void dequeue() {
		if(front == null) {
			return;
		}
		front = front.next;
		//if it was last element , so need to make rear also null
		if(front == null) {
			rear = null;
		}
		size--;
	}
	int size() {
		return size;
	}
	int getFront() {
		if(front == null) {
			return Integer.MIN_VALUE;
		}
		return front.data;
	}
	int getRear() {
		if(rear == null) {
			return Integer.MIN_VALUE;
		}
		return rear.data;
	}
}

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLL ql = new QueueLL();
		System.out.println(ql.getFront());
		System.out.println(ql.getRear());
		ql.enqueue(5);
		ql.enqueue(6);
		ql.enqueue(8);
		ql.enqueue(9);
		ql.enqueue(12);
		ql.dequeue();
		System.out.println(ql.getFront());
		System.out.println(ql.getRear());
		System.out.println(ql.size());

	}

}
