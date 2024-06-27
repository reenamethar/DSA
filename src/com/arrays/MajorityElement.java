package com.arrays;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 4, 4, 6, 4, 4, 2, 4, 9, 4, 4, 4, 4};
		System.out.println(getMajorityElement(arr));
		System.out.println(inEfficientWay(arr));
		
	}
	
	public static int getMajorityElement(int [] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int count =1;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if(count > n/2)
				return arr[i];
		}
		return -1;
	}
	
	public static int inEfficientWay(int [] arr) {
		//using Moore's voting Algorithm
		int res=0;
		int n = arr.length;
		int count =1;
		for(int i=1; i<n; i++) {
			if(arr[res]== arr[i])
				count++;
			else
				count--;
			if(count ==0) {
				res =i;
				count =1;
			}
			
		}
		count=0;
		for(int i=0; i<n ;i++) {
			if(arr[res] == arr[i])
				count++;
		}
		if(count< n/2)
			return -1;
		return arr[res];
	}

}
