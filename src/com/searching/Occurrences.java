package com.searching;

public class Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2,3 , 4, 4, 4, 4, 4, 5};
		System.out.println(countOccurence(arr));

	}
	//instead of using Linear search time 0(n) , we use binary search time 0(logn)
	public static int firstIndex(int[] arr, int low, int high, int x) {
		if(high>= low) {
			int mid = low + (high-low)/2;
			if(mid ==0 || (x>arr[mid-1]) && arr[mid]==x) {
				return mid;
			}
			else if(x>arr[mid]) {
				return firstIndex(arr, mid+1, high, x);
			}
			else {
				return firstIndex(arr, low, mid-1, x);
			}
			
		}
		return 0;
	}
	public static int lastIndex(int[] arr, int low, int high, int x) {
		if(high>=low) {
			int mid = low + (high-low)/2;
			if(mid ==arr.length-1|| (x<arr[mid+1] && arr[mid] ==x)) {
				return mid;
			}else if(x<arr[mid]) {
				return lastIndex(arr, low, mid-1, x);
			}else {
				return lastIndex(arr, mid+1, high, x);
			}
		}
		return 0;
	}
	public static int countOccurence(int[] arr) {
	int firstIndex = firstIndex(arr, 0, arr.length-1, 4);
	int lastIndex = lastIndex(arr, 0, arr.length-1, 4);
	return lastIndex-firstIndex+1;
	}

}
