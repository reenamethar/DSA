package com.arrays;

import java.util.ArrayList;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println(largestAndSecondLargest(arr.length, arr));
	}
	
	public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        int first, second;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        second = -1;
        first = arr[0];
        for(int i=1; i<sizeOfArray; i++){
            if(arr[i]> first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first)
            {
                second = arr[i];
            }
        }
        arrList.add(first);
        arrList.add(second);
        return arrList;
    }

}
