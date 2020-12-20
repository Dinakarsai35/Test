package com.wipro;

import java.util.Scanner;

public class TwoDigitPrime {
	public int findTwoDigit(int input1)
	{
		int flag=0;
		int sum=0;int count=0;
		for(int i=11;i<=input1;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				//System.out.println(i);
			    if(input1==i)
			    {
			    	count=1;
			    }
			    while(input1>0)
			    {
			    	
			    }
			 
			    
				
			}
		}
		
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		TwoDigitPrime t=new TwoDigitPrime();
		System.out.println(t.findTwoDigit(input1));
	}

}
