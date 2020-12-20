package com.wipro;

import java.util.Scanner;

public class Uncommon {
		public int find(char[] input1,char[] input2)
		{
			int s=0;int sum=0,sum1=0;int f=0;int sum2=0;
			for(int i=0;i<input1.length;i++)
			{
				f=0;
				for(int j=0;j<input2.length;j++)
				{
					if(input1[i]==input2[j])
					{
						f=1;
						break;
					}
					
				}
				if(f==0) {
					sum=sum+input1[i];
				}
			}
			for(int i=0;i<input2.length;i++)
			{
				f=0;
				for(int j=0;j<input1.length;j++)
				{
					if(input2[i]==input1[j])
					{
						f=1;
						break;
					}
					
				}
				if(f==0) {
					sum=sum+input2[i];
				}
			}
			
			
			while(sum>0)
			{
				int r=sum%10;
				sum1=sum1+r;
				sum=sum/10;
			}
			
			while(sum1>0)
			{
				 int s2=sum1%10;
				sum2=sum2+s2;
				sum1=sum1/10;
			}
			
		
			return sum2;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			char input1[]=sc.next().toCharArray();			
			char input2[]=sc.next().toCharArray();			
			
			Uncommon u=new Uncommon();
			System.out.println(u.find(input1,input2));
			sc.close();
		}
}
