package com.day.two;
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		/*
		 * int count =0; while(x>0) { x = x/10; count++; }
		 */
		System.out.println((4 *(double) 9/5) +32);
		System.out.println("Number of digits: "+count(x));
		

	}
	public static int count(int n) {
		System.out.println(n);
		if(n/10 ==0) {
			System.out.println("iNSIDE"+ n);
			return 1;
		}
		
		return 1 + count(n/10);
		
	}

}
