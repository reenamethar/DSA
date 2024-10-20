package com.stack;

import java.util.Stack;

// To find largest rectangular area in a histogram
public class LargestRectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6, 2, 5, 4, 1, 5, 6};
		//System.out.println(naive(arr));
		System.out.println(efficient(arr));
	}
	public static int naive(int[] arr) {
		// time complexity -> Theta(n)
		int n = arr.length;
		int res =0;
		for(int i=0; i<n ; i++) {
			int curr = arr[i];
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>= arr[i]) {
					curr += arr[i];
				}else {
					break;
				}
				
			}
			for(int j=i+1; j<n; j++) {
				if(arr[j]>= arr[i]) {
					curr += arr[i];
				}else {
					break;
				}
			}
			res = Math.max(res, curr);
		}
		return res;
	}
	
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int efficient(int[] hist) {
		int res =0;
		Stack<Integer> st = new Stack<Integer>();
        int n = hist.length;
        int curr =0;
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && hist[st.peek()]>=hist[i]){
                int tp= st.pop();
                curr = hist[tp]* (st.isEmpty()? i: (i-st.peek()-1));
                res = Math.max(res, curr);
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            int tp= st.pop();
            curr = hist[tp]* (st.isEmpty()? n: (n-st.peek()-1));
            res = Math.max(res, curr);
        }
        return res;
		
		
	}
}
