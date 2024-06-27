package com.arrays;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 1, 2, 8, 4, 9, 6};
		System.out.println(largestElement(arr, 7));

	}
	public static int largestElement(int[] arr, int n) {
		int max = arr[0];
		int idx = -1;
		for(int i=1; i<n; i++) {
			if(arr[i] > max )
			{
				max = arr[i];
				idx =i;
				
			}
		}
		return idx;
		
	}

}
