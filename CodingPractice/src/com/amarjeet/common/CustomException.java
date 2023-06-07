package com.amarjeet.common;

public class CustomException {
	public static void main(String[] args) {
		try {
			int x=100/0;
			//System.out.println(x);
			throw new ArithmeticException("you can not devide by zero.."+x);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}finally {
			System.out.println("This is will always execute...");
		}
	}
}
