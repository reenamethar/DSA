package com.searching.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InbuiltFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr3 = {1, 4, 7, 9, 12};
		System.out.println(Arrays.binarySearch(arr3, 9));
		List al = new ArrayList();
		 al.add(100);
	        al.add(50);
	        al.add(30);
	        al.add(10);
	        al.add(2);
		System.out.println(Collections.binarySearch(al, 10));
		System.out.println(Collections.binarySearch(al, 10, Collections.reverseOrder()));
		
		

	}

}
