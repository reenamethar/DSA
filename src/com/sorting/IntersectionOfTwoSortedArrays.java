package com.sorting;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1, 20, 20, 40, 60};
		int[] b= {2, 20, 20, 20,40};
		System.out.println(intersectionNaviveSolution(a, b));
		System.out.println(intersectionEfficient(a, b));

	}
	static ArrayList<Integer> intersectionNaviveSolution(int a[], int b[]){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = a.length;
		int m= b.length;
		for(int i=0; i<n; i++) {
			if(i>0 && a[i]== a[i-1])
				continue;
			for(int j=0; j<m; j++) {
				if(a[i]==b[j]) {
					ans.add(a[i]);
					break;
				}
			}
		}
		return ans;
	}
	static ArrayList<Integer> intersectionEfficient(int a[], int b[]){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = a.length;
		int m = b.length;
		int i=0;
		int j=0;
		while(i<n && j<m) {
			if(i>0 && a[i]== a[i-1]) {
				i++;
				continue;
			}
			if(a[i]< b[j]) {
				i++;
			}else if(a[i]> b[j]) {
				j++;
			}else {
				ans.add(a[i]);
				i++;
				j++;
			}
		}
		return ans;
	}

}
