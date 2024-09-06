package com.searching;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1 ,79, 29, 20, 4, 1, 0 };
		System.out.println(peakELement(arr));
		System.out.println(peakELementUsingBS(arr));

	}
	public static int peakELement(int[] arr) {
		int n = arr.length;
		if(n==1)
			return arr[0];
		else if(arr[0]>arr[1]) {
			return arr[0];
		}else if(arr[n-1]>arr[n-2]) {
			return arr[n-1];
		}else {
			for(int i=1; i<n-1; i++) {
				if((arr[i]>arr[i-1]) && (arr[i]> arr[i+1])) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	public static int peakELementUsingBS(int[] arr) {
		int low=0;
		int high = arr.length-1;
		while(high>=low) {
			int mid = low +(high-low)/2;
			if((arr[mid]> arr[mid-1]) && (arr[mid]> arr[mid+1])) {
				return arr[mid];
			}
			else if(arr[mid]< arr[mid-1]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		return -1;
	}

}
