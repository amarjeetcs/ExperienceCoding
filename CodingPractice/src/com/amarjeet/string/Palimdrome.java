package com.amarjeet.string;

public class Palimdrome {
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		String org_str=str;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		
		if(org_str.equals(rev))
		{
			System.out.println("palimdrome");
		}
		else
		{
			System.out.println("not palimdrome");
		}
	}

}
