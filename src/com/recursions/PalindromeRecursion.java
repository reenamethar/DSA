package com.recursions;

public class PalindromeRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malayalam";
		int end = s.length()-1;
		int start = 0;
		System.out.println(isPalindrome(s, start, end));
		System.out.println(isPalindrom2(s, 0));
		System.out.println(isPalindrom2("abasba", 0));

	}
	public static boolean isPalindrome(String str, int start, int end) {
		if(start>=end)
			return true;
		return ((str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1));
	}
	
	public static boolean isPalindrom2(String str, int i) {
		if(i>str.length()/2)
			return true;
	return ((str.charAt(i) == str.charAt(str.length()-1-i)) && isPalindrom2(str, i+1));	
	}

}
