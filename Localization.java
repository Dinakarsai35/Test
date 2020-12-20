package com.wipro;

import java.util.Scanner;

public class Localization {
	public String findLo(String input1)
	{
		int n=input1.length();
		
		int count=0;
		
		String s="";
		if(n<=10)
		{
			s=input1;
		}
		else
		{
			char ch=input1.charAt(0);
			for(int i=1;i<=n-2;i++)
			{
			   count++;
			}
			char ch2=input1.charAt(n-1);
			s=String.valueOf(ch)+String.valueOf(count)+String.valueOf(ch2);
		}
		return s;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		Localization l=new Localization();
		System.out.println(l.findLo(input1));
	}
}
