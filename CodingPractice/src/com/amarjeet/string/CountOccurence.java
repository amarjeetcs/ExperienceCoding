package com.amarjeet.string;

public class CountOccurence {
	public static void main(String[] args) {
		String str="amarjeet";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				count++;
			}
				
		}
		System.out.println(count);
	}

}
