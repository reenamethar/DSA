package com.recursions;

public class PrintNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(5);
		print1TN(5);

	}
	
	public static void print(int n) {
		if(n==0)
			return;
		
		System.out.println(n);
		print(n-1);
		
	}
	
	public static void print1TN(int n) {
		if(n==0)
			return;
		print1TN(n-1);
		System.out.println(n);
		
	}

}
