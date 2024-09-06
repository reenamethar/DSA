package com.day.two;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primeFactors(315);
		//efficientWay(315);
		moreEfficientWay(315);
	}
	
	public static void primeFactors(int n) {
		for(int i=2; i<n; i++) {
			if(isPrime(i)) {
				int x = i;
				while(n %x ==0) {
					System.out.println(i);
					x = x*i;
					
				}
			}
		}
		
	}
	public static void efficientWay(int n) {
		if(n <=1)
			return;
		for(int i=2; i*i <=n ; i++) {
			while(n%i ==0) {
				System.out.println(i);
				n /=i;
			}
		}
		if(n>1)
			System.out.println(n);
		
	}
	
	public static void moreEfficientWay(int n) {
		if(n<=1)
			return;
		while(n %2==0) {
			System.out.println(2);
			n/=2;
		}
		while(n%3 ==0) {
			System.out.println(3);
			n/=3;
		}
		for(int i=5; i*i<=n; i+=6) {
			while(n%i ==0) {
				System.out.println(i);
				n/=i;
			}
			while(n %(i+2) == 0) {
				System.out.println(i+2);
				n/=(i+2);
			}
		}
		if(n >3)
			System.out.println(n);
	}
	public static boolean isPrime(int n) {
		if(n ==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n %2 ==0 || n %3 ==0)
			return false;
		for(int i=5; i*i<=n; i+=6) {
			if(n %i ==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}

}
