package com.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
	// used when input is uniformly distributed over a range
	/*
	 * to sort floating point numbers from range 0.0 to 1.0
	 * */
	
/*
 * in best case when k=n (every element in diff bucket)
 * time O(n)
 * worst case all element goes into 1 bucket and if we use insertion sort then it will take
 * o(n^2)
 * */

	public static void main(String[] args) {
		int[] arr= {20, 88, 70, 85, 75, 95, 18, 82, 60};
		bucketSort(arr, 5);
		displayArray(arr);
		 
	}
	public static void bucketSort(int[] arr, int k) {
		int n = arr.length;
		int max = arr[0];
		for(int i=1; i<n; i++) {
			max = Math.max(max, arr[i]);
		}
		// incrementing max element by 1 so that we dont assign extra bucket to the max element
		max++;
		ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<k; i++) {
			bucket.add(new ArrayList<Integer>());
		}
		// fill the buckets
		for(int i=0; i<n; i++) {
			int bi= (k*arr[i])/max;
			bucket.get(bi).add(arr[i]);
		}
		// sort each bucket
		for(int i=0; i<k; i++) {
			Collections.sort(bucket.get(i));
		}
		// join sorted buckets
		int index=0;
		for(int i=0; i<k; i++) {
			for(int j=0; j< bucket.get(i).size(); j++) {
				arr[index++] = bucket.get(i).get(j);
			}
		}
		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
