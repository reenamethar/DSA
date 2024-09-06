package com.day.two;

public class ComputePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(naiveMethod(2, 5));
		System.out.println(efficientSolution(4, 5));
		System.out.println(moreEfficient(4, 5));
	}
	public static int naiveMethod(int x, int n) {
		int ans=1;
		if(n==0)
			return 1;
		if(x ==0)
			return 0;
		for(int i=0;i<n;i++) {
			ans= ans * x;
		}
		return ans;
	}
	public static int efficientSolution(int x, int n) {
		if(n==0)
			return 1;
		int temp = efficientSolution(x, n/2);
		temp = temp * temp;
		if(n %2==0)
			return temp;
		else
			return temp * x;
		
	}
	
	// to calculate power in O(n) time complexity and auxiliary space as O(1)
	public static int moreEfficient(int x, int n) {
		int res=1;
		while(n>0) {
			if(n%2 !=0) {
				
				res = res * x;
			}
			x = x*x;
			n = n/2;
			
		}
		return res;
	}
	
}
