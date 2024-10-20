package com.stack;

import java.util.Stack;

public class PreviousGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {20, 30, 10, 5, 15};
		findPreviousGreater(arr);

	}
	//time complexity -> O(n)
	//space complexity -> O(n)
	public static void findPreviousGreater(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(arr[0]);
		System.out.println(-1);
		for(int i=1; i< arr.length; i++) {
			while(!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}
			int prevGreater = st.isEmpty()? -1: st.peek();
			System.out.println(prevGreater);
			st.push(arr[i]);
		}
		
	}
}
