package com.wipro;

import java.util.Scanner;

public class Vowels {
	public int find(String input1)
	{
		int count=0;
		for(int i=0;i<input1.length();i++)
		{
			char ch=input1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		Vowels v=new Vowels();
		System.out.println(v.find(input1));
	}
}
