package com.sorting;

public class HeapSort {
	// time complexity -> O(N*LogN)
	// Auxiliary space -> O(log n) due to recursive calls, but can be reduced to O(1) by iterative implementation

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr =  {4, 10, 3, 5, 1};
		heapSort(arr);
		displayArray(arr);

	}
	
	public static void heapify(int[] arr, int n, int i) {
		int largest =i;
		int l = 2*i +1;
		int r = 2*i +2;
		// check among the root, left node and right node, which one is largest, and make root as largest by swapping
		if(l<n && arr[l]> arr[largest]) {
			largest =l;
		}
		if(r<n && arr[r]> arr[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = arr[largest];
			arr[largest]= arr[i];
			arr[i]= temp;
			 //heapify the affected sub tree
			heapify(arr, n, largest);
		}
		
	}
	public static void heapSort(int[] arr) {
		int n = arr.length;
		// parent of ith node is (i-1)/2 
		// so parent of n-1th node is (n-1-1)/2 -> (n-2)/2
		// so start it from last internal node
		// below for loop will build a max heap
		for(int i=(n-2)/2; i>=0; i--) {
			heapify(arr, n, i);
		}
		// one by one move current root to the end
		for(int i=n-1; i>=0; i--) {
			int temp = arr[0];
			arr[0]= arr[i];
			arr[i]= temp;
			// call heapify on the remaining nodes
			heapify(arr, i, 0);
		}
	}
	
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
