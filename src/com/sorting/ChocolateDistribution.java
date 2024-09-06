package com.sorting;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7, 3, 2, 4, 9, 12, 56};
		System.out.println(distribution(arr, 3));

	}
	public static int distribution(int[] arr, int m) {
		int n = arr.length;
		if(m>n) {
			return -1;
		}
		Arrays.sort(arr);
		int res = arr[m-1]-arr[0];
		for(int i=1; (i+m-1)<n; i++) {
			res = Math.min(res, arr[i+m-1]-arr[i]);
		}
		return res;
	}

}
