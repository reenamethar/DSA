package com.sorting;

public class QuickSortUsingHoarePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5, 3, 8, 4, 2, 7, 1, 10};
		System.out.println(partition(arr, 0, arr.length-1));
		displayArray(arr);
		quickSort(arr, 0, arr.length-1);
		displayArray(arr);

	}
	public static int partition(int[] arr, int l , int h) {
		int pivot = arr[l];
		int i = l-1;
		int j= h+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j) {
				return j;
			}
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
		}
		
	}
	public static void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int pi = partition(arr, l, h);
			quickSort(arr, l, pi);
			quickSort(arr, pi+1, h);
		}
		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
