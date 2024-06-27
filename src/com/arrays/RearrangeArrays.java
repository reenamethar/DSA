package com.arrays;

public class RearrangeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = {1, 1, 3, 4, 5, 6};
		rearrangeArray(arr, arr.length);
		printArray(arr);

	}
public static void rearrangeArray(long arr[], int n){
        
        // Your code here
        int max_index = n-1;
        int min_index = 0;
        
        int max = (int) arr[n-1]+1;
        
        for(int i=0; i <n; i++){
            
            if(i%2 == 0){
                arr[i] = (arr[max_index] % max) * max + arr[i];
                System.out.println(arr[i]);
                max_index--;
            } else {
                 arr[i] = (arr[min_index] % max) * max + arr[i];
                 System.out.println(arr[i]);
                min_index++;
            }
        } 
        for(int i=0; i<n; i++){
        	
            arr[i] /= max;
        }
    }
	
	 public static void printArray(long arr[]) {
		 System.out.println("After rearranging");
		 for(int i=0; i<arr.length; i++) {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
	 }

}
