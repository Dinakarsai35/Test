package com.wipro;

import java.util.Scanner;

public class FixtheFormula {
	public int findForm(String input1)
	{
		String s="";String s1="";
		int sum=0;int count=0;
		char c1[]=new char[input1.length()];int f1=0;
		int f=0;//int arr1[]=new int[arr.length];
		for(int i=0;i<input1.length();i++)
		{
			char ch=input1.charAt(i);
			if(Character.isDigit(ch))
				
			{
				s=s+String.valueOf(ch);
		
			}
			if(!(Character.isAlphabetic(ch))&&(!(Character.isDigit(ch))))
			{
		        c1[f1]=ch;
		       f1++;
			}
		}
		//int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s);
		int temp=i2;
		while(i2>0)
		{
			int r=i2%10;
			count++;
			i2=i2/10;
		}
		int arr[]=new int[count];
		int arr2[]=new int[count];
		while(temp>0)
		{
			int d=temp%10;
			arr[f]=d;
			f++;
			temp=temp/10;
		}
		int dig=count-1;
		for(int j=0;j<count;j++)
		{
			arr2[dig]=arr[j];
			dig--;
		}
		//System.out.println(arr2[0]);
	sum=arr2[0];
				for(int k=0;k<c1.length;k++)
		{
			if(c1[k]=='+')
			{
				sum=sum+arr2[k+1];
			}
			else if(c1[k]=='-')
			{
				sum=sum-arr2[k+1];
			}
			else if(c1[k]=='*')
			{
				sum=sum*arr2[k+1];
			}
			else if(c1[k]=='/')
			{
				sum=sum/arr2[k+1];
			}
		}
		
		
		

		
		
		//System.out.println(s);
		//System.out.println(s1);
		return sum;
		
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		FixtheFormula f=new FixtheFormula();
		System.out.println(f.findForm(input1));
	}

}
