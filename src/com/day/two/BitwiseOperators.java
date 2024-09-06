package com.day.two;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		System.out.println(~x);
		System.out.println(3<<1);
		System.out.println(~0);
		System.out.println(0<<1);
		System.out.println(-1<<1);
		System.out.println(-1<<2);
		System.out.println(-2>>1);
		System.out.println(-2>>4);
		isOddOrEven(23);
		isOddOrEven(22);
		swap(12, 65);
		System.out.println(2 + '2' - 1);
		isPowerOfTwo(16);
		isPowerOfTwo(24);
		isPowerOfTwo(32);
		mostSignificantSetBitInDecimal(10);
		mostSignificantSetBitInDecimal(24);
		xorOfAllNumbers(6);
		xorOfAllNumbers(7);
	}
	
	public static void isOddOrEven(int n) {
		if((n & 1) != 0 ) {
			System.out.println(n+" is an odd number.");
		}
		else
		{
			System.out.println(n+" is an even number.");
		}
		
	}
	
	public static void swap(int a, int b) {
		System.out.println("Numbers before swap "+ a + " " + b);
		a = a^b;
		b= b^a;
		a= a^b;
		System.out.println("Numbers after swap "+ a + " " + b);
		
	}
	public static void isPowerOfTwo(int n) {
		if(((n-1) & n)== 0)
			System.out.println("is power of two");
		else
			System.out.println("not power of two");
			
		
	}
	public static void mostSignificantSetBitInDecimal(int n) {
		int msb=0;
		int temp=n;
		while((temp >>= 1) !=0) {
			msb ++;
		}
		System.out.println(Math.pow(2, msb));
		
	}
	public static void xorOfAllNumbers(int n) {
		int rem = n %4;
		if(rem ==0)
			System.out.println(n);
		else if(rem == 1)
			System.out.println(1);
		else if(rem == 2)
			System.out.println(n+1);
		else
			System.out.println(0);
	}

}
