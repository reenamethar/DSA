package com.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1, 20, 20, 40, 60};
		int[] b= {2, 20, 20, 20,40};
		System.out.println(unionOfSortedArrayNaive(a, b));
		System.out.println(unionOfSortedArrayEfficient(a, b));

	}
	
	static ArrayList<Integer> unionOfSortedArrayNaive(int[] a, int[] b){
		int n = a.length;
		int m = b.length;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] c= new int[n+m];
		for(int i=0; i<n; i++) {
			c[i] = a[i];
		}
		for(int i=0; i<m; i++) {
			c[m+i] = b[i];
		}
		Arrays.sort(c);
		for(int i=0; i< n+m ; i++) {
			if(i==0 || c[i] != c[i-1] ) {
				ans.add(c[i]);
			}
		}
		return ans;
	}
	static ArrayList<Integer> unionOfSortedArrayEfficient(int[] a, int[] b){
		int n = a.length;
		int m = b.length;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i=0;
		int j=0;
		while(i<n && j<m) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if(j>0 && b[j] == b[j-1]) {
				j++;
				continue;
			}
			if(a[i]< b[j]) {
				ans.add(a[i]);
				i++;
			}else if(a[i]> b[j]) {
				ans.add(b[j]);
				j++;
			}else {
				ans.add(a[i]);
				i++;
				j++;
			}
		}
		while(i<n) {
			if(i>0 && a[i]!= a[i-1]) {
				ans.add(a[i]);
			}
			i++;
		}
		while(j<m) {
			if(j>0 && b[j] != b[j-1]) {
				ans.add(b[j]); 
			}
			j++;
		}
		return ans;
	}
	

}
