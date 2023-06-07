package com.amarjeet.string;

public class CountVowelAndConsonent {
	public static void main(String[] args) {
		String str="amarjeet";
		int vowelCount=0;
		int consonentCount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowelCount++;
			}
			else
			{
				consonentCount++;
			}
		}
		System.out.println(vowelCount);
		System.out.println(consonentCount);
	}
}
