package com.arrays;

import java.util.ArrayList;
import java.util.Vector;

public class VectorsBasicOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add(1);
		v1.add("Geeks");
		v1.add(5);
		System.out.println(v1);
		Vector<Integer> vec = new Vector();
		// 1. add element
		vec.add(1);
		vec.add(6);
		vec.add(2);
		vec.add(8);
		vec.add(3);
		vec.add(5);
		System.out.println(vec);
		// 2. updating an element
		vec.set(4, 9);
		System.out.println(vec);
		
		// 3. removing element from a vector
		vec.remove(3);
		System.out.println(vec);
		
		// 4. iterating through an array
		for(int i=0; i<vec.size(); i++) {
			System.out.print(vec.get(i) + " ");
		}
		System.out.println();
		
		Vector<Integer> v = new Vector<>(3,2);
		v.addElement(1);
		v.addElement(7);
		v.addElement(3);
		v.addElement(2);
		System.out.println(v);
		v.removeElementAt(3);
		System.out.println(v);
		for(int e: v)
			System.out.print(e+ " ");
		System.out.println();
	}

}
