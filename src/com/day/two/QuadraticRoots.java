package com.day.two;
import java.lang.Math;
import java.util.ArrayList;
import java.io.*;

public class QuadraticRoots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(quadraticRoots(1, -7, 12).toString());

	}
	 public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
		 ArrayList<Integer> arrList = new ArrayList<Integer>();
	       double d = Math.pow(b,2) - 4*a*c;
	       int root1= 0;
	       int root2= 0;
	       if(d>0) {
	    	   //roots are real & diff
	    	   root1 = (int)Math.floor((-b + Math.sqrt(d))/2*a); 
	    	   root2 = (int)Math.floor((-b - Math.sqrt(d))/2*a); 
	    	   arrList.add(Math.max(root1, root2));
	    	   arrList.add(Math.min(root1, root2));
	       }
	       else if(d == 0) {
	    	   // roots are real & equal
	    	   root1=root2=(int)Math.floor(-b/(2*a));
	    	   arrList.add(root1);
	    	   arrList.add(root2);
	       }
	       else {
	    	   //d<0 roots are complex & diff
	    	   arrList.add(-1);
	       }
	       
	       return arrList;
	    }
	
}
