package com.wipro;

import java.util.Scanner;

public class Extract {
	public String find(String input1,String input2,int input3,int input4)
	{
		
		String str="";
		String str1="";
		String str2="";
		String str3="";
		String str4="";
		input1=input1.toLowerCase();
		input2=input2.toLowerCase();
		int flag=0;
		int n1=input1.length();
		int n2=input2.length();
		
		switch(input3)
		{
		case 0:
			
			
			for(int i=0;i<input1.length();i++)
			{
				flag=0;
				char ch=input1.charAt(i);
				for(int j=0;j<input2.length();j++)
				{
					flag=0;
				
				char ch1=input2.charAt(j);
				if(ch==ch1)
				{
			        
					flag=1;
					break;
					
				}
			}
				if(flag==0)
				{
					str=str+String.valueOf(ch);
					//System.out.println(str);
				}
		}
			for(int k=0;k<input2.length();k++)
			{
				flag=0;
				char ch2=input2.charAt(k);
				for(int l=0;l<input1.length();l++)
				{
					flag=0;
				
				char ch3=input1.charAt(l);
				if(ch2==ch3)
				{
			        
					flag=1;
					break;
					
				}
			}
				if(flag==0)
				{
					str1=str1+String.valueOf(ch2);
					
				}
		}
			str2=str+str1;
			//System.out.println(str2);
			break;
	
		case 1:
			int count=0;
			int var=0;
			for(int i=0;i<input1.length();i++)
			{
				count=0;
				flag=0;
				
				char ch=input1.charAt(i);
			
				for(int j=0;j<input2.length();j++)
				{
				 
				
				char ch1=input2.charAt(j);
				if(ch==ch1)
				{
			        count++;
			        if(count==1)
			        {
		        str=str+String.valueOf(ch);
			        }
		             
				}
				}
				
			
				
		}
			for(int k=0;k<input2.length();k++)
			{
				count=0;
				char ch2=input2.charAt(k);
				for(int l=0;l<input1.length();l++)
				{
			
				
				char ch3=input1.charAt(l);
				if(ch2==ch3)
				{
			        count++;
			        if(count==1)
			        {
		        str=str+String.valueOf(ch2);
			        }
		             
				}

			      
			}
		}
			
			str2=str+str1;
			//System.out.println(str2);
			break;
			
	}
		if(input4==0)
		{
			str2=str2.toLowerCase();
		}
		else
		{
			str2=str2.toUpperCase();
		}

		
		return str2;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		Extract e=new Extract();
		System.out.println(e.find(input1, input2, input3, input4));
	}

}
