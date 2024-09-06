package com.arrays;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrList = new ArrayList();
		System.out.println(arrList);
		System.out.println(arrList.size());
		arrList.add(1);
		arrList.add(2);
		arrList.add(4);
		arrList.add(5);
		arrList.add(6);
		arrList.add(3);
		arrList.add(4,8);
		System.out.println("ArrayList: "+ arrList);
		System.out.println(arrList.remove(3));
		System.out.println("ArrayList after deleting element at index 3: "+ arrList);
		System.out.println("Printing element one by one");
		for(int i=0; i< arrList.size(); i++) {
			System.out.print(arrList.get(i)+ " ");
		}
		System.out.println();
		System.out.println(arrList.indexOf(6));
		System.out.println(arrList.toArray());
		System.out.println(arrList.toString());
		
	}

}
