package com.recursions;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(9987));
	}
	public static int sum(int n) {
		/*
		 * if(n==0) { return 0; }
		 */
		if(n<=9)
			return n;
		return (n%10) + sum(n/10);
	}

}
