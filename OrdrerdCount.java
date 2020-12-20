package com.wipro;

import java.util.Scanner;

public class OrdrerdCount {
public int finCount(String input1)
{
	String s[]=input1.split(" ");int flag=0;int count=0;
	for(int i=0;i<s.length;i++)
	{
		flag=0;
		for(int j=0;j<s[i].length()-1;j++)
		{
			char ch=s[i].charAt(j);
			char ch1=s[i].charAt(j+1);
			if(ch>ch1)
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			count++;
		}
		else
		{
			count=count;
		}
	}
	
	return count;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String input1=sc.nextLine();
	OrdrerdCount o=new OrdrerdCount();
	System.out.println(o.finCount(input1));
}
}
