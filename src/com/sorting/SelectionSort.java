package com.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {64,25,12,22,11};
		 selectionSort(arr);
		 displayArray(arr);
	}
	public static void selectionSort(int[]arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j =i+1; j<n; j++) {
				if(arr[j]< arr[minIndex]) {
					minIndex= j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]= temp;
		}
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
