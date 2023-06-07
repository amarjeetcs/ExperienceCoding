package com.amarjeet.string;

public class CountWord {
	public static void main(String[] args) {
		String str="amarjeet kumar singh from bihar";
		/*
		 * int c=1; for(int i=0;i<str.length();i++) { if(str.charAt(i)==' ' &&
		 * i<str.length()-1 && str.charAt(i+1)!=' ') { c++; } } System.out.println(c);
		 */
		String[] s=str.split("\\s+");
		System.out.println((s.length));
	}

}
