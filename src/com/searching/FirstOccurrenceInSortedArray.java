package com.searching;

public class FirstOccurrenceInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5, 5, 5};
		System.out.println(firstOccurrence(arr, 5));
		System.out.println(firstOccurrenceRecursive(arr, 0, arr.length-1, 5));
	}
	public static int firstOccurrence(int[] arr, int x) {
		int low = 0;
		int high = arr.length-1;
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if(arr[mid] == x && (mid == 0 || arr[mid - 1] < x) ) {
				return mid;
			}else if(x > arr[mid]) {
				
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		
		return -1;
	}
	public static int firstOccurrenceRecursive(int [] arr, int low, int high, int x) {
		if(high>=low) {
			int mid = low+(high-low)/2;
			if(arr[mid] == x && (mid == 0 || arr[mid - 1] < x)) {
				return mid;
			}
			else if(x > arr[mid]) {
				return firstOccurrenceRecursive(arr, mid+1, high, x);
			}else {
				return firstOccurrenceRecursive(arr, low, mid-1, x);
			}
		}
		return -1;
	}

}
