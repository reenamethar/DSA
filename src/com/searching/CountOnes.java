package com.searching;

public class CountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
		countOnes(arr);
		int [] arr1 = {1, 1, 1, 1};
		countOnes(arr1);
		int[] arr2 = {0, 0, 0, 0};
		countOnes(arr2);
		
		
	}
	public static int OnesFirstIndex(int [] arr) {
		int n = arr.length;
		int low=0;
		int high =n-1;
		while(high>=low) {
			int mid = low+ (high-low)/2;
			if((mid ==0 || arr[mid-1] !=1) && arr[mid]==1) {
				return n-mid;
			}else if(1> arr[mid]) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;	
	}
	public static void countOnes(int[] arr) {
		int count = OnesFirstIndex(arr);
		if(count ==-1) {
			System.out.println("No one's found");
		}else {
			System.out.println(count);
		}
		
	}

}
