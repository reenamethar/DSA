package com.arrays;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10, 0, 6, 0, 3, 0, 8, 20,0};
		printArray(arr);
		//moveZerosToEnd(arr, arr.length);
		moveZerosToEndNaiveMethod(arr, arr.length);
		printArray(arr);
		int a = 5;
		int b =6;
		System.out.println("Before"+ a + " " + b);
		System.out.println("After"+ a + " " + b);
	}
	
	public static void moveZerosToEnd(int[] arr, int n) {
		int count =0;
		for(int i=0; i<n; i++) {
			if(arr[i]!= 0) {
				arr[count++] = arr[i];
			}
		}
		System.out.println("count");
		for(int i=count; i<n; i++) {
			arr[i] = 0;	
		}
		
	}
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void moveZerosToEndNaiveMethod(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			if(arr[i] == 0) {
				for(int j=i+1; j<n; j++) {
					if(arr[j] != 0) {
						int temp=arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						break;
					}
				}
			}
		}
	}

}
