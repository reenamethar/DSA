package com.arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {4, 2, -2};
		int [] arr2 = {1, 6, 3, 5, 2};
		int [] arr3 = {3 -3, 5};
		System.out.println(ePointEfficientSolution(arr1));
		System.out.println(ePointEfficientSolution(arr2));
		System.out.println(ePointEfficientSolution(arr3));
		int [] arr4 = {1, 3, 6, 2, 7, 1, 2, 8};
		System.out.println(threeEqualSegment(arr4));
		int[] arr5 = {7, 6, 1, 7};
		System.out.println(threeEqualSegment(arr5));
		int [] arr6 = {7, 6, 2, 7};
		System.out.println(threeEqualSegment(arr6));
	}
	
	public static boolean ePointEfficientSolution(int arr[]) {
		int n =arr.length;
		int rs = 0;
		for(int i=0; i<n; i++) {
			rs += arr[i];
		}
		int ls=0;
		for(int i=0; i<n; i++) {
			rs -=arr[i];
			if(ls == rs)
				return true;
			ls += arr[i];
		}
		return false;
	}
	public static boolean threeEqualSegment(int arr[]) {
		int n = arr.length;
		int totalSum = 0;
		for(int i=0; i<n; i++) {
			totalSum = totalSum + arr[i];
		}
		if(totalSum % 3 !=0)
			return false;
		int partitionSum = totalSum/3;
		int partitionCount =0;
		int sum =0;
		for(int i=0; i<n; i++) {
			sum +=arr[i];
			if(sum ==partitionSum && partitionCount <=3) {
				partitionCount++;
				sum =0;
			}
		}
		return partitionCount ==3;
	}

}
