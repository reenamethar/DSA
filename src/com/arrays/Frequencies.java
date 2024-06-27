package com.arrays;

public class Frequencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10, 10, 10, 25, 30, 30};
		getFrequenciesInSortedArray(arr);
	}
	
	public static void getFrequenciesInSortedArray(int[] arr) {
		int n = arr.length;
		int freq =1;
		int i=1;
		while(i<n) {
			while(i<n && arr[i]== arr[i-1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i-1]+": " + freq);
			i++;
			freq=1;
		}
		if(n==1 || arr[n-1] != arr[n-2]) {
			System.out.println(arr[n-1]+": " + freq);
		}
	}

}
