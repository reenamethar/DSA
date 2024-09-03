package com.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int naiveMethod(int[] arr) {
		//O(nlogn)
		Arrays.sort(arr);
		int res =1;
		int curr=1;
		for(int i=1; i<arr.length;i++) {
			if(arr[i]==arr[i-1]+1) {
				curr++;
			}else if(arr[i]!= arr[i-1]) {
				res= Math.max(res, curr);
				curr=1;
			}
		}
		return Math.max(res, curr);
	}
	public static int efficientMethod(int[] arr) {
		// 0(n)
		Set<Integer> set = new HashSet<>();
		for(int x: set) {
			set.add(x);
		}
		int res=1;
		for(Integer e: set) {
			if(set.contains(e-1) == false) {
				// it means that its the beginning of the sequence
				int curr=1;
				while(set.contains(e+curr)) {
					curr++;
				}
				res =Math.max(res, curr);
			}
		}
		return res;
	}
}
