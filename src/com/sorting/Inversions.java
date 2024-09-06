package com.sorting;

public class Inversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {40, 30, 20, 10};
		System.out.println(inversionsNaive(a));
		System.out.println(countInv(a, 0, a.length-1));

	}
	public static int inversionsNaive(int[] a) {
		int n = a.length;
		int res=0;
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i]> a[j]) {
					res++;
				}
				
			}
		}
		return res;	
	}
	// efficient
	public static int countInv(int arr[], int l, int r) {
		int res =0;
		if(l<r) {
			int m = l+ (r-l)/2;
			res += countInv(arr, l, m);
			res += countInv(arr, m+1, r);
			res += countAndMerge(arr, l, m, r);		
		}
		return res;
	}
	public static int countAndMerge(int[] arr, int l, int m, int r) {
		int res =0;
		int n1 = m-l+1;
		int n2 = r-m;
		int [] left = new int[n1];
		int [] right = new int[n2];
		for(int i=0; i<n1; i++) {
			left[i]= arr[l+i];
		}
		for(int i=0; i<n2; i++) {
			right[i]= arr[m+1+i];
		}
		int i=0;
		int j=0;
		int k=l;
		while(i<n1 && j<n2) {
			if(left[i]<= right[j]) {
				arr[k]= left[i];
				i++;
			}else {
				arr[k]= right[j];
				j++;
				res += n1-i;
			}
			k++;
		}
		while(i<n1) {
			arr[k]= left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]= right[j];
			j++;
			k++;
		}
		return res;
	}
}
