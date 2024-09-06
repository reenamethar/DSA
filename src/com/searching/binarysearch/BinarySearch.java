package com.searching.binarysearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {1, 3, 5, 7, 9};
		System.out.println(bsIterative(arr1, 9));
		System.out.println(bsRecursive(arr1, 0, arr1.length-1, 9));
		int [] arr2 = {1, 4, 7, 9, 12};
		System.out.println(bsIterative(arr2, 2));
		System.out.println(bsRecursive(arr2, 0, arr1.length-1, 2));
		int [] arr3 = {1, 4, 7, 9, 12};
		System.out.println(Arrays.binarySearch(arr3, 8));
	}

	public static int bsIterative(int[] arr, int x) {
		int low=0;
		int high =arr.length-1;
		
		while(low<=high) {
			int mid = low +(high-low)/2;
			if(arr[mid] == x)
				return mid;
			else
			if(arr[mid]>x)
				high = mid-1;
			else
				low = mid+1;
		}
		return -1;
		
	}
	public static int bsRecursive(int[] arr, int low, int high, int x) {
		if(low>high)
			return -1;
		int mid = low+ (high-low)/2;
		if(arr[mid]==x)
			return mid;
		else if(arr[mid]>x)
				return bsRecursive(arr, low, mid-1, x);
		else return bsRecursive(arr, mid+1, high, x);
	}
	

}
