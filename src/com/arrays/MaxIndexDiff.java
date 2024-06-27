package com.arrays;

import java.util.Arrays;

public class MaxIndexDiff {

	public static void main(String[] args)
	{
	  int []v = {34, 8, 10, 3, 2, 80, 30, 33, 1};
	  int n = v.length;
	  int []maxFromEnd = new int[n + 1];
	  Arrays.fill(maxFromEnd, Integer.MIN_VALUE);
	 
	  // Create an array maxfromEnd
	  for (int i = v.length - 1; i >= 0; i--) 
	  {
	    maxFromEnd[i] = Math.max(maxFromEnd[i + 1], 
	                             v[i]);
	  }
	 
	  int result = 0;
	  for (int i = 0; i < v.length; i++) 
	  {
	    int low = i + 1, high = v.length - 1, 
	        ans = i;
	 
	    while (low <= high) 
	    {   
	      int mid = (low + high) / 2;
	   
	      if (v[i] <= maxFromEnd[mid]) 
	      {
	        // We store this as current 
	        // answer and look for further 
	        // larger number to the right side
	        ans = Math.max(ans, mid);
	        low = mid + 1;
	      }
	      else
	      {
	        high = mid - 1;
	      }
	    }
	     
	    // Keeping a track of the
	    // maximum difference in indices
	    result = Math.max(result, ans - i);
	  }
	  System.out.print(result + "\n");
	}

}
