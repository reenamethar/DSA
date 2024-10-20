package com.stack;

import java.util.Stack;

public class GetMinStackDesign {
	// design a stack with getMin() in O(1)
	// assumption only positive values
	public static int min; 
	public static  Stack<Integer> st = new Stack<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(5);
		push(10);
		push(20);
		push(2);
		push(6);
		push(4);
		System.out.println(getMin());
		pop();
		pop();
		pop();
		System.out.println(getMin());
		System.out.println(peek());

	}
	public static void push(int x) {
		if(st.isEmpty()) {
			min= x;
			st.push(x);
		}else if(x <= min) {
			st.push(x-min); // or (2*x-min) this will be always less than or equal to x// if stack involves both positive and negative values 
			min = x;
		}else {
			st.push(x);
		}
	}
	public static int getMin() {
		return min;
	}
	public static int peek() {
		int t = st.peek();
		return (t<=0)? min: t;  // (t<=min)
	}
	public static int pop() {
		int t = st.pop();
		if(t <= 0) { //(t<=min)
			int res = min;
			min = min -t; // 2*min -t
			return res;
		}
		else {
			return t;
		}
	}
}
