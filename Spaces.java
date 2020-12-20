package com.wipro;

import java.util.Scanner;

public class Spaces {
public String findSpace(String input1)
{
	
	String res="";String str="";String str1="";String str2="";int count=0;
	for(int i=0;i<input1.length();i++)
	{
		char ch=input1.charAt(i);
		if(Character.isLetter(ch))
		{
			str=str+String.valueOf(ch);
		}
		else if(Character.isDigit(ch))
		{
			str1=str1+String.valueOf(ch);
		}
	}
	int n=str.length();
	int a=16-n;
	for(int j=0;j<a;j++)
	{
		str2=str2+" ";
		count++;
	}
	System.out.println(count);
	
	res=str+str2+str1;
	return res;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	Spaces s=new Spaces();
	System.out.println(s.findSpace(input1));
}
}
