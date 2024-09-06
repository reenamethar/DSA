package com.arrays;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 10, 10, 12};
		System.out.println(isSorted(arr));
		int arr1[] = {5, 1, 2, 3, 4};
		System.out.println(isSortedAndRotated(arr1, arr1.length));
	}
	
	public static boolean isSorted(int[] arr) {
		
		for(int i=1; i< arr.length; i++) {
			if(arr[i] < arr[i-1])
				return false;
		}
		
		return true;
	}
	
	public static boolean isSortedAndRotated(int arr[], int n) {
		int inversions = findInversions(arr,n);
		if(inversions ==1 && arr[n-1] < arr[0]) {
			return true;
		}
		return false;
	}

	private static int findInversions(int[] arr, int n) {
		int inversions = 0;
		for(int i=0; i<n-1; i++) {
			if(arr[i] > arr[i+1])
				inversions++;
		}
		return inversions;
	}

}
