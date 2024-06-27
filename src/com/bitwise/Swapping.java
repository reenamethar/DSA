package com.bitwise;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(swapBits(23));

	}
	 static int swapBits(int x)
	    {
	        // Get all even bits of x
	        int even_bits = x & 0xAAAAAAAA; 
	        System.out.println(even_bits);
	        // Get all odd bits of x
	        int odd_bits = x & 0x55555555;
	        System.out.println(odd_bits);
	     
	        // Right shift even bits
	        even_bits >>= 1; 
	         
	        // Left shift even bits
	        odd_bits <<= 1; 
	         
	        // Combine even and odd bits
	        return (even_bits | odd_bits); 
	    }
	 public static int maxConsecutiveOnes(int n) {
		 int count =0;
		 while(n !=0) {
			 n = (n & (n <<1));
			 count ++;
		 }
		 return count;
		 
	 }
}
