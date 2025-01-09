package com.deque;

public class DequeArrayEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Deque1{
	int [] arr;
	int cap,size,front;
	public Deque1(int c) {
		cap =c;
		arr = new int[cap];
		size=0;
		front =0;
		// rear will be always rear = (front +size-1)%cap
	}
	boolean isFull() {
		return size == cap;
	}
	
	boolean isEmpty() {
		return size ==0;
	}
	void insertFront(int x) {
		if(isFull()) {
			return;
		}
		front = (front-1+cap)%cap;
		arr[front] = x;
		size++;
	}
	void insertRear(int x) {
		if(isFull()) {
			return;
		}
		int new_rear = (front+size-1+1)%cap;
		arr[new_rear] = x;
		size++;
	}
	void deleteFront() {
		if(isEmpty()) {
			return;
		}
		front = (front+1)%cap;
		size--;
	}
	void deleteRear() {
		if(isEmpty()) {
			return;
		}
		size--;
	}
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return front;
	}
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return (front+size-1)%cap;
	}
}
