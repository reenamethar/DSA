package com.searching;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(usingBinarySearch(17));
		System.out.println(naiveMethod(17));

	}
	public static int usingBinarySearch(int x) {
		//Time Complexity: O(log(X)). 
		int low =1;
		int high = x;
		int ans =-1;
		while(high>=low) {
			int mid = low+ (high-low)/2;
			int msq = mid *mid;
			if(msq == x) {
				return mid;
			}else if(msq > x) {
				high = mid-1;
			}else {
				low = mid+1;
				ans =mid;
			}
		}
		return ans;
	}
	public static int naiveMethod(int x) {
		//Time Complexity: O(√X). Only one traversal of the solution is needed, so the time complexity is O(√X).
		if(x==0 || x==1)
			return x;
		int i=1;
		while(i*i<=x) {
			i++;
		}
		return i-1;
	}

}
