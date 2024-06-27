package com.arrays;

import java.util.ArrayList;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {7, 10, 4, 3, 6, 5, 2};
		//leadersInArray(arr, arr.length);
		leadersInArrayEfficientSolution(arr, arr.length);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);

	}
	public static void leadersInArray(int[] arr, int n) {
		//Naive Method
		
		for(int i=0; i<n; i++) {
			int j;
			for(j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					break;
				}
			}
			if(j==n) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void leadersInArrayEfficientSolution(int[] arr, int n) {
		int current_ldr = arr[n-1];
		System.out.println(current_ldr);
		for(int i=n-2; i>=0; i--) {
			if(current_ldr < arr[i]) {
				current_ldr = arr[i];
				System.out.println(current_ldr);
			}
		}
	}

}
