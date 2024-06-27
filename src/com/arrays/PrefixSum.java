package com.arrays;

public class PrefixSum {
	static int[]  arr = {2, 3, 5, 6, 1};
	static int psum[]= new int[arr.length];

	static void preprocessing() {		 
		psum[0]= arr[0];
		for(int i=1; i<arr.length; i++) {
			psum[i] = psum[i-1]+ arr[i];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preprocessing();
		System.out.println(getSumNaiveSolution(2, 3));
		System.out.println(usingPrefixSumTechnique(2, 3));
		System.out.println(getPrefixWeightedSum(2, 3));

	}
	public static int getSumNaiveSolution(int l, int r) {
		// Theta(l-r+1) or 0(n) when l=0 and r = n-1
		int res =0;
		for(int i=l; i<=r; i++) {
			res += arr[i];
		}
		return res;
	}
	public static int usingPrefixSumTechnique(int l, int r) {
		int res =0;
		if(l==0)
			return psum[r];
		else
			return psum[r] - psum[l-1];
		
	}
	public static int getWeigtedSumHelper(int l, int r) {
		int res =0;
		for(int i=l; i<=r; i++) {
			res += i* arr[i];
			System.out.println(res);

		}
		return res;
	}
	public static int getPrefixWeightedSum(int l, int r) {
		int res;
		if(l==0)
			return getWeigtedSumHelper(l,r);
		else
			return  getWeigtedSumHelper(l,r) - ((l-1) * usingPrefixSumTechnique(l, r));
	}

}
