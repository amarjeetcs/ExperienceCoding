package com.amarjeet.array;

public class FindMaxInArray {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=count;
			count++;
			System.out.println(arr[i]);
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("Max element is: "+max);
	}
	

}
