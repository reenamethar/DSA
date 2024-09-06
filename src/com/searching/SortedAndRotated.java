package com.searching;

public class SortedAndRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10, 20, 30, 40, 50, 8, 9};
		System.out.println(searchInSortedRotatedArray(arr, 30));
		int [] arr1 = {100, 200, 300, 10, 20};
		System.out.println(searchInSortedRotatedArray(arr1, 40));

	}
	public static int searchInSortedRotatedArray(int[] arr, int x) {
		int n = arr.length;
		int min=0;
		for(int i=0; i<n; i++) {
			if(arr[i]<arr[min]) {
				min =i;
			}
		}
		if(arr[min] == x)
			return min;
		int first = binarySearch(arr, x, 0, min-1);
		if(first ==-1)
			return binarySearch(arr, x, min+1,n-1);
		else
			return first;
	}
	
	public static int binarySearch(int[] arr, int x, int low ,int high) {
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if(arr[mid]==x) {
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

}
