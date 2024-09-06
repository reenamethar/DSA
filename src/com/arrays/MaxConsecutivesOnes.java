package com.arrays;

public class MaxConsecutivesOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0, 1, 1, 0, 0, 1, 1,1, 0, 1};
		System.out.println(maxCons1s(arr));
	}
	public static int maxCons1s(int[] arr) {
		int res =0;
		int temp=0;
		int n = arr.length;
		for(int i=0; i<n ; i++) {
			if(arr[i]== 0) {
				temp=0;
				continue;
			}
			temp++;
			res = Math.max(temp, res);
		}
		
		return res;
	}

}
