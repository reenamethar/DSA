package com.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList();
		// 1. adding element to a list
		arr.add(2);
		arr.add(8);
		arr.add(4);
		arr.add(3);
		arr.add(6);
		arr.add(1);
		// 2. change element or set element
		arr.set(2, 7);
		System.out.println(arr);
		// 3. removing or deleting an element
		arr.remove(4);
		System.out.println(arr);
		// 4. iterating the arrayList
		for(int i=0; i< arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
		// 5. get element
		int n = arr.get(2);
		System.out.println(n);
		//6. Add Elements Between Two Numbers
		arr.add(2,9);
		System.out.println(arr);
		// 7. ArrayList Sort
		Collections.sort(arr);
		System.out.println(arr);
		// 8. Size of Elements
		int s = arr.size();
		System.out.println(s);
	}

}
