package com.deque;

public class DequeCircularImplArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class DequeC{
	static final int MAX = 100;
	int[] arr;
	int front, rear, size;
	public DequeC(int size) {
		front =-1;
		rear =0;
		arr = new int[MAX];
		this.size = size;	
	}
	boolean isFull() {
		return ((front ==0 && rear== size-1) || (front == rear+1));
	}
	boolean isEmpty() {
		return (front == -1);
	}
	void insertFront(int x) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(front == -1) {
			front =0;
			rear =0;
		}else if(front ==0) {
			front = size-1;
		}else {
			front = front-1;
		}
		arr[front] = x;
	}
	void insertRear(int x) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}
		if(front ==-1) {
			rear =0;
			front =0;
		}else if(rear ==size-1) {
			rear =0;
		}else {
			rear = rear +1;
		}
		arr[rear] = x;
	}
	void deleteFront() {
		if(isEmpty()) {
			System.out.println("uderflow");
			return;
		}
		if(front == rear) {
			front =-1;
			rear =-1;
		}else if(front == size-1) {
			front =0;
		}else {
			front = front+1;
		}
	}
	void deleteRear() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		if(front == rear) {
			rear =-1;
			front =-1;
		}
		else if(rear ==0) {
			rear =size-1;
		}else {
			rear = rear -1;
		}
	}
	
	int getFront() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
			return -1;
		}
		return arr[front];
	}
	int getRear() {
		 if(isEmpty() || rear == -1) {
			 System.out.println("UnderFlow");
			 return -1;
		 }
		 return arr[rear];
		 
		 
	}
}
