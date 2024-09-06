package com.arrays;

public class MaxCircularSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5, -4, -3, -4};
		System.out.println(getMaxCircularSubArraySum(arr));
		//System.out.println(inEfficientWay(arr));
		System.out.println(getOverallMaxCircularSum(arr));

	}
	public static int getMaxCircularSubArraySum(int[] arr) {
		int res =arr[0];
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int curr_max = arr[i];
			int curr_sum = arr[i];
			for(int j=1; j<n; j++) {
				int index = (i+j) %n;
				curr_sum += arr[index];
				curr_max = Math.max(curr_max, curr_sum);
			}
			res = Math.max(res, curr_max);
		}
		return res;
	}
	/*
	 * public static int inEfficientWay(int [] arr) { int n = arr.length; int
	 * curMin=arr[0]; int globalMin = arr[0]; for(int i=1; i<n; i++) { curMin =
	 * Math.min(arr[i], curMin+arr[i]); globalMin = Math.min(globalMin, curMin); }
	 * int sum=0; for(int i=0; i< n; i++) { sum += arr[i]; } return sum-globalMin; }
	 */
	public static int getNormalSubArraySum(int[] arr) {
		int globalMax = arr[0];
		int currMax = arr[0];
		int n = arr.length;
		for(int i=1; i<n; i++) {
			currMax = Math.max(arr[i], currMax+arr[0]);
			globalMax = Math.max(currMax, globalMax);
		}
		return globalMax;
	}
	public static int getOverallMaxCircularSum(int[] arr) {
		int normalMax = getNormalSubArraySum(arr);
		int n = arr.length;
		if(normalMax < 0) {
			return normalMax;
		}
		int arrSum =0;
		for(int i=0; i<n; i++) {
			arrSum += arr[i];
			arr[i] = -arr[i];
		}
		int overAllSubArraySum = arrSum + getNormalSubArraySum(arr);
		return Math.max(normalMax, overAllSubArraySum);
		
		
	}

}
