package com.recursions;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toh(3, "source", "temp", "dest"));
		
	}
	public static long toh(int n, String s, String t, String d) {
		if(n==1)
		{
			System.out.println("Move disk " + n + " "+ s + " to "+ d );
			return 1;
		}
		long n1 =toh(n-1, s, d, t);
		System.out.println("Move disk " + n + " "+ s + " to "+ d );
		long n2 = toh(n-1, t, s, d);
		return n1+n2+1;
		
	}
}
