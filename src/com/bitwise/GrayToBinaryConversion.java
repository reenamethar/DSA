package com.bitwise;

public class GrayToBinaryConversion {
	public static void main(String[] args) {
		System.out.println(grayToBinary(7));
		
	}
	public static int grayToBinary(int n) {
		int ans = n;
		while(n !=0) {
			ans = ans ^ (n >>1);
			n>>=1;
		}
		return ans;
	}

}
