package com.amarjeet.array;

public class ReverseElementOfArray {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int count=1;
		System.out.println("Array of element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=count;
			count++;
			System.out.println(arr[i]);
		}
		
		System.out.println("Revesing elemet of array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
