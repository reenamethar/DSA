package com.recursions;

public class DigitalRoot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitalRoot(99999));
	}
	public static int digitalRoot(int n)
    {
        // add your code here
		if(n ==0)
		{
			return 0;
		}
        int sum  = n%10 + digitalRoot(n/10);
        if(sum<10)
        	return sum;
        else
        	return digitalRoot(sum);
    }

}
