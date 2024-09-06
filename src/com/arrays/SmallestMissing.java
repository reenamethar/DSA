package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SmallestMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2, 3, 4, 5};
        //int result = missingNumber2(arr,arr.length);
        //System.out.println("Output: " + result);
		frequencyCount(arr, arr.length, 5);
		
		displayArray(arr, arr.length);
        

	}
	/*
	 * public static int missingNumber(int arr[], int size) { // Your code here int
	 * n = arr.length; int i = 0; while (i < n) { if (arr[i] > 0 && arr[i] <= n &&
	 * arr[i] != arr[arr[i] - 1]) { int temp = arr[arr[i] - 1]; arr[arr[i] - 1] =
	 * arr[i]; arr[i] = temp; } else { i++; } } displayArray(arr, size); for (i = 0;
	 * i < n; i++) { System.out.println(arr[i]); if (arr[i] != i + 1) { return i +
	 * 1; } } return n + 1; }
	 */
	
	public static void displayArray(int arr[], int size) {
		for(int j=0; j< size; j++) {
			 System.out.print(arr[j] + " ");
		}
		System.out.println();
	}
	public static int missingNumber2(int arr[], int size) {
		
		int num =1;
		Arrays.sort(arr);
		for(int i=0; i<size; i++) {
			if(arr[i]== num) {
				num++;
			}
		}
		return num;
	}
	
	 public static void frequencyCount(int arr[], int N, int P)
	 {
	        // code here
	        for(int i=0; i<N; i++){
	            if(arr[i]>N){
	                arr[i]=0;
	                continue;
	            }
	            arr[i]--;
	        }
	        for(int i=0; i<N; i++){
	            if(arr[i]!=0){
	                arr[arr[i]%N] +=N;
	            }
	        }
	        for(int i=0; i<N; i++){
	            
	            
	                arr[i] /=N;
	            
	        }
	    }

	
	

}
