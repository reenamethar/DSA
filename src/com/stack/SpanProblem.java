package com.stack;

import java.util.Stack;

public class SpanProblem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] calculateSpan(int[] price, int n) {
		int[] arr = new int[n];
        int j=0;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        arr[j++] = 1;
        for(int i=1; i<n ;i++){
            while(!st.isEmpty() && (price[st.peek()] <= price[i])){
                st.pop();
            }
            
            int span = st.isEmpty()?i+1:i-(st.peek());
            arr[j++] = span;
            st.push(i);
            
        }
        return arr;
	}
	static void calculateSpanDynamic(int A[], int n, int ans[])
    {
        // Span value of first element is always 1
        ans[0] = 1;

        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
            int counter = 1;
            while ((i - counter) >= 0
                   && A[i] >= A[i - counter]) {
                counter += ans[i - counter];
            }
            ans[i] = counter;
        }
    }

}
