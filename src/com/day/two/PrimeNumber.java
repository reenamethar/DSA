package com.day.two;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(naiveMethod(2));
		System.out.println(naiveMethod(64));
		System.out.println("Efficient Way");
		System.out.println(efficientMethod(47));
		System.out.println(efficientMethod(64));
		System.out.println("More effient way");
		System.out.println(moreEficientMethod(49));
	}
	
	public static boolean naiveMethod(int n) {
		//timeComplexity -> O(n)
		if(n == 1)
			return false;
		for(int i=2; i<n; i++) {
			if(n%i ==0)
			{
				return false;
			}
		}
		return true;
	}
	public static boolean efficientMethod(int n) {
		//timeComplexity -> O(sqrt(n))
		if(n ==1)
			return false;
		for(int i=2; i<Math.sqrt(n); i++) {
			if(n % i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean moreEficientMethod(int n) {
		//timeComplexity -> 1/3 rd of O(sqrt(n))
		if( n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2 == 0 || n%3 ==3)
			return false;
		for(int i=5; i*i <=n; i+=6) {
			if(n%i ==0 || n%(i+2)==0)
				return false;
		}
		
		return true;
		
		
	}


}
