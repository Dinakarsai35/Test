package com.wipro;

import java.util.Scanner;

public class Trial {
	
	public String find(String input1,int input2)
	{
	int sum=0;int sum1=0;String s="";int flag=0;
	switch(input2)
	{
	case 0:
		for(int i=0;i<input1.length();i++)
		{
			char ch=input1.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Integer.parseInt(String.valueOf(ch));
			}
		
		if(sum>0)
		{
			s=s+String.valueOf(sum);
		}
			
			else 
			{
				s="ZERO";
			}
		}
		 if(input1.isEmpty())
		{String s2="";
			s2="NULL";
			s=s2;
		}
		break;
	case 1:
		for(int i=0;i<input1.length();i++)
		{
			String s1="";
			char ch=input1.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				s1=s1+(String.valueOf(ch));
				flag=1;
			}
			if(input1.isEmpty())
			{
				s="NULL";
			}
			else if(flag==0)
			{
				s="ZERO";
			}
			else
			{
				s=s1;
			}
		}
	}
	return s;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		int input2=sc.nextInt();
		Characterorsum c=new Characterorsum();
		System.out.println(c.find(input1,input2));
	}
}
	 
