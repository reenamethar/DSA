package com.bitwise;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 8, 12, 16} ;
		maxAndNaive(arr);
		int arr2[]= {4, 8, 16, 2} ;
		maxAndNaive(arr2);
		System.out.println("Using Bitwise operators");
		System.out.println(maxANDBitwise(arr, 4));
		System.out.println(maxANDBitwise(arr2, 4));

	}
	public static void maxAndNaive(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i< arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				/*
				 * if((arr[i] & arr[j]) > max) { max= (arr[i] & arr[j]); }
				 */
				max = Math.max(max, (arr[i] & arr[j]));
				
			}
		}
		System.out.println(max);
		
	}
	 static int maxANDBitwise(int arr[], int n) {
		int res =0, count;
		for(int bit=31; bit>=0; bit--) {
			count = checkBit(res | (1<<bit), arr, n);
		if(count >=2 )
			res |=(1<<bit);
		}
		return res;
		
	}
	 static int checkBit(int pattern, int[] arr, int n) {
		// TODO Auto-generated method stub
		 int count =0;
		 for(int i=0; i<n; i++) {
			 if((pattern & arr[i]) == pattern)
				 count++;
		 }
		return count;
	}

}
