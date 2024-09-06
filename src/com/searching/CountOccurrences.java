package com.searching;

public class CountOccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 3, 4, 4, 4, 4, 6};
		System.out.println(countOccurrence(arr, 4));
		System.out.println(countOccurrence(arr, 2));
		int [] arr1 = {2, 3, 3, 3, 3, 5, 6, 7, 8, 9, 10, 11};
		System.out.println(countOccurrence(arr1, 3));
		int [] arr2 = {1, 2, 3, 4, 5, 6,7, 7, 7 ,8};
		System.out.println(countOccurrence(arr2, 7));
		int [] arr3 = {5, 5, 5};
		System.out.println(countOccurrence(arr3, 5));
		System.out.println(countOccurrence(arr3, 8));

	}
	public static int firstIndex(int [] arr, int x) {
		int n = arr.length;
		int low =0;
		int high = n-1;
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if((mid ==0 || arr[mid-1] < x) && arr[mid]== x) {
				return mid;
			}else if(x> arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}
	public static int lastIndex(int[] arr, int x) {
		int n = arr.length;
		int low =0;
		int high = n-1;
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if((mid == n-1 || arr[mid+1]> x) && arr[mid]==x) {
				return mid;
			}else if(x< arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}
	public static int countOccurrence(int[] arr, int x) {
		int first = firstIndex(arr, x);
		if(first == -1) {
			return 0;
		}
		int last = lastIndex(arr, x);
		return last-first+1;
	}

}
