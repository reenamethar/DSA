package com.day.two;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(gcd(6, 2));
	System.out.println(gcdUsingEuclideanAlgo(7, 2));
	System.out.println(gcdModulo(98, 56));
	System.out.println(gcdRecursion(98, 56));
	System.out.println(lcm(98, 56));
	
	}
	
	//time complexity O(min(a, b))
	public static int gcd(int a, int b) {
		int res = Math.min(a, b);
		while(res >0) {
			if(a % res == 0 && b % res ==0) {
				break;
			}
			res--;
		}
		return res;
	}
	
	public static int gcdUsingEuclideanAlgo(int a, int b) {
		while(a != b) {
			if(a>b)
				a= a-b;
			else
				b = b-a;
		}
		return a;
		
	}
	public static int gcdModulo(int a, int b) {
		if(b ==0)
			return a;
		else
			return gcdModulo(b, a%b);
	}
	
	public static int gcdRecursion(int a, int b) {
		if(b == 0)
			return a;
		if(a == 0)
			return b;
		if(a == b)
			return a;
		if(a>b)
			return gcdRecursion(a-b, b);
		return gcdRecursion(a, b-a);
		
	}
	public static int lcm(int a, int b) {
		return (a * b) / gcdModulo(a, b);
		
	}
	

}
