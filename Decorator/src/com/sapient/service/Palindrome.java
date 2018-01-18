package com.sapient.service;

public class Palindrome {

	public void checkPalindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		if (str.equals(sb.toString()))
			System.out.println(str + "  is a palindrome");
		else
			System.out.println(str + "  is  not a palindrome");
	}
}
