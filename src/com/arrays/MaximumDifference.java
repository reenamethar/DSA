package com.arrays;

public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 10, 6, 4, 8, 1};
		System.out.println(getMaxDiffNaive(arr, arr.length));
		System.out.println(2%1);

	}
	public static int getMaxDiffNaive(int[] arr, int n) {
		//O(n^2)
		int res = Integer.MIN_VALUE;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				res = Math.max(res, arr[j]-arr[i]);
			}
		}
		
		return res;
	}

}
