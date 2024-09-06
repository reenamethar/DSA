package com.bitwise;

public class Occurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 4, 7, 4, 8, 7, 7, 7, 8};
		System.out.println(findOneOddOccurrence(arr, 9));
		System.out.println(findOneOddOccurrenceNaive(arr, 9));
		int arr1[] = {10, 3, 3, 5};
		findTwoOddOccurrenceNaive(arr1, 4);
		printPowerSet("abc");

	}
	public static int findOneOddOccurrence(int arr[] ,int n) {
		int res =0;
		for(int i=0; i<n ;i++ ) {
			res = res ^ arr[i];
		}
		
		return res;
	}
	public static int findOneOddOccurrenceNaive(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int count =0;
			for(int j=0; j<n; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count %2 !=0)
				return arr[i];
		}
		return -1;
	}
	public static void findTwoOddOccurrenceNaive(int arr[], int n) {
		for(int i=0; i<n; i++) {
			int count =0;
			for(int j=0; j<n; j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count %2 !=0) {
				System.out.println(arr[i]);
			}
		}
		
	}
	
	public static void printPowerSet(String s) {
		int n = s.length();
		int psize = 1<<n;
		for(int i=0; i< psize; i++) {
			for(int j=0; j<psize; j++)
			{
				if((i & (1<<j)) !=0) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
	

}
