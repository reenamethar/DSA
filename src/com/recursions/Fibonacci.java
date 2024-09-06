package com.recursions;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(fibonacciNth(10));
	}
	
	static int fibonacciNth(int n) {
		
		/*
		 * if(n==0) return 0; if(n ==1) return 1;
		 */
		if(n<=1)
			return n;
		return fibonacciNth(n-1) + fibonacciNth(n-2);
	}

}
