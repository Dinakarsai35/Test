package com.wipro;

import java.util.Scanner;

public class Nobitanumber {
public int findNobita(int input1,int input2)
{
	
	int sum=0;int d=0,s=0;int h=0;
	for(int i=input1;i<=input2;i++)
	{
		if(i>=10&& i<=99)
		{
			d=i%10;
			s=i/10;
			if(s-d==1 || s-d==-1)
			{
				sum=sum+i;
			}
			else
			{
				sum=sum+0;
			}
			
		}
		else if(i>=100 && i<=999)
		{
			int d1=i%10;
			int s1=i/10;
		int	h1=i/100;
			//System.out.println("sai");

			if(((h1-s1==1)||(h1-s1==-1))&&((s1-d1==1)||(s1-d1==-1)))
			{
				sum=sum+0;
				
			}
			else
			{
				sum=sum+i;
			}
			
		}
	}
	return sum;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int input1=sc.nextInt();
	int input2=sc.nextInt();
	Nobitanumber n=new Nobitanumber();
	System.out.println(n.findNobita(input1, input2));
	}
}
