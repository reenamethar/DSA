package com.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {20, 30, 10, 5, 15};
		System.out.println(findNextGreater(arr));;

	}
	// prints it in reverse order
	public static ArrayList<Integer> findNextGreater(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int n = arr.length;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		st.push(arr[n-1]);
		arrList.add(-1);
		System.out.println(-1);
		for(int i= n-2; i>=0; i--) {
			while(!st.isEmpty() && st.peek()< arr[i]) {
				st.pop();
			}
			int nextGreater = st.isEmpty()? -1: st.peek();
			arrList.add(nextGreater);
			st.push(arr[i]);
		}
		Collections.reverse(arrList);
		return arrList;
	}

}
