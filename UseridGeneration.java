package com.wipro;

import java.util.Collections;
import java.util.Scanner;

public class UseridGeneration {
	public String finId(String input1,String input2,int input3,int input4)
	{
		int n1=input1.length();
		int n2=input2.length();String res="";
		int f=0;int f1=0;int i2=0,i1=0;
		int temp=input3;int count=0;
		while(temp>0)
		{
			int r=temp%10;
			count++;
			temp=temp/10;
		}
		
		String res1="";
		int arr1[]=new int[count];
		int arr2[]=new int[count];
		int dig=count-1;
		if(n1<n2)
		{
			while(input3>0)
			{
				int d=input3%10;
				arr1[f]=d;
				f++;
				input3=input3/10;
			}
			
			char ch=input1.charAt(0);
			 i1=arr1[input4-1];
		//	Collections.reverse(list);
			for(int i=0;i<arr1.length;i++)
			{
				arr2[dig]=arr1[i];
				dig--;
			}
		 i2=arr2[input4-1];
			  
			
			res=String.valueOf(ch)+input2+i2+i1;
			
	
		}
		else if(n1==n2)
		{
			char ch6=input1.charAt(0);
			char ch7=input2.charAt(0);
			if(ch6<=ch7)
			{
				while(input3>0)
				{
					int d=input3%10;
					arr1[f]=d;
					f++;
					input3=input3/10;
				}
				
				char ch=input1.charAt(0);
				 i1=arr1[input4-1];
			//	Collections.reverse(list);
				for(int i=0;i<arr1.length;i++)
				{
					arr2[dig]=arr1[i];
					dig--;
				}
				 i2=arr2[input4-1];
				  
				
				res=String.valueOf(ch)+input2+i2+i1;
				
			}
			
			else
			{
				while(input3>0)
				{
					int d=input3%10;
					arr1[f]=d;
					f++;
					input3=input3/10;
				}
				
				char ch=input2.charAt(0);
				 i1=arr1[input4-1];
			//	Collections.reverse(list);
				for(int i=0;i<arr1.length;i++)
				{
					arr2[dig]=arr1[i];
					dig--;
				}
				 i2=arr2[input4-1];
				  
				
				res=String.valueOf(ch)+input1+i2+i1;
							}
		}
		else
			
		{
			while(input3>0)
			{
				int d=input3%10;
				arr1[f]=d;
				f++;
				input3=input3/10;
			}
			
			char ch=input2.charAt(0);
			 i1=arr1[input4-1];
		//	Collections.reverse(list);
			for(int i=0;i<arr1.length;i++)
			{
				arr2[dig]=arr1[i];
				dig--;
			}
		 i2=arr2[input4-1];
			  
			
			res=String.valueOf(ch)+input1+i2+i1;
			
	
		}
		
		char ch4=0;
		String s2="";
		int n4=res.length();
		for(int j=0;j<n4-2;j++)
		{
			char ch3=res.charAt(j);
			
			if(Character.isUpperCase(ch3))
			{
				ch4=(char) (ch3+32);
			}
			else
			{
				ch4=(char) (ch3-32);;
			}
			
			s2=s2+String.valueOf(ch4);
			
		}
		
		res1=s2+i2+i1;
		
		
		
		
		return res1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		UseridGeneration u=new UseridGeneration();
		System.out.println(u.finId(input1, input2, input3, input4));
	}

}
