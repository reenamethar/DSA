package com.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {20, 5, 40, 60, 10, 30};
		insertionSort(arr);
		displayArray(arr);
		
	}
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			int j= i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
