package com.searching;

public class FirstOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 0, 0, 0, 0, 1, 1, 1};
		System.out.println(indexOfFirstOne(arr));
	}
	public static int indexOfFirstOne(int[] arr) {
		int low=0;
		int high =arr.length-1;
		while(high>=low) {
			int mid = low + (high-low)/2;
			if(arr[mid]==1) {
				return mid;
			}
			else if(arr[mid] <1) {
				low = mid +1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}

}
