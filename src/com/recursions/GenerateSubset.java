package com.recursions;
import java.util.*;

public class GenerateSubset {
	public static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsets("ABC", "", 0);
		
		System.out.println(subset("ABC", "", 0));
	}
	public static void subsets(String s, String curr, int i) {
		if(i == s.length())
		{
			System.out.println(curr);
			return;
		}
		subsets(s, curr, i+1);
		subsets(s, curr+ s.charAt(i), i+1);
		
	}
	static ArrayList<String> subset(String s, String curr, int i){
        if(i == s.length())
        {
        	if(arr.contains(curr))
            arr.add(curr);
            return arr;
        }
        subset(s, curr, i+1);
        subset(s, curr + s.charAt(i), i+1);
        return arr;
    }

}
