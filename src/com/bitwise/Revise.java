package com.bitwise;

public class Revise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =-3;
		System.out.println(x>>1);
		System.out.println(isSetOrNot(15, 3));
		System.out.println(isSetOrNot(8, 2));

	}
	public static boolean isSetOrNot(int n, int k) {
		for(int i=0; i<=k-1; i++) {
			n/=2;
		}
		if((n & 1)!=0)
			return true;
		return false;
		
	}

}
