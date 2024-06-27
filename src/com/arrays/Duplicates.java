package com.arrays;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 10, 20, 30, 30, 40, 40};
		//System.out.println(removeDuplicates(arr, arr.length));
		System.out.println(removeDuplicatesSpaceConstant(arr, arr.length));

	}
	public static int removeDuplicates(int arr[], int n) {
		// time 0(n)
		// space 0(n)
		int temp[] = new int[n];
		temp[0] = arr[0];
		int res=1;
		for(int i=1; i<n; i++) {
			if(temp[res-1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		for(int i=0; i<res; i++) {
			arr[i]=temp[i];
		}
		return res;
	}
	
	public static int removeDuplicatesSpaceConstant(int arr[], int n) {
		int res =1;
		for(int i=1; i<n; i++) {
			if(arr[res-1] != arr[i]) {
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}
	

}
