package com.recursions;

import java.util.ArrayList;

public class KeyPad {
	public static String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {2, 3, 4};
		System.out.println(possibleWords(a, 3));

	}
	static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        ArrayList<String> arr = new ArrayList<String>();
        return printComb(a,N, 0, "", arr);
    }
    
    static ArrayList <String> printComb(int a[], int N, int idx, String comb, ArrayList <String> arrList){
        if(idx == N){
            arrList.add(comb);
            return arrList;
        }
        String mapping = keypad[a[idx]];
        for(int i=0; i<mapping.length(); i++ ){
              printComb(a, N, idx+1, comb + mapping.charAt(i),arrList );
        }
        
        return arrList;
    }

}
