package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 10, 8, 7};
		bubbleSort(arr);
		displayArray(arr);
		int[] arr1= {3, 5, 10, 20, 40};
		bubbleSort(arr1);
		displayArray(arr1);
	}
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) {
			boolean swapped= false;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				break;
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
