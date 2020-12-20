package com.wipro;

import java.util.Scanner;

public class Sumofprime {
	public String find(int input1)
	{
		String str=Integer.toString(input1);
		int flag=0;int sum=0;int sum1=0;String re="";String con="";
		
		for(int i=0;i<str.length();i++)
		{
			
			char ch=str.charAt(i);
			int x=Integer.parseInt(String.valueOf(ch));
			
			for(int j=2;j<=Math.sqrt(x);j++)
			{
	
				 if(x%j==0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}


			}
			if((flag==0)&&(x!=0)&&(x!=1))
			{
				con=con+String.valueOf(ch);
				sum=sum+x;
				
			}

		}
		if(sum>0) {
			re=con+":"+sum;
		}
		else {
			char ch2=str.charAt(0);
			char ch1=str.charAt(str.length()-1);
			re=String.valueOf(ch2)+":"+String.valueOf(ch1);
			
		}
			
		return re;
	}
	public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
		
		int input1=sc.nextInt();
		Sumofprime s=new Sumofprime();
		System.out.println(s.find(input1));
	}
}
