package com.sorting;

public class NumberOfPairs {
	/*
	 * Given two positive integer arrays X of size M and Y of size N,
	 * find the number of pairs such that xy > yx (raised to power of) where x is an element from X and y is an element from Y. 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {2, 3, 4, 5};
		int y[] = {1, 2, 3};
		System.out.println(countPairs(x, y, x.length, y.length));

	}
	public static long countPairs(int x[], int y[], int M, int N) {

		long c0=0;
		long c1=0;
		long c2=0;
		long c3=0;
		long c4 = 0;
		for(int i=0; i<N; i++) {
			if(y[i]== 0) {
				c0++;
			}else if(y[i]== 1){
				c1++;
			}else if(y[i]== 2){
				c2++;
			}else if(y[i]== 3){
				c3++;
			}else if(y[i]== 4){
				c4++;
			}
		}
		int j =0;
		long ans =0;
		for(int i=0; i<M; i++) {
			if(x[i]==0) {
				continue;
			}else if(x[i]==1) {
				ans += c0;
			}else {
				ans += c0+c1;
				while(j<N && y[j]<= x[i]) {
					j++;
				}
				ans += N-j;
				if(x[i]==2) {
					ans -= c3;
					ans -= c4;
				}
				else if(x[i]==3) {
					ans += c2;
				}
			}
		}
		return ans;
	}

}
