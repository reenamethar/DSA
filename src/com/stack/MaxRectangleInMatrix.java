package com.stack;

import java.util.Stack;

public class MaxRectangleInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat = {{0, 1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 0, 0}};
		System.out.println(maxRectangle(mat));

	}
	public static int maxRectangle(int[][] mat) {
		int r = mat.length;
		int c = mat[0].length;
		int res = largestHist(mat[0]);
		for(int i=1; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(mat[i][j]==1) {
					mat[i][j] += mat[i-1][j];
				}
			}
			res = Math.max(res, largestHist(mat[i]));
		}
		return res;
	}
	
	public static int largestHist(int[] arr) {
		int res =0;
		int n = arr.length;
		Stack<Integer> st = new Stack<Integer>();
		for(int i=0; i<n; i++) {
			while(!st.isEmpty() && arr[st.peek()]>= arr[i]) {
				int tp = st.pop();
				int curr = arr[tp] *(st.isEmpty()? i : (i-st.peek()-1));
				res = Math.max(res, curr);
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			int tp= st.pop();
			int curr = arr[tp]*(st.isEmpty()? n: (n-st.peek()-1));
			res = Math.max(res, curr);
		}
		return res;
	}
}
