package com.recursions;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLucky(5));
		System.out.println(isLucky(13));
	}
	public static boolean isLucky(int n)
    {
        // Your code here
        return isMyLucky(n,2);
        
    }
    
    public static boolean isMyLucky(int n, int counter){
        if(counter > n)
        {
            return true;
        }
        if(n %counter ==0){
            return false;
        }
        
        return isMyLucky((n -(n/counter)), counter+1);
    }

}
