package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 8, 30, -5, 20, 7};
		System.out.println(naiveSolutionMaxSumSubArray(arr, 4));
		System.out.println(slidingWindowTechnique(arr, 4));
		System.out.println(pattern2(16));
		

	}
	
	public static int naiveSolutionMaxSumSubArray(int[] arr, int k) {
		int n = arr.length;
		int maxSum=Integer.MIN_VALUE;
	 for(int i=0; i< n-k+1; i++) {
		 int j=0;
		 int sum =0;
		 
		 while(j<k) {
			 sum += arr[i+j];
			 
			 j++;
		 }
		 maxSum = Math.max(sum, maxSum);
	 }
	 return maxSum;
	}
	public static int slidingWindowTechnique(int[] arr, int k) {
		int initialSum =0;
		int n = arr.length;
		for(int i=0; i<k ; i++) {
			initialSum +=arr[i];
		}
		int start = 0;
		int end = k;
		int maxSum = initialSum;
		while(end <n) {
			initialSum = initialSum -arr[start] + arr[end];
			start ++;
			end++;
			maxSum = Math.max(initialSum, maxSum);
		}
		return maxSum;
		
	}
	
	public static List<Integer> pattern(int N) {
        List<Integer> sequence = new ArrayList<>();
        int x = N;
        sequence.add(N);
        while(x>0) {
        	sequence.add(x-5);
        	x = x-5;
        }
        while(x!=N) {
        	sequence.add(x+5);
        	x = x+5;
        	
        }
        return sequence;
    }

	/*
	 * public static void generateSequence(int current, int initial, List<Integer>
	 * sequence) { sequence.add(current); System.out.println(current); if (current
	 * <= 0) { generateSequence(current + 5, initial, sequence); return; }
	 * 
	 * if (current <= 0) { generateSequence(current + 5, initial, sequence); } else
	 * if(current >0){ generateSequence(current - 5, initial, sequence); } }
	 */
	public static List<Integer> pattern2(int N) {
        List<Integer> sequence = new ArrayList<>();
        int x = N;
        generateSequence(N, N,  sequence);
        return sequence;
    }
	public static void generateSequence(int current, int initial, List<Integer>sequence) {
		sequence.add(current);
		if(current <=0 || current>initial) {
			return;
		}
		generateSequence(current-5, initial, sequence);
		sequence.add(current);
		
	}
	
}
