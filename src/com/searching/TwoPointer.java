package com.searching;

public class TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 8, 9, 10, 12, 20, 30};
		System.out.println(isPair(arr, 23));

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
