package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(); 
        list.add(10); 
        list.add(5); 
        list.add(20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // using comparable interface
        List<PointClass> listPoint = new ArrayList<PointClass>(); 
        listPoint.add(new PointClass(13, 8)); 
        listPoint.add(new PointClass(7, 15)); 
        listPoint.add(new PointClass(23, 56));
        Collections.sort(listPoint);
        for(int i=0; i<listPoint.size(); i++) {
        	System.out.println(listPoint.get(i).x + " " + listPoint.get(i).y);
        }
        List<TestClass> listTest = new ArrayList<TestClass>(); 
        listTest.add(new TestClass(13, 8)); 
        listTest.add(new TestClass(7, 15)); 
        listTest.add(new TestClass(23, 56));
        Collections.sort(listTest, new MyComClass());
        for(int i=0; i<listTest.size(); i++) {
        	System.out.println(listTest.get(i).x + " " + listTest.get(i).y);
        }
	}

}
class PointClass implements Comparable<PointClass>{
	int x;
	int y;
	PointClass(int x, int y){
		this.x= x;
		this.y= y;
	}
	@Override
	public int compareTo(PointClass p) {
		// TODO Auto-generated method stub
		return this.x - p.x;
	}
	
}

class TestClass{
	int x;
	int y;
	TestClass(int x, int y){
		this.x= x;
		this.y= y;
	}
}

class MyComClass implements Comparator<TestClass>{

	@Override
	public int compare(TestClass o1, TestClass o2) {
		// TODO Auto-generated method stub
		return o1.x- o2.x;
	}
	
}
