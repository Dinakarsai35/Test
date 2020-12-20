package com.wipro;

import java.util.Scanner;

public class Cyclic {
	public int find(int input1)
	{
		
		int s=0,sum=0,sum1=0;
		String n=Integer.toString(input1);
		for(int i=0;i<n.length();i++)
		{
			for(int j=i;j<n.length();j++)
			{
				sum=sum+Integer.parseInt(String.valueOf(n.charAt(j)));
			}
		}
		return sum;
		
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		Cyclic c=new Cyclic();
		System.out.println(c.find(input1));
	}
}
