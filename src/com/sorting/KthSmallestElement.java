package com.sorting;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 80, 30, 90, 40, 50, 70};
		System.out.println(partition(arr, 0, arr.length-1));
		displayArray(arr);
		System.out.println(kthSmallestElement(arr, 3));
	}
	public static int kthSmallestElement(int[] arr, int k) {
		int n = arr.length;
		int l = 0;
		int h= n-1;
		while(l<=h) {
			int p = partition(arr, l , h);
			if(p==k-1)
				return arr[p];
			else if(p>k-1) {
				h = p-1;
			}else {
				l= p+1;
			}
			
		}
		return -1;
		
	}
	public static int partition(int[] arr, int l, int h) {
		// TODO Auto-generated method stub
		int i = l-1;
		int pivot = arr[h];
		int temp =0;
		for(int j=l; j<h; j++) {
			if(arr[j]< pivot) {
				++i;
				temp= arr[j];
				arr[j]= arr[i];
				arr[i]= temp;
				
			}
		}
		++i;
		temp = arr[i];
		arr[i]= arr[h];
		arr[h]= temp;
		return i;
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}