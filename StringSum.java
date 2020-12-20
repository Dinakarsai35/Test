package com.wipro;

import java.util.Scanner;

public class StringSum {
	public int findSum(String input1)
	{
		
		int a=0,b=0;int sum=0;
		String s="";String s1="";int count=0,count1=0;
		for(int i=0;i<input1.length();i++)
		{
			char ch=input1.charAt(i);
			if(ch=='5')
			{
				//a=i;
				count++;
			}
			if(ch=='8')
			{
				b=i;
				//count1++;
			}
			if(count==1)
			{
				a=i;
			}/*
			else if(count1==1)
			{
				b=i;
			}*/
		}
		
			for(int k=a;k<=b;k++)
			{
				s=s+input1.charAt(k);
				
			}
			for(int j=0;j<input1.length();j++)
			{
				if(j<a||j>b)
				{
				s1=s1+input1.charAt(j);
			}
			}
			int i1=Integer.parseInt(s1);
			int i2=Integer.parseInt(s);
			while(i1>0)
			{
				int d=i1%10;
				sum=sum+d;
				i1=i1/10;
			}
			int sum1=0;
			sum1=sum+i2;
			 //System.out.println(s1);
		return sum1;
		
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		StringSum s=new StringSum();
		System.out.println(s.findSum(input1));
	}

}
