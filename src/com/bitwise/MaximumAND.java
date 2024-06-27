package com.bitwise;

public class MaximumAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 8, 2};
		System.out.println(maxAND(arr, arr.length));

	}
	
	static int maxAND(int arr[], int n) {
		int res=0, count=0;
		for(int bit =31; bit>=0; bit--) {
			count = checkBit(res|1<<bit, arr, n);
			if(count>=2) {
				res |=1<<bit;
			}
		}
		return res;
	}

	static int checkBit(int pattern, int[] arr, int n) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<n; i++) {
			if((pattern & arr[i]) == pattern)
				count++;
		}
		return count;
	}

}
