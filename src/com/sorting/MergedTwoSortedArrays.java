package com.sorting;

import java.util.Map;
import java.util.TreeMap;

public class MergedTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {2, 4, 6, 8};
		int[] arr1 = {1, 3, 5, 7};
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n+m];
		mergeTwo(arr1, arr2, ans);
		displayArray(ans);
		mergeArraysUsingMap(arr1, arr2);

	}
	public static void mergeTwo(int[] a, int [] b, int [] ans) {
		int n = a.length;
		int m = b.length;
		
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(a[i]<=b[j]) {
				ans[k++]= a[i];
				i++;
			}else {
				ans[k++] = b[j];
				j++;
			}
		}
		while(i<n) {
			ans[k++]= a[i];
			i++;
		}
		while(j<m) {
			ans[k++] = b[j];
			j++;
		}
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	// using Map
	//Time Complexity: O( nlog(n) + mlog(m) ) 
	//Auxiliary Space: O(N)


	public static void mergeArraysUsingMap(int[] a, int [] b) {
		int n = a.length;
		int m = b.length;
		Map<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
		for(int i=0; i<n; i++) {
			map.put(a[i], true);
		}
		for(int i=0; i<m; i++) {
			map.put(b[i], true);
		}
		System.out.println(map.keySet());
	}

}
