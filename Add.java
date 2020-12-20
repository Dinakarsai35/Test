package com.wipro;

import java.util.Scanner;

public class Add {
public String AddAlpha(String input1)
{
	String small="abcdefghijklmnopqrstuvwxyz";
	String cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";char c;int a = 0;int b;
	String res="";
	for(int i=0;i<input1.length();i++)
	{
		char ch=input1.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			if(Character.isLowerCase(ch))
			{
				b=ch-96;
				a=small.charAt(b);
			}
			else if(Character.isUpperCase(ch))
			{
				b=ch-64;
				a=cap.charAt(b);
			}
			
			c= (char) a;
			res=res+String.valueOf(c);
		}
		else
		{
			res=res+String.valueOf(ch);
		}
	}
	return res;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	Add a=new Add();
	System.out.println(a.AddAlpha(input1));
}
}
