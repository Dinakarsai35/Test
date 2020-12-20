package com.wipro;

import java.util.Scanner;

public class Characterorsum {
	public String find(String input1,int input2)
	{
		int sum=0;int sum1=0;String s1="";String a="Null";String b="Zero";String s="";
		int flag=0;
		 if(input2==0)
		{
			
		
		for(int i=0;i<input1.length();i++)
		{
			
			char ch=input1.charAt(i);//j2g46vg7j
			if(Character.isDigit(ch))
			{
			  sum=sum+Integer.parseInt(String.valueOf(ch));	
			  
			}
			
		}
		  
		  if(input1.isEmpty())
			{
				s=a;
				
			}
		  else  if(sum>0)
		   {
			   s=String.valueOf(sum); 
		   }
			else
			{
				s=b;
			
			}
		
		}
		else
		{
			for(int i=0;i<input1.length();i++)
			{
				 
				// input1=input1.toLowerCase();
				 char ch1=input1.charAt(i);
				if((ch1>='a'&&ch1<='z')||(ch1>='A'&&ch1<='Z'))
				{
					s1=s1+String.valueOf(ch1);
					flag=1;
					
				
				}
			}

				if(input1.isEmpty())
				{
					s=a;
					
				}
				else if(flag==0) {
					s=b;
				}
				else
				{
					s=s1;
					
				}
			
		}
		
		return s;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		int input2=sc.nextInt();
		Characterorsum c=new Characterorsum();
		System.out.println(c.find(input1,input2));
	}
}
