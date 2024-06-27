package com.searching;

public class SearchInSortedAndRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 20, 30, 40, 50, 8, 9};
		System.out.println(search(arr, 8));
		int [] arr1 = {10, 30, 40, 8, 9};
		System.out.println(search(arr1, 30));
		System.out.println(search(arr1, 100));
		int [] arr2 = {1};
		System.out.println(search(arr2, 4));

	}
	public static int search(int[] arr, int x) {
		int n= arr.length;
		int low=0;
		int high = n-1;
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if(arr[mid]== x) return mid;
			if(arr[low]<= arr[mid]) {
				// left half is sorted
				if(x >= arr[low] && x < arr[mid]) {
					high = mid-1;
				}else {
					low = mid+1;
				}
				
			}
			else {
				// right half is sorted
				if(x > arr[mid] && x <= high) {
					low = mid+1;
				}
				else {
					high = mid+1;
				}
			}
		}
		return -1;
	}

}
