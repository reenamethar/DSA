package com.recursions;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 20, 15, 25};
		System.out.println(countSubsetSum(arr, arr.length, 25));
	}
	
	public static int countSubsetSum(int arr[],int n, int sum) {
		if(n==0)
			return sum ==0 ? 1:0;
		
		return countSubsetSum(arr,n-1, sum) + countSubsetSum(arr, n-1, sum-arr[n-1]);
		
	}

}
