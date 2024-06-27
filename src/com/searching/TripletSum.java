package com.searching;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 4, 8, 9, 20, 40};
		System.out.println(tripletSum(arr, 33));

	}
	public static boolean tripletSum(int[] arr, int sum) {
		for(int i=0; i< arr.length; i++) {
			if(isPair(arr, sum-arr[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isPair(int[] arr, int x) {
		int low=0;
		int high=arr.length-1;
		while(high>low) {
			int sum =arr[low]+ arr[high];
			if(sum==x) {
				return true;
			}
			else if(sum>x) {
				high--;
			}else {
				low++;
			}
		}
		return false;
		
	}

}
