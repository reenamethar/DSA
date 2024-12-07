package com.deque;

public class CircularTourNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] petrol = {4, 8, 7, 4};
		int[] dest = {6, 5, 3, 5};
		int n =4;
		System.out.println(getFirstPetrolPump(petrol, dest, n));

	}
	public static int getFirstPetrolPump(int []petrol, int[] dest, int n) {
		for(int start=0; start<n; start++) {
			int curr_Petrol = 0;
			int end = start;
			while(true) {
				curr_Petrol += petrol[end]- dest[end];
				if(curr_Petrol<0) {
					break;
				}
				end = (end+1)%n;
				if(end == start)
					return start+1;
			}
		}
		
		return -1;
	}

}
