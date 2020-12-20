package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class Order {
	public String findOrder(String input1,String input2)
	{
		String res="";int flag=0;
		int count=0;
		if(input1.charAt(0)<input1.charAt(1))
		{
			for(int i=0;i<input1.length()-1;i++)
			{
				flag=0;
				if(input1.charAt(i)>input1.charAt(i+1))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				count=0;
				for(int j=0;j<input1.length();j++)
				{
					if(input1.charAt(j)!=input2.charAt(j))
					{
						count++;
					}
				}
				res="Increasing"+count;
			}
			else
			{
				//System.out.println("sai");
				res="Invalid";
			}
		}
		else
		{
			for(int i=1;i<input1.length()-1;i++)
			{
				flag=0;
				if(input1.charAt(i)<input1.charAt(i+1))
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				count=0;
				for(int j=0;j<input1.length();j++)
				{
					if(input1.charAt(j)!=input2.charAt(j))
					{
						count++;
					}
				}
				res="Decreasing"+count;
			}
			else
			{
				res="Invalid";
			}
		}
	 
		//System.out.println(c);
		


return res;

	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		Order o=new Order();
		System.out.println(o.findOrder(input1,input2));
	}

}
