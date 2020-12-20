package com.wipro;

import java.util.Scanner;

public class Adddigits {
	public int find(int input1,int input2,int input3,int input4)
	{
		int sum=0,sum1=0;int a=0;
		if(input4==2)
		{
			int o1=input1%10;
			int o2=input2%10;
			int o3=input3%10;
			sum=sum+o1+o2+o3;
		}
		else if(input4==1)
		{
		int tt1=input1;
		int tt2=input2;
		int tt3=input3;
				
				if(tt1>10)
				{
					int ttt1=(tt1/10)%10;
					sum=sum+ttt1;
				}
				else
				{
					a=1;
					sum=sum+a;
				}
				if(tt2>10)
				{
					int ttt2=(tt2/10)%10;
					sum=sum+ttt2;
				}
				else
				{
					a=1;
					sum=sum+a;
				}
				if(tt3>10)
				{
					int ttt3=(tt3/10)%10;
					sum=sum+ttt3;
				}
				else
				{
					a=1;
					sum=sum+a;
				}
				
			
		}
			
		
		else
		{
			int h1=input1;
			int h2=input2;
			int h3=input3;
					
					if(h1>100)
					{
						int hh1=(h1/100);
						sum=sum+hh1;
					}
					else
					{
						a=2;
						sum=sum+a;
					}
					if(h2>100)
					{
						int hh2=(h2/100);
						sum=sum+hh2;
					}
					else
					{
						a=2;
						sum=sum+a;
					}
					if(h3>100)
					{
						int hh3=(h3/100);
						sum=sum+hh3;
					}
					else
					{
						a=2;
						sum=sum+a;
					}
		}
		
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		Adddigits c=new Adddigits();
		System.out.println(c.find(input1,input2,input3,input4));
	}
}
