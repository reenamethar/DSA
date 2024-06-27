package com.sorting;

public class MergeSortSingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 5, 30, 15, 3};
		sort(arr, 0, arr.length-1);
		displayArray(arr);
		

	}
	public static void merge(int[] arr, int low, int mid, int high) {
		int n1= mid-low+1;
		int [] a1 = new int[n1];
		int n2 = high-mid;
		int [] a2= new int[n2];
		for(int i=0; i<n1; i++) {
			a1[i]= arr[low+i];
		}
		for(int i=0; i<n2; i++) {
			a2[i]= arr[mid+i+1];
		}
		int i=0; 
		int j=0;
		int k=low;
		while(i<n1 && j<n2) {
			if(a1[i]<=a2[j]) {
				arr[k++]= a1[i++];
			}
			else {
				arr[k++]= a2[j++];
			}
		}
		while(i<n1) {
			arr[k++]= a1[i++];
		}
		while(j< n2) {
			arr[k++]= a2[j++];
		}
		
	}
	public static void sort(int[] arr, int l, int r) {
		
		if(r>l) {
			int mid = l+(r-l)/2;
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}