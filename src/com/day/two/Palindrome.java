package com.day.two;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 78987;
		int n = num;
		int rev =0;
		while(n>0) {
			rev = rev *10 + n%10;
			n = n/10;
		}
		if(rev == num ) {
			System.out.println("Palindromic");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
