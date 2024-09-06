package com.arrays;

public class EvenOddSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5, 10, 20, 6, 3, 8};
		System.out.println(getMaxLengthOfEvenOddSubarray(arr));
		System.out.println(inEffientWay(arr));
		System.out.println(inEfficientWayTwo(arr));

	}
	public static int getMaxLengthOfEvenOddSubarray(int [] arr) {
		int n = arr.length;
		int res =1;
		for(int i=0; i<n; i++) {
			int curr=1;
			for(int j=i+1; j<n; j++) {
				if((arr[j] %2 ==0 && arr[j-1] %2 != 0) || (arr[j] %2 !=0 && arr[j-1] %2 == 0)) {
					curr++;
				}
				else {
					break;
				}
			}
			res = Math.max(res, curr);
		}
		if(res ==1)
			return 0; // cannot be 1 as it should appear in pair even odd or odd even
		return res;
	}
	public static int inEffientWay(int [] arr) {
		int  res =1;
		int n = arr.length;
		int curr = 1;
		for(int i=1; i<n;i++) {
			if((arr[i] %2 ==0 && arr[i-1] %2 != 0) || (arr[i] %2 !=0 && arr[i-1] %2 == 0)) {
				curr++;
			}
			else {
				curr =1;
				continue;
			}
			res = Math.max(curr, res);
			
			}
		if(res ==1)
			return 0;
		return res;
	}
	public static int inEfficientWayTwo(int[] arr) {
		int n= arr.length;
		int res=1;
		int prev = arr[0] %2;
		int curr=1;
		for(int i=1; i<n; i++) {
			if(prev != arr[i]%2) {
				//System.out.println(curr);
				curr++;
				res = Math.max(curr, res);
			}
			else {
				curr =1;
			}
			prev = arr[i] %2;
		}
		if(res ==1)
			return 0;
		return res;
	}


}
