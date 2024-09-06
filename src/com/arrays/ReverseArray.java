package com.arrays;

import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6, 1, 8, 9, 10, 2};
		/*
		 * int [] rev = reverseArray(arr, arr.length); for(int i=0; i<rev.length; i++) {
		 * System.out.print(rev[i] + " "); } System.out.println();
		 */
		printArray(arr, arr.length);
		reverse(arr, arr.length);
		printArray(arr, arr.length);
		
		System.out.println("Reverse In groups");
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		arrList.add(7);
		arrList.add(8);
		arrList.add(9);
		arrList.add(10);
		System.out.println(arrList);
		reverseInGroups(arrList, arrList.size(), 3);
		System.out.println("After Reverse");
		System.out.println(arrList);

	}
	public static int[] reverseArray(int[] arr, int n) {
		int [] revArray = new int[n];
		int j =0;
		for(int i=n-1; i>=0; i--) {
			revArray[j++] = arr[i];
		}
		return revArray;
	}
	
	public static void reverse(int[] arr, int n) {
		int temp;
		int start =0;
		int end = n-1;
		while(start<end) {
			temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
		
	}
	
	public static void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
	        // code here
		 for(int i =0; i<n; i=i+k ) {
			 System.out.println(i);
			 int start =i;
			 int end = Math.min((i+k-1), n-1);
			 int temp;
			 while(start<end) {
				 temp= arr.get(end);
				 arr.set(end, arr.get(start));
				 arr.set(start, temp);
				 start++;
				 end--;
		 }
	    }
	 }
}
