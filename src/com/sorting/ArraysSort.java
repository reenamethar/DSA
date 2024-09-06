package com.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to sort primitive type array
		int [] arr = {9, 5, 7, 1, 2 , 8, 10, 6 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// to sort non primitive type array,
		// we need to implement the comparable class and write the compareTo function in the class
		Point arr1[] = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
		//System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		for(int i=0; i< arr1.length; i++) {
			System.out.println(arr1[i].x + " "+ arr1[i].y);
		}
		//System.out.println(Arrays.toString(arr1));
		System.out.println("when class Test does not implement comparable interface");
		Test arr2[] = {new Test(11, 21), new Test(4, 13), new Test(6, 8)};
		Arrays.sort(arr2, new MyCom());
		for(int i=0; i< arr2.length; i++) {
			System.out.println(arr2[i].x + " "+ arr2[i].y);
		}
		System.out.println("To sort even numbers and then odd numbers");
		Integer [] arr3 = {5, 20, 44, 3, 12};
		Arrays.sort(arr3, new EvenOddComp());
		System.out.println(Arrays.toString(arr3));
		
		
	}	
}
class Point implements Comparable<Point>{
	int x;
	int y;
	Point(int x, int y){
		this.x= x;
		this.y= y;
	}
	@Override
	public int compareTo(Point p) {
		// TODO Auto-generated method stub
		return this.x - p.x;
	}
	
}

class Test{
	int x;
	int y;
	Test(int x, int y){
		this.x= x;
		this.y= y;
	}
// if this class does not implement comparable interface Therefore we will write separate
	//class which is comparator class
}

class MyCom implements Comparator<Test>{

	@Override
	public int compare(Test o1, Test o2) {
		// TODO Auto-generated method stub
		return o1.x- o2.x;
	}
	
}
class EvenOddComp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1%2 - o2%2;
	}
	
}