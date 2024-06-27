package com.searching.ternarysearch;

public class RecursiveWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2, 4, 5, 7, 8, 9, 12, 23, 76, 98};
		System.out.println(ternarySearch(arr, 0, arr.length-1, 9));

	}
	public static int ternarySearch(int[] arr, int l, int r, int key) {
		if(r>=l) {
			int mid1 = l+(r-l)/3;
			int mid2= r -(r-l)/3;
			if(arr[mid1] == key) {
				return mid1;
			}
			else if(arr[mid2] == key) {
				return mid2;
			}
			else if(arr[mid1]>key) {
				return ternarySearch(arr, l, mid1-1, key);
			}
			else if(arr[mid2]< key) {
				return ternarySearch(arr, mid2+1, r, key);
			}
			else {
				return ternarySearch(arr, mid1+1, mid2-1, key);
			}
		}
		return -1;
	}
}
