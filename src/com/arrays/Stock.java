package com.arrays;

import java.util.ArrayList;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4, 3, 2, 1};
		System.out.println(stockBuySell(arr, arr.length));

	}
	public static ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
ArrayList<ArrayList<Integer> > finalList = new ArrayList<ArrayList<Integer> >();
        
        int start =0;
        int end = 0;
  
           for(int i=1; i<n;i++){
        	   System.out.println(i);
               if(A[i] >A[i-1]){
            	   System.out.println("end "+end);
                   end++;
                  if(i != n-1) {
                	  continue;
                  }
               }
               if(start != end) {
            	   ArrayList<Integer> arrList = new ArrayList<Integer>();
                   arrList.add(start);
                   arrList.add(end);
                   finalList.add(arrList);
                       start = end+1;
                       end++;
               }
               
           }

        return finalList;
    }
}
