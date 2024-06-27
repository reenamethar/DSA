package com.recursions;

public class SumRecursions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
		System.out.println(sum(0));
		System.out.println(sumTail(5, 0));
		System.out.println(sumTail(0, 0));
		System.out.println(sumTail(10, 0));
	}
	
	public static int sum(int n) {
		if(n==0)
			return 0;
		int sum = n + sum(n-1);
		return sum;
		
	}
	
	public static int sumTail(int n, int sum) {
		if(n<=1) {
			sum = sum +n;
			return sum;
		}
		return sumTail(n-1, n +sum);
	}

}
