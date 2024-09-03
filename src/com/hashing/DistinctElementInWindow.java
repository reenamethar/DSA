package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementInWindow {
	// Given an array of size n and an integer k, return the count of distinct numbers in all windows of size k. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 10, 5, 3, 20, 5};
		System.out.println(naiveMethod(arr, 4));
		System.out.println(efficientMethod(arr, 4));
	}
	public static ArrayList<Integer> naiveMethod(int[] arr, int k) {
		// O((n-k)*k *k)
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0; i<=n-k; i++) {
			int count=0;
			for(int j=0; j<k; j++) {
				boolean flag = false;
				for(int p=0; p<j; p++) {
					// to check if we have got that element before in that windows
					if(arr[i+j]==arr[i+p]) {
						flag =true;
						break;
					}
				}
				if(flag==false) {
					count++;
				}
			}
			ans.add(count);
		}
		return ans;
	}
	public static ArrayList<Integer> efficientMethod(int[] arr, int k){
		/*
		 * Complexity Analysis: 
Time complexity O(n). A single traversal of the array is required.
Space Complexity O(n). Since the hashmap requires linear space.
 
*/
		ArrayList<Integer> ans = new ArrayList<>();
		int n = arr.length;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<k; i++) {
			// put the elements of first window in the map
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		// add the distinct elements of the first window
		ans.add(hm.size());
		for(int i=k; i<n; i++) {
			// remove the last element of the previous window
			if(hm.get(arr[i-k])==1) {
				// if only 1 occ then directly remove it
				hm.remove(arr[i-k]);
			}else {
				// subtract the occ by 1
				hm.put(arr[i-k], hm.get(arr[i-k])-1);
			}
			
			// add the first element of the next window
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			ans.add(hm.size());
		}
		
		return ans;
	}
}
