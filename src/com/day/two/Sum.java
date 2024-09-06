package com.day.two;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNaturalNumbers(5, 0));

	}
	
	public static int sumOfNaturalNumbers(int n, int sum) {
		if(n == 1) {
			return 1;
		}
		sum = n + sumOfNaturalNumbers(n-1, sum);
		return sum;
	}

}