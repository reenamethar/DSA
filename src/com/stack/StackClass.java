package com.stack;

import java.util.ArrayList;

public class StackClass {
// underflow -> happen when you call peek and pop on empty stack
// overflow -> when pushed on full stack	
// LIFO
/*
 * 
 * push() to insert an element into the stack
pop() to remove an element from the stack
top() Returns the top element of the stack.
isEmpty() returns true if stack is empty else false.
size() returns the size of stack.

push() 	O(1)
pop()   	O(1)
isEmpty() 	O(1)
size()	O(1)
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyStackUsingArray stack = new MyStackUsingArray(5);
		MyStackUsingArrayList stack = new MyStackUsingArrayList();
		stack.push(35);
		stack.push(20);
		stack.push(2);
		stack.print();
		//System.out.println("Size is "+ stack.size());
		//stack.pop();
		//System.out.println("Size is "+ stack.size());
		//stack.pop();
		//stack.pop();
		//System.out.println("Size is "+ stack.size());
		
	}

}


// design the array implementation of stack

class MyStackUsingArray{
	int arr[];
	int cap;
	int top;
	public MyStackUsingArray(int c) {
		cap = c;
		top =-1;
		arr = new int[cap];
	}
	void push(int data) {
		if(top == cap-1) {
			System.out.println("Stack is Already full");
			return;
		}
		top++;
		arr[top] = data;
	}
	int pop() {
		if(top ==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		int res = arr[top];
		top--;
		return res;
	}
	int peek() {
		if(top ==-1) {
			System.out.println("Stack is empty");
			return -1;
		}
		return arr[top];
	}
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return top==-1;
	}
	void print() {
		System.out.println(top);
		for(int i=top; i>-1;i--) {
			System.out.print(arr[i]+ " ");
		}
	}
}

// i want the dynamic sized array , so using ArrayList

class MyStackUsingArrayList{
	ArrayList<Integer> arrList;
	public MyStackUsingArrayList(){
		 arrList = new ArrayList<>();
	}
	
	void push(int x) {
		arrList.add(x);
		//System.out.println(arrList);
	}
	int pop() {
		int res = arrList.get(arrList.size()-1);
		arrList.remove(arrList.size()-1);
		return res;
	}
	int peek() {
		return arrList.get(arrList.size()-1);
	}
	int size() {
		return arrList.size();
	}
	boolean isEmpty() {
		return arrList.isEmpty();
	}
	void print() {
		for(int i= arrList.size()-1; i>-1; i--) {
			System.out.print(arrList.get(i) + " ");
		}
	}
}
