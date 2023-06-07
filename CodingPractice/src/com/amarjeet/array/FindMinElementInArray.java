package com.amarjeet.array;

public class FindMinElementInArray {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=count;
			count++;
			System.out.println(arr[i]);
		}
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Min element is: "+min);
	}

}
