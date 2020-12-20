package com.wipro;

import java.util.Scanner;

public class Stepnumber {
	public String find(int input1)
	{
		String a="";
		String str=Integer.toString(input1);
		if(str.length()==1)
		{
			a=str+"-"+"false";
		}
		for(int i=0;i<str.length()-1;i++)
		{
			char ch=str.charAt(i);
			char ch1=str.charAt(i+1);
			if(ch-ch1==1|| ch-ch1==-1)
			{
				a=str+"-"+"true";
			}
			else
			{
				a=str+"-"+"false";
			}
		}
		return a;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stepnumber s1=new Stepnumber();
		int input1=sc.nextInt();
		System.out.println(s1.find(input1));
		sc.close();
		}
}
