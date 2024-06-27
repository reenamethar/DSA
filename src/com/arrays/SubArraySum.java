package com.arrays;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 4, 20, 3, 10, 5};
		System.out.println(isSubArray(arr, 33));
		int [] arr1 = {4, 8, 12, 5};
		System.out.println(isSubArray(arr, 33));
		System.out.println(isSubArray(arr1, 17));

	}

	/*
	 * public static boolean checkIfSubArraySumExists(int [] arr, int sum) { int n =
	 * arr.length; int initialSum = 0; int maxSum =0; int start=0; int end =0;
	 * while(end<n) { initialSum += arr[end++];
	 * 
	 * if(initialSum == sum) { return true; } while(sum < initialSum) { initialSum
	 * -= arr[start++]; } }
	 * 
	 * return false; }
	 */
	public static boolean isSubArray(int[] arr, int sum) {
		int n = arr.length;
		int curSum =0;
		int s =0;
		for(int e =0; e<n; e++) {
			curSum += arr[e];
			while(sum< curSum) {
				curSum -= arr[s++];
			}
			if(curSum == sum)
				return true;
		}
		return false;
		
	}

}
