package com.wipro;

import java.util.Scanner;

public class Substring {
	
public String findSub(String input1,char input2)
{
	String res="";
	StringBuilder sb=new StringBuilder(input1);
	for(int i=0;i<input1.length();i++)
	{
		char ch=input1.charAt(i);
		if(input2==ch)
		{
			  
		            res=input1.substring(i + 1); 
		}
	}
	
	return res;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	char input2=sc.next().charAt(0);
	Substring s=new Substring();
	System.out.println(s.findSub(input1,input2));
}
}
