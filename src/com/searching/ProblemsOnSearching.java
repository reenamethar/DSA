package com.searching;

import java.util.Arrays;

public class ProblemsOnSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 2, 3, 4, 5};
		repeatingAndMissing(arr);
		
		repeatingAndMissingUsingHashing(arr);

	}
	
	public static void repeatingAndMissing(int[] arr) {
		int n = arr.length;
		int [] count = new int[n+1];
		int missing =-1;
		int repeating =-1;
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		for(int i=1; i< n+1; i++) {
			if(count[i]==0) {
				missing =i;
			}
			if(count[i]==2) {
				
				repeating = i;
			}
		}
		System.out.println("Missing Number is "+ missing);
		System.out.println("Repeating Number is "+ repeating);
		
	}
	public static void repeatingAndMissingUsingHashing(int[] arr) {
		int n = arr.length;
		int repeating =-1;
		int missing =-1;
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.println(i);
			int temp = arr[Math.abs(arr[i])-1];
			if(temp<0) {
				repeating = Math.abs(arr[i]);
				break;
			}
			arr[Math.abs(arr[i]-1)] = - arr[Math.abs(arr[i]-1)];
			System.out.println(arr[Math.abs(arr[i]-1)]);
		}
		for(int i=0; i<n; i++) {
			if(arr[i]>0) {
				missing = i+1;
			}
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("Missing Number is "+ missing);
		System.out.println("Repeating Number is "+ repeating);
		
	}

}
