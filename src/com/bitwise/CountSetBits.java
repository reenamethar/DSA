package com.bitwise;

public class CountSetBits {
	public static int tbl[] = new int [256];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(naive(8));
		System.out.println(naive(7));
		System.out.println("brian Kernighan's Algorithm");
		System.out.println(brianKernighansLAgo(8)); 
		System.out.println(brianKernighansLAgo(21));
		System.out.println("Naive 2nd way");
		System.out.println(naive2(0));
		System.out.println(naive2(18));
		// for loopup table solution
		//  Assumption we have 32 bit number ,we create a table of size 255 for 32 bit
		initialize();
		System.out.println("Using look up table solution");
		System.out.println(lookUpTableSolution(21));
		System.out.println(lookUpTableSolution(255));

	}
	static void initialize() {
		tbl[0] =0;
		for(int i=1; i< 256; i++) {
			tbl[i] = tbl[i & (i-1)]+1;
		}
		
	}
	public static int naive(int n) {
		//time compl -> theta(no of bits)
		int res =0;
		while(n >0) {
			if(n %2 !=0)
				res ++;
			n/=2;
		}
		return res;
		
	}
	public static int brianKernighansLAgo(int n) {
		//time complexity theta(no. of set bits)
		int res=0;
		while(n>0) {
			n = n &(n-1);
			res++;
		}
		return res;
	}
	public static int naive2(int n) {
		int res=0;
		while(n>0) {
			res = res + (n &1);
			n>>=1;
		}
		
		return res;
	}
	
	public static int lookUpTableSolution(int n) {
		return ((tbl[n & 255]) + (tbl[(n>>8) & 255]) + (tbl[(n>>16) & 255]) + (tbl[(n >>24) & 255]));		
		
	}
	

}
