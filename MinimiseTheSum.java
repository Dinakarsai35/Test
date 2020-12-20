package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class MinimiseTheSum {
	public int findSum(int[] input1,int input2)
	{
		int sum=0;int b=0;
		int arr[]=new int[input1.length];
		
		
			for(int k=0;k<arr.length;k++)
			{
				arr[k]=input1[k];
			}
			
			
		
			for(int j=0;j<input2;j++)
			{
				Arrays.sort(arr);
				arr[arr.length-1]=arr[arr.length-1]/2;
			}
			
			for(int m=0;m<arr.length;m++)
			{
				sum=sum+arr[m];
			}
			
		
			return sum;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] input1=new int[4];
		for(int i=0;i<4;i++)
		{
			input1[i]=sc.nextInt();
		}
		int input2=sc.nextInt();
		MinimiseTheSum m=new MinimiseTheSum();
		System.out.println(m.findSum(input1, input2));
		
		
	}

}
