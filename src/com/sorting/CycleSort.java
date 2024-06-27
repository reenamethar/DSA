package com.sorting;

public class CycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= { 1, 8, 3, 9, 10, 10, 2, 4 };
		cycleSort(arr);
		displayArray(arr);
	}
	public static void cycleSort(int[] arr) {
		int n = arr.length;
		for(int cs =0; cs<=n-2; cs++) {
			int item = arr[cs];
			int pos = cs;
			for(int i=cs+1; i<n; i++) {
				if(arr[i]< item) {
					pos++;
				}
			}
			if(pos == cs) {
				// item is already at its correct position
				continue;
			}
			// to skip deuplicates
			while (item == arr[pos])
				pos += 1;
			// put the item to its correct position
			if(pos != cs) {
				int temp = arr[pos];
				arr[pos] = item;
				item= temp;
			}
			while(pos != cs) {
				pos= cs;
				for(int i=cs+1; i<n; i++) {
					if(arr[i]< item) {
						pos++;
					}
				}
				// to skip duplicate elements
				while (item == arr[pos]) {
					pos += 1;
				}
				if(item != arr[pos]) {
					int temp = item;
					item = arr[pos];
					arr[pos]= temp;
				}
			}
		}
		
		
	}
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
