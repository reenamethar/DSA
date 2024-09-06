package com.hashing;

import java.util.HashMap;

public class LongesrSubArrayWith0And1 {
	// equal 0 and 1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 0, 1, 0};
		System.out.println(longestSubNaiveMethod(arr, arr.length));
		System.out.println(LongestSubEifficient(arr, arr.length));

	}
	public static int longestSubNaiveMethod(int[] arr, int n) {
		// time O(n^2)
		int res=0;
		for(int i=0; i<n; i++) {
			int c0=0;
			int c1=0;
			for(int j=i; j<n; j++) {
				if(arr[j]==0) {
					c0++;
				}else {
					c1++;
				}
				if(c0==c1) {
					res = Math.max(res, c0+c1);
				}
			}
		}
		return res;
	}
	public static int LongestSubEifficient(int[] arr, int n) {
		// replace 0 with -1
		// and then find longest sub array with sum as 0
		// time O(n) and space O(n)
		for(int i=0; i<n; i++) {
			if(arr[i]==0) {
				arr[i] =-1;
			}
		}
		int prefixSum =0;
		int count =0;
		HashMap<Integer, Integer> map = new HashMap<>(); 
		for(int i=0; i<n; i++) {
			//System.out.println(arr[i]);
			prefixSum +=arr[i];
			if(prefixSum == 0) {
				count = i+1;
			}
			if(map.containsKey(prefixSum)== false) {
				map.put(prefixSum, i);
			}
			if(map.containsKey(prefixSum)) {
				count = Math.max(count, i-map.get(prefixSum));
			}
			
		}
		return count;
	}

}
