package com.deque;

public class DequeArrayImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque deque = new Deque(5);
		deque.insertFront(4);
		deque.insertFront(7);
		deque.insertRear(8);
		deque.insertRear(9);
		deque.insertFront(1);
		deque.printArray();
		System.out.println(deque.getFront());
		System.out.println(deque.getRear());

	}

}

class Deque{
	int size, cap;
	int arr[];
	Deque(int c) {
		cap = c;
		size =0;
		arr = new int[cap];
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
		for(int i=size-1; i>=0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = x;
		size++;
	}
	
	void deleteFront() {
		if(isEmpty()) {
			return;
		}
		for(int i=0; i<size; i++) {
			arr[i]= arr[i+1];
		}
		size--;
	}
	int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return arr[0];
	}
	
	void insertRear(int x) {
		if(isFull()) {
			return;
		}
		arr[size] =x;
		size++;
	}
	void deleteRear() {
		if(isEmpty()) {
			return;
		}
		size--;
	}
	
	int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return size-1;
	}
	void printArray() {
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}