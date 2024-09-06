package com.sorting;

public class QuickSortUsingLomutoPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 80, 30, 90, 40, 50, 70};
		//System.out.println(partition(arr, 0, arr.length-1));
		quickSort(arr, 0, arr.length-1);
		displayArray(arr);
		int[] arr1 = {70, 60, 80, 40, 30};
		quickSort(arr1, 0, arr1.length-1);
		displayArray(arr1);
		

	}
	
	public static int partition(int [] arr, int l , int h) {
		int pivotPosition =h;
		int pivot = arr[h];
		int index=l-1;
		int temp = 0;
		for(int j=l; j<h; j++) {
			if(arr[j]<pivot) {
				++index;
				temp= arr[index];
				arr[index] = arr[j];
				arr[j]= temp;
			}
		}
		pivotPosition = ++index;
		temp = arr[index];
		arr[index] = pivot;
		arr[h]= temp;
		return pivotPosition;	
	}
	public static void quickSort(int[] arr, int l, int h) {
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
