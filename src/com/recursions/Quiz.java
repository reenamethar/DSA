package com.recursions;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fun(2));
		print(1000);
	}
	/*
	 * static int fun(int n) { if(n ==4) return n; return 2 * fun(n+1); }
	 */
	static void print(int n) {
		if(n >4000) 
			return;
		System.out.print(n + " ");
		print(2*n);
		System.out.print(n + " ");
		
	}

}
