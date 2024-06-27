package com.searching.ternarysearch;

public class IterativeWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 4, 5, 7, 8, 9, 12, 23, 76, 98};
		System.out.println(ternarySearch(arr,9));
	}
	public static int ternarySearch(int[] arr, int key) {
		int l=0;
		int r = arr.length-1;
		while(l<=r) {
			int mid1 = l+ (r-l)/3;
			int mid2 = r -(r-l)/3;
			if(arr[mid1]==key) {
				return mid1;
			}
			else if(arr[mid2]== key) {
				return mid2;
			}else if(arr[mid1]>key) {
				r = mid1-1;
			}else if(arr[mid2]<key) {
				l = mid2+1;
			}else {
				l = mid1+1;
				r = mid2-1;
			}
		}
		return -1;
		
	}
}
