package com.bitwise;

public class BitOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkIfKthBitIsSet(40, 4);
		checkIfKthBitIsSet(40, 5);
		checkIfKthBitIsSet2(40, 6);
		checkIfKthBitIsSet2(10, 3);
		System.out.println(checkKthBit(10, 3));
		System.out.println(countSetBits(7));
		System.out.println(countSetBits(40));
		System.out.println(countSetBits2(40));
		System.out.println(countSetBitsInRange(4));
		checkPowerOfTwo(9);
		checkPowerOfTwo(8);
		System.out.println("Naive solution");
		//checkPowerOfTwoNaiveMethod(13);
		System.out.println(checkPower2(0));
		System.out.println(checkPower2(13));
		System.out.println(checkPower2(32));
		System.out.println(checkPower2(14));
	}
	
	public static void checkIfKthBitIsSet(int n, int k) {
		if((n & (1<< k-1)) !=0)
			System.out.println("Bit is set");
		else
			System.out.println("Bit is unset");
	}
	public static void checkIfKthBitIsSet2(int n, int k) {
		if(((n >>k-1 ) & 1) !=0)
			System.out.println("Bit is set");
		else
			System.out.println("Bit is unset");
	}
	static boolean checkKthBit(int n, int k)
    {
		//if starting from 0th index
        // Your code here
        if((n & (1 <<(k))) !=0)
            return true;
        else
            return false;
    }
	public static int countSetBits(int n) {
		// time -> theta(no if bits)
		int res =0;
		while(n >0) {
			if(n %2 !=0) {
				res ++;
			}
			n/=2;
		}
		return res;
	}
	
	public static int countSetBits2(int n) {
		//using Brian Kerningam's algorithm -> traverse through only set bits ,time -> theta(no of set bits)
		int res =0;
		while(n>0) {
			n = n &(n-1);
			res++;
		}
		return res;
	}
	public static int countSetBitsInRange(int n){
        int count =0;
        // Your code here
        for(int i=1; i<=n; i++){
        	int m =i;
            while(m>0){
                m=m &(m-1);
                count++;
            }
        }
        return count;
    }
	public static void checkPowerOfTwo(int n) {
		if((n &(n-1)) ==0)
			System.out.println("Power of Two");
		else
			System.out.println("Not a power of Two");
		
	}
	
	/*
	 * public static void checkPowerOfTwoNaiveMethod(int n) { while(n %2 == 0) { n =
	 * n/2; if(n ==1) { System.out.println("Power of Two"); return; } }
	 * System.out.println("Not a power of two");
	 * 
	 * 
	 * }
	 */
	
	public static boolean checkPower2(int n) {
		if(n ==0)
			return false;
		while(n !=1) {
			if(n%2 !=0) {
				return false;
			}
			n = n/2;
		}
		return true;
		
	}
	

}
