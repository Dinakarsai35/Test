package com.wipro;

import java.util.Scanner;

public class FirstandLastCharacter {
public String findChar(int input1,String[] input2)
{
	String res="";
	
		int n=input1-1;
			char ch=input2[0].charAt(0);
			char ch1=input2[n].charAt(0);
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'))
			{
				res=input2[0]+input2[n];
			}
			else
			{
				res="NO MATCHES FOUND";
			}
			
		return res;
	
	
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int input1=sc.nextInt();
	String[] input2=new String[input1];
	for(int i=0;i<input1;i++)
	{
		input2[i]=sc.next();
	}
	
	FirstandLastCharacter f=new FirstandLastCharacter();
	System.out.println(f.findChar(input1, input2));
}
}
