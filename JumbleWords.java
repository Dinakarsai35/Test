package com.wipro;

import java.util.Scanner;

public class JumbleWords {
	public String jumble(String input1,int input2)
	{
		String str1="";String res="";String str4="";String str5="";
		switch(input2)
		{
		case 1:
			String s[]=input1.split(" ");
			for(int i=0;i<s.length;i++)
			{
				String str=s[i];
				int n=str.length();
				if(n%2!=0)
				{
					str1="";
					for(int j=0;j<str.length();)
					{
						char ch=str.charAt(j);
						str1=str1+String.valueOf(ch);
						j=j+2;
					     
					}
					for(int k=n-2;k>=0;)
					{
						char ch1=s[i].charAt(k);
						str1=str1+String.valueOf(ch1);
						k=k-2;
					}  
					
					
				}
				
				else
				{
					str1="";
					for(int j=0;j<str.length();)
					{
						char ch=str.charAt(j);
						str1=str1+String.valueOf(ch);
						j=j+2;
					     
					}
					for(int k=n-1;k>=0;)
					{
						char ch1=s[i].charAt(k);
						str1=str1+String.valueOf(ch1);
						k=k-2;
					}  
				}
			
				 res=res+str1+" ";
			}
			break;
		case 2:
			String s1[]=input1.split(" ");
			for(int i=0;i<s1.length;i++)
			{
				 str4=s1[i];
				int n1=str4.length();
				if(n1%2!=0)
				{
					str5="";
					for(int j=0;j<str4.length();)
					{
						char ch4=str4.charAt(j);
						str5=str5+String.valueOf(ch4);
						j=j+2;
					     
					}
					for(int k=1;k<str4.length();)
					{
						char ch4=str4.charAt(k);
						str5=str5+String.valueOf(ch4);
						k=k+2;
					} 
				}
					else
					{
						str5="";
						for(int j=0;j<str4.length();)
						{
							char ch4=str4.charAt(j);
							str5=str5+String.valueOf(ch4);
							j=j+2;
						     
						}
						for(int k=1;k<str4.length();)
						{
							char ch4=str4.charAt(k);
							str5=str5+String.valueOf(ch4);
							k=k+2;
						}  
					}
					
					res=res+str5+" ";
					
				}
			break;
			
		
		}
		
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		int input2=sc.nextInt();
		JumbleWords j=new JumbleWords();
		System.out.println(j.jumble(input1, input2));
	}

}
