package com.bitwise;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;


public class TwoOddOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {4, 3,3, 4 , 4, 4, 3, 1};
		int n = arr.length;
		Arrays.sort(arr);
		naive(arr, n);
		efficientWay(arr, n);
	}
	public static void naive(int arr[], int n) {
		Set<Integer> set1 = new HashSet<>();
		for(int i=0; i<n; i++) {
			int count =0;
			for(int j=0; j<n; j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count %2 !=0) {
				set1.add(arr[i]);
			}
		}
		System.out.println(set1);
	}
	
	public static void efficientWay(int arr[], int n) {
		int x =arr[0];
		for(int i=1; i<n; i++)
			x = x ^ arr[i];
		int k = x & (~(x- 1));
		int res1=0, res2=0;
		for(int i=0; i<n; i++) {
			if((arr[i] & k) !=0)
				res1 ^= arr[i];
			else
				res2 ^=arr[i];
		}
		System.out.println(res1 + " " + res2 );
	}

}
