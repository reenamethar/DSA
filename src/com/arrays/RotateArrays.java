package com.arrays;

public class RotateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {30, 5, 20, 7, 9, 1, 3};
		rotateArrayByOne(arr, arr.length);

	}
	
	public static void rotateArrayByOne(int[] arr, int n) {
		int result [] = new int[n];
		for(int i=0; i<n;i++) {
			result[i] = arr[(i+1+n)%(n)];
		}
		for(int i=0; i<n; i++) {
			System.out.print(result[i]+ " ");
		}
		System.out.println();
	}

}
