package com.searching;

public class LastOccurrenceInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5, 5, 5};
		System.out.println(lastOccIterative(arr, 5));
		System.out.println(lastOccRecursive(arr, 0, arr.length-1, 5));
	}
	public static int lastOccIterative(int [] arr, int x) {
		int n = arr.length;
		int low =0;
		int high = n-1; 
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if((arr[mid]==x) &&(mid == n-1 || x!=arr[mid+1])) {
				return mid;
			}
			else if(x < arr[mid]) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	public static int lastOccRecursive(int[] arr, int low, int high, int x) {
		int n = arr.length;
		if(low>high) 
		{
			return -1;
		}
		int mid = low+ (high-low)/2;
		if(( mid == n-1 || arr[mid+1] > x )&& arr[mid] == x) {
			return mid;
		}else if(x < arr[mid]) {
			return lastOccRecursive(arr, low, mid-1, x);
		}
		else {
			return lastOccRecursive(arr, mid+1, high, x);
		}
	}
}

