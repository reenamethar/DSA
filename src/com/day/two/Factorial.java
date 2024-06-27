package com.day.two;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =12;
		long fact = 1;
        for(int i=2; i<=N;i++) {
        	fact = fact * i;

        }

		System.out.println(fact);
		/* System.out.println(digitsInFactorial(120)); */
		System.out.println(trailingZeroInFact(15));

	}
	/*
	 * public static int digitsInFactorial(int N){ // code here int count =0; int
	 * fact = 1; while(N >0){ fact = fact *N; N--; } System.out.println(fact);
	 * while(fact >0) { fact= fact/10; count ++;
	 * 
	 * } return count; }
	 */
	public static int trailingZeroInFact(int n) {
		int res =0;
		for(int i=5; i<=n; i=i*5) {
			res = res + n/i;
		}
		return res;
		
	}
}
