package com.amarjeet.common;

public class StringPractical {
	public static void main(String[] args) {
		String str="     amarjeet     Singh      ";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.trim());
		char ch=str.charAt(10);
		System.out.println(ch);
		
		String str1="rajput";
		System.out.println(str.concat(str1));
		System.out.println(str.indexOf(ch));
	}

}
