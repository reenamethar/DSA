package com.sorting;

public class QuickSortUsingNaivePartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5, 13, 6, 9, 12, 11, 8};
		System.out.println(partition(arr, 0, arr.length-1));
		displayArray(arr);
		quickSort(arr, 0, arr.length-1);
		displayArray(arr);
	}
	public static int partition(int[] arr, int l, int h) {
		int temp[] = new int[h-l+1];
		int pivot = arr[h];
		int index=0;
		// for smaller elements
		for(int i=l; i<=h; i++) {
			if(arr[i]< pivot) {
				temp[index++]= arr[i];
			}
		}
		int position= index;
		temp[index++]= pivot;
		for(int i=l; i<=h; i++) {
			if(arr[i]> pivot) {
				temp[index++]= arr[i];
			}
		}
		for(int i=l; i<=h; i++) {
			arr[i]= temp[i-l];
		}
		return position;
		
	}
	public static void quickSort(int [] arr, int l, int h) {
		if(l<h) {
			int pi = partition(arr, l, h);
			quickSort(arr, l, pi-1);
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
