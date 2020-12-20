package com.wipro;
import java.util.*;
public class Charactersum {
public int find(String input1)
{
	char ch,ch1;
	int a,b,sum1=0;
	
	input1=input1.toUpperCase();
	String res="";
	String s[]=input1.split("\\s");
	for(int i=0;i<s.length;i++)
	{
		int sum=0;
		int n=s[i].length();
		if(n%2==0)
		{
			for(int j=0;j<n/2;j++)
			{
				ch=s[i].charAt(j);
				ch1=s[i].charAt(n-j-1);
				a=ch-64;
				b=ch1-64;
				int e=Math.abs(a-b);
				sum=sum+e;
				
			}
			
		}
		else
		{
			for(int j=0;j<n/2;j++)
			{
				ch=s[i].charAt(j);
				ch1=s[i].charAt(n-j-1);
				a=ch-64;
				b=ch1-64;
				int e=Math.abs(a-b);
				sum=sum+e;
				
			}
			int  d=Math.round(n/2);
		     char ch2=s[i].charAt(d);
		     int s1=(ch2-64);
		     sum=sum+s1;
		     
		     
			
		}
		res=res+String.valueOf(sum);
		
	}
	int r=Integer.parseInt(res);
	return r;
}

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	Charactersum c=new Charactersum();
	System.out.println(c.find(input1));
}
}

