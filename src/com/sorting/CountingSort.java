package com.sorting;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 4, 1, 2, 7, 5, 2};
		countSortNaiveImpl(arr, 10);
		displayArray(arr);
		int [] arr1 = {1, 4, 1, 2, 7, 5, 3};
		countSortGeneral(arr1, 10);
		displayArray(arr1);
		System.out.println(countSort("dbaeks"));

	}
	public static void countSortNaiveImpl(int [] arr, int k) {
		// this implementation does not work for objects
		// elements lies between o to k-1
		int [] count= new int[k];
		int n = arr.length;
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		int index =0;
		for(int i=0; i<k; i++) {
			for(int j=0; j<count[i]; j++) {
				arr[index]= i;
				index++;
			}
		}
	}
	public static void countSortGeneral(int [] arr, int k) {
		// Time O(n+k)
		// auxiliary space O(n)
		int n = arr.length;
		int [] count = new int[k];
		for(int i=0; i<n; i++) {
			count[arr[i]]++;
		}
		for(int i=1; i<k; i++) {
			count[i]= count[i-1]+ count[i];
		}
		int [] output = new int[n];
		for(int i=n-1; i>=0; i--) {
			output[count[arr[i]]-1]= arr[i];
			count[arr[i]]--;
		}
		for(int i=0; i<n; i++) {
			arr[i]= output[i];
		}
		
	}
	//Function to arrange all letters of a string in lexicographical 
	public static String countSort(String arr)
    {
        int [] count= new int[26];
        int len = arr.length();
        String res = "";
        for(int i=0; i<26; i++){
            count[i]=0;
        }
        for(int i=0; i<len; i++){
            count[arr.charAt(i)- 'a']++;
        }
        for(int i=1; i<26; i++){
            count[i]= count[i-1]+count[i];
        }
        char [] output= new char[len];
        for(int i=len-1; i>=0; i--){
            output[count[arr.charAt(i)-'a']-1]= arr.charAt(i);
            count[arr.charAt(i)-'a']--;
        }
        for(int i=0; i<len; i++){
            res += output[i];
        }
        return res;
        
    }
	
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
