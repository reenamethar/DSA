package com.stack;

public class KStackUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KStack st = new KStack(3, 5);
		st.push(0, 1);
		st.push(0, 2);
		st.push(1, 3);
		st.push(1, 4);
		st.push(2, 5);
		st.printStack(0);
		st.printStack(1);
		st.printStack(2);
		st.pop(2);
		st.printStack(2);
		st.pop(1);
		st.printStack(1);
		
	}

}

class KStack{
	int arr[];
	int top[];
	int next[];
	int n, k, free;
	public KStack(int k1, int n1) {
		n = n1;
		k = k1;
		arr = new int[n];
		next = new int[n];
		top = new int[k];
		for(int i=0; i<k; i++) {
			top[i] =-1;
		}
		for(int i=0; i<n-1; i++) {
			next[i] = i+1;
		}
		next[n-1] =-1;
		free  =0;
	}
	
	boolean isFull() {
		return (free == -1);
	}
	void push(int sn, int data) {
		if(isFull()) {
			System.out.println("Stack Overflow");
			return;
		}
		int i= free; // store first free slot 
		free = next[i]; // update free slot to the next free slot 
		next[i] = top[sn];
		top[sn] = i; 
		arr[i] = data;
	}
	int pop(int sn) {
		if(isEmpty(sn)) {
			System.out.println("Stack is Empty");
			return -1;
		}
		int i = top[sn];
		top[sn] = next[i];
		next[i] = free;
		free = i;
		return arr[i];
		
		
	}
	boolean isEmpty(int sn) {
		return (top[sn]==-1);
	}
	void printStack(int sn) {
		if(isEmpty(sn)) {
			System.out.println("Stack is Empty");
			return;
		}
		int i = top[sn];
		while(i>-1) {
			System.out.print(arr[i]+" ");
			i= next[i];
		}
		System.out.println();
	}
}