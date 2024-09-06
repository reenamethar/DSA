package com.recursions;

public class RopeCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 17, A = 10, B = 11, C = 3;
		System.out.println(maxCut(N, A, B, C));
		int n = 10, a = 9, b = 11, c = 3;
		System.out.println(maxCut(n, a, b, c));

	}
	public static int maxCut(int n, int a, int b, int c) {
		if(n==0) return 0;
		if(n<0) return -1;
		int res = Math.max(maxCut(n-a, a, b, c), Math.max(maxCut(n-b, a, b, c), maxCut(n-c, a, b, c)));
		if(res ==-1)
			return -1;
		else
			return res +1;
	}

}
