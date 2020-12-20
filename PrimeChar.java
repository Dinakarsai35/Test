package com.wipro;

import java.util.Scanner;

public class PrimeChar {
public String findPrime(String input1)
{
	int flag=0;int sum=0;char s = 0 ;int a=0;String s2="";
	String res="";
	char[] s1 = input1.toCharArray();
	for(int i=0;i<s1.length;i++)
	{
		
		
	a=(int) s1[i];
		for(int j=2;j<=a/2;j++)
		{
			flag=0;
			if(a%j==0)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			s=s1[i];
			s2=s2+String.valueOf(s);
			sum=sum+a;
		}
	}
	res=s2+":"+sum;
	return res;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	PrimeChar p=new PrimeChar();
	System.out.println(p.findPrime(input1));
}
}
