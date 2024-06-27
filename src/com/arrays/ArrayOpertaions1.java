package com.arrays;

public class ArrayOpertaions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {20, 5, 7, 25};
		System.out.println(search(arr, 4, 5));
		System.out.println(search(arr, 4, 8));
		int[] arr1 = new int[7];
		arr1[0] = 3;
		arr1[1] = 5;
		arr1[2] = 2;
		arr1[3] = 8;
		arr1[4] = 9;
		System.out.println(insert(arr1, 5, 3, 7, 6));
		int [] arr2 = {4, 5, 8, 1, 6};
		System.out.println(delete(arr2, 5, 8));
		

	}
	// 1. search - > O(n)
	public static int search(int[] arr, int n, int x) {
		for(int i=0; i< n; i++)
		{
			if(arr[i] == x)
				return i;
		}
		return -1;
		
	}
	
	// 2. insert in fixed size array
	public static int insert(int[] arr, int n, int pos, int cap, int x) {
		if(n == cap) {
			return n;
		}
		int idx = pos-1;
		for(int i = n-1; i>=idx; i--) {
			arr[i+1] = arr[i];
		}
		arr[idx] = x;
		return n+1;
	}
	// 3. delete an element from an array
	public static int delete(int[] arr, int n , int x) {
		int pos =-1;
		for(int i =0; i<n; i++) {
			if(arr[i] == x) {
				pos = i;
				break;
			}
			
		}
		if(pos ==-1)
			return n;
		
		for(int i = pos ; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		return n-1;
	}
	public static void printArray(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
