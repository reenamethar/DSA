package com.hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 2, 3, };
		System.out.println(maxLen(arr, 5));

	}
	public static int maxLen(int [] arr, int sum) {
		int n = arr.length;
		HashMap<Integer, Integer> map= new HashMap<>();
		int prefixSum=0;
		int res=0;
		for(int i=0; i<n; i++) {
			prefixSum += arr[i];
			if(prefixSum == sum) {
				res = i+1;
			}
			if(map.containsKey(prefixSum)== false) {
				map.put(prefixSum, i);
			}
			if(map.containsKey(prefixSum-sum)) {
				res = Math.max(res, i-map.get(prefixSum-sum));
			}
		}
		System.out.println(map);
		return res;
	} 

}
