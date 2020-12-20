package com.wipro;

import java.util.Scanner;

public class FormTheWord {
public String formWord(String input1)
{
	String res="";int a=0,b=0,c=0;char e;
	String s[]=input1.split(":");
	String small="abcdefghijklmnopqrstuvwxyz";
	//System.out.println(s);
	for(int i=0;i<s.length;i++)
	{
	
			char ch=s[i].charAt(0);
			char ch1=s[i].charAt(1);
			if(ch==ch1)
			{
				res=res+ch;
			}
			else
			{
				 a=Math.abs(ch-ch1);
				 
				 
               			
			res=res+small.charAt(a-1);
		}
	}
	res=res.toUpperCase();
	return res;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	FormTheWord f=new FormTheWord();
	System.out.println(f.formWord(input1));
}
}
