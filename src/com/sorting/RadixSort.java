package com.sorting;

public class RadixSort {
	/*
	 * What if the elements are in the range from 1 to n2 ?  
We can’t use counting sort because counting sort will take O(n2) which is worse than comparison-based sorting algorithms. Can we sort such an array in linear time? 
Radix Sort is the answer. 
	 * */
	// it does digit by digit sort starting from LSD to MSD 
	// time -> O(d*(n+b)) where d -> digits in input integer, b-> base for representing numbers
	// application -> you want to sort on three keys month, day and year
	// Auxiliary space -> O(n + b)
	// here we make use of countingSort as subroutine task
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {319, 212, 6, 8, 100, 50};
		radixSort(arr);
		displayArray(arr);
		

	}
	public static void radixSort(int[] arr) {
		int n = arr.length;
		int max = arr[0];
		for(int i=1; i<n ; i++) {
			max= Math.max(max, arr[i]);
		}
		// perform counting sort for each digit place
		for(int exp=1; max/exp>0; exp=exp*10) {
			countingSort(arr, n, exp);
		}
	}
	public static void countingSort(int[] arr, int n, int exp) {
		// digits 0 to 9
		int [] count = new int[10];
		for(int i=0; i<n; i++) {
			count[(arr[i]/exp)%10]++;
		}
		for(int i=1; i<10; i++) {
			count[i]= count[i-1]+ count[i];
		}
		int [] output = new int[n];
		for(int i=n-1; i>=0; i--) {
			output[count[(arr[i]/exp)%10]-1]= arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0; i<n; i++) {
			arr[i]= output[i];
		}
		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
