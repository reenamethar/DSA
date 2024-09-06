package com.bitwise;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(naive(32));
		System.out.println(naive(24));
		System.out.println("Using Brian Kernigham's Algo");
		System.out.println(usingBrianKernighmsAlgo(256));
		System.out.println(usingBrianKernighmsAlgo(254));
		System.out.println(usingBrianKernighmsAlgo(0));
		System.out.println("Using Log base 2");
		System.out.println(usingLogBase2(8));
		System.out.println(usingLogBase2(254));
		System.out.println(usingLogBase2(256));

	}
	
	public static boolean naive(int n) {
		if(n ==0)
			return false;
		while(n !=1) {
			if(n %2 !=0)
				return false;
			n/=2;
		}
		return true;
		   
	}
	public static boolean usingBrianKernighmsAlgo(int n) {
		/*
		 * if(n==0) return false;
		 */
		
		if((n!=0) && (n & (n -1)) ==0)
			return true;
		else
			return false;
	}
	public static boolean usingLogBase2(int n) {
		return (Math.ceil(Math.log(n)/Math.log(2)) == Math.floor(Math.log(n)/Math.log(2)));
	}

}
