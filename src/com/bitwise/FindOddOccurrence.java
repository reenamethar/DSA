package com.bitwise;

public class FindOddOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {4, 3,3, 4, 4, 4, 3};
		System.out.println(naive(arr));
		System.out.println("Using xor operation");
		System.out.println(usingXorOperations(arr));

	}
	
	public static int naive(int arr[]) {
		// time complexity O(n^2)
		for(int i=0; i< arr.length; i++) {
			int count =0;
			for(int j=0; j<arr.length; j++)
				if(arr[i]== arr[j])
					count ++;
			if(count %2 !=0)
				return arr[i];
		}
		return -1;
		
	}
	public static int usingXorOperations(int arr[]) {
		int res =arr[0];
		for(int i=1; i<arr.length; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

}
