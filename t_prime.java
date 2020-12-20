package com.wipro;

import java.util.Scanner;

public class t_prime {
	public int findt_num(int input1,int input2,int input3)
	{
		
		
		int flag=0,sum=2;int t=1;
		for(int i=2;i<=input2/2;i++)
		{
			if(input2%2==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		   flag=0;
		}
		switch(flag)
		{
		case 0:
			if(input2==2)
			{
				int num=3,a=0;
				for(int j=2;j<=input2;)
				{
					for(int  j1=2;j1<=Math.sqrt(num);j1++)
					{
						if(num%j1==0)
						{
							a=1;
							break;
						}
					}
					if(a==0)
					{
						sum=sum+num;
						j++;
					}
					num++;
				}
				
				t=input1*input1*sum;
			//	System.out.println(t);
			}
			else if(input2%2!=0)
			{
				int num=3,sum1=2;
				for(int j=2;j<=input3;)
				{
					int a=0;
					for(int  j1=2;j1<=Math.sqrt(num);j1++)
					{
						if(num%j1==0)
						{
							a=1;
							break;
						}
					}
					if(a==0)
					{
						
						sum1=sum1+num;
					//	System.out.println(sum1);
						j++;
					}
					num++;
				}
				
				t=input2*input2*sum1;
				System.out.println(t);
			}
			break;
		case 1:
			if(input2!=2&&input2%2==0)
			{
				int num=3,sum1=2;
				for(int j=2;j<=input3+input2;)
				{
					int a=0;
					for(int  j1=2;j1<=Math.sqrt(num);j1++)
					{
						if(num%j1==0)
						{
							a=1;
							break;
						}
					}
					if(a==0)
					{
						
						sum1=sum1+num;
					//	System.out.println(sum1);
						j++;
					}
					num++;
				}
				
				t=input3*input3*sum1;
			//	System.out.println(t);
			}
			else
			{
				int num=3,sum1=2;
				for(int j=2;j<=input3+input2+input1;)
				{
					int a=0;
					for(int  j1=2;j1<=Math.sqrt(num);j1++)
					{
						if(num%j1==0)
						{
							a=1;
							break;
						}
					}
					if(a==0)
					{
						
						sum1=sum1+num;
					//	System.out.println(sum1);
						j++;
					}
					num++;
				}
				
				t=sum1;
				//System.out.println(t);
			}
			break;
		}
		int c=0;
		for(int k=2;k<=t/2;k++)
		{
			if(t%2==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
		   t=t+input3;
		}
		else {
			t=t-input3;
		}
		
		return t;
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int input1=sc.nextInt();
	int input2=sc.nextInt();
	int input3=sc.nextInt();
	t_prime t=new t_prime();
	System.out.println(t.findt_num(input1,input2,input3));
}
}
