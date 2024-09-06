package com.day.two;

import java.util.Vector;

public class PrintDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//naiveMethod(15);
		//efficientMethod(15);
		efficientMethodSorted(64);
	}
	public static void naiveMethod(int n) {
		//timeComplexity O(n)
		for(int i=1; i<=n; i++) {
			if(n %i ==0) {
				System.out.println(i);
			}
		}
		
	}
	public static void efficientMethod(int n) {
		//timeComplexity O(sqrt(n))
		for(int i=1; i*i<=n;i++) {
			if(n%i ==0) {
				System.out.println(i);
				if(i !=n/i)
					System.out.println(n/i);
			}
		}	
	}
	public static void efficientMethodSorted(int n) {
		Vector<Integer> v = new Vector();
		for(int i=1; i<=Math.sqrt(n); i++) {
			if(n%i ==0) {
				if( i == n/i)
					System.out.println(i);
				else {
					System.out.println(i);
					v.add(n/i);
				}
			}
		}
		for(int i=v.size()-1; i>=0; i--) {
			System.out.println(v.get(i));
		}
		
	}
	
}
