 package com.day.two;

import java.util.Arrays;

public class SieveOfEratosthene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printPrimes(50);
		optimizedSieve(64);
	}
	public static void printPrimes(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2; i*i<=n ;i++) {
			if(isPrime[i]) {
				//2*i
				for(int j=i*i; j<=n; j=j+i) {
					isPrime[j]= false;
				}
			}
		}
		
		for(int i=2; i<=n; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static void optimizedSieve(int n) {
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2; i<=n;i++) {
			if(isPrime[i]) {
				System.out.println(i);
				for(int j= i*i; j<=n; j=j+i) {
					isPrime[j] = false;
				}
			}
		}
		
	}

}
