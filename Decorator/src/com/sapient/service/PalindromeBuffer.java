package com.sapient.service;

public class PalindromeBuffer {
 private Palindrome obj;
 public PalindromeBuffer(Palindrome obj){
	 super();
	 this.obj=obj;
 }
 	public void checkpalindrome(String[] arr){
 		for(String str:arr){
 			obj.checkPalindrome(str);
 		}
 	}
 
}
