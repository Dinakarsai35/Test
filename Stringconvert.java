package com.wipro;

import java.util.Scanner;

public class Stringconvert {
	public int find(String input1)
	{
		int n=0;String s1="";int arr[]=new int[1000];int sum=0;int n3=1;
		String str[]=input1.split(" ");
		String s=new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				int n2=str[i].length();
			n3=n2*100;
		 char ch=str[i].charAt(j);
		 n=s.indexOf(ch)+1;
		 if(ch=='.')
		 {
			 n=99;
		 }
		 arr[j]=n+n3;
		 sum=sum+arr[j];
		 System.out.print(arr[j]+" ");
		 
		 
			}
		
	
	
		
		 
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		Stringconvert s=new Stringconvert();
		System.out.println(s.find(input1));
	}
}
