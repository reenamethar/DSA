package com.deque;

public class CircularTourEfficient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] petrol = {4, 8, 7, 4};
		int[] dest = {6, 5, 3, 5};
		int n =4;
		System.out.println(getFirstCircularTour(petrol, dest, n));
	}
	
	public static int getFirstCircularTour(int []petrol, int[] dest, int n) {
		int start=0;
		int curr_petrol =0;
		int prev_petrol =0;
		for(int i=0; i<n; i++) {
			curr_petrol += petrol[i]-dest[i];
			if(curr_petrol <0) {
				prev_petrol = curr_petrol;
				curr_petrol =0;
				start = i+1;
			}
		}
		return ((curr_petrol + prev_petrol >=0)?start+1:-1);
	}

}
