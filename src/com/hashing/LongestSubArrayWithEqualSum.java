package com.hashing;

import java.util.HashMap;

public class LongestSubArrayWithEqualSum {
	// longest common span with same sum
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {0, 1, 0, 0, 0, 0};
		int arr2[] = {1, 0, 1, 1, 0, 1};
		System.out.println(maxSumNaive(arr1, arr2));
		System.out.println(maxSumEfficient(arr1, arr2));

	}
	public static int maxSumNaive(int arr1[] , int arr2[]) {
		// both arrays are of same length
		int n = arr1.length;
		int res =0;
		for(int i=0; i<n; i++) {
			int sum1 =0;
			int sum2=0;
			for(int j=i; j<n; j++) {
				sum1 += arr1[j];
				sum2 += arr2[j];
				if(sum1 == sum2) {
					res = Math.max(res, j-i+1);
				}
			}
		}
		return res;
	}

	public static int maxSumEfficient(int arr1[] , int arr2[]) {
		// longest subarray with sum 0 in an array
		// 1. compute a difference in an array
		int n = arr1.length;
		int [] temp = new int[n];
		for(int i=0; i<n; i++) {
			temp[i]= arr1[i]- arr2[i];
		}
		// now find the longest subarray with sum 0 in an array
		int prefixSum = 0;
		int res =0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
			prefixSum += temp[i];
			if(prefixSum == 0) {
				res = i+1;
			}
			if(map.containsKey(prefixSum)== false) {
				map.put(prefixSum, i);
			}
			if(map.containsKey(prefixSum)) {
				res = Math.max(res, i-map.get(prefixSum));
			}
			
		}
		return res;
	}
}
