package com.arrays;

public class FractionTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result[] = LargestFraction(15, 23);
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] LargestFraction(int n, int d) {
        int[] result = new int[2];
        int maxNumerator = 0;
        int maxDenominator = 1;
        
        for (int denominator = 10000; denominator>=2; denominator--) {
            int numerator = (int)((long)n * (denominator -1)/ d);
            if ((long)numerator * maxDenominator >= (long)maxNumerator * denominator) {
                maxNumerator = numerator;
                maxDenominator = denominator;
            }
        }
      
        int gcd = gcd(maxNumerator, maxDenominator);
        result[0] = maxNumerator/gcd;
        result[1] = maxDenominator/gcd;
        
        return result;
    }
	
	public static int gcd(int num, int deno) {
		int g = 1;
		for(int i=1; i<=num && i<=deno; i++) {
			if(num % i==0 && deno % i ==0) { 
				g = i;
			}
		}
		return g;
	}


}
