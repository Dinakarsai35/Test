package com.wipro;

import java.util.Scanner;

public class ExtractWord {
	public String Extract(String input1,String input2)
	{
		String str="";
		String str1="";
		String str2="";
		String str3="";
		String res="";
		for(int i=0;i<input2.length();i++)
		{
			
			char ch=input2.charAt(i);
			char ch0=input2.charAt(input2.length()-1);
			String s[]=input1.split(" ");
		
				int b=ch-48;
			
				int c=b-1;
		int d=ch0-48;
		int e=d-1;
				String word=s[c];
				String word1=s[e];
		
				
				if(word.length()%2==0)
				{
				
					int a=word.length()/2;
					str="";
					str1="";
					for(int k=a-1;k>=0;k--)
					{
						char ch1=word.charAt(k);
						str=str+String.valueOf(ch1);
					}
					for(int l=a;l<word.length();l++)
					{
						char ch2=word.charAt(l);
						str1=str1+String.valueOf(ch2);
					}
					str2=str+str1;
					
					
				}
				
				else {
					int a=word.length()/2;
					str="";
					str1="";
					for(int k=a;k>=0;k--)
					{
						char ch3=word.charAt(k);
						str=str+String.valueOf(ch3);
					}
					for(int l=a;l<word.length();l++)
					{
						char ch4=word.charAt(l);
						str1=str1+String.valueOf(ch4);
					}
					str3=str+str1;
					
					
				}
				
		}
		for(int m=0;m<input2.length();m++)
		{
			
			char ch=input2.charAt(0);
			char ch0=input2.charAt(input2.length()-1);
			String s1[]=input1.split(" ");
		
				int b=ch-48;
			
				int c=b-1;
		int d=ch0-48;
		int e=d-1;
				String words=s1[c];
				String wordss=s1[e];
				if(words.length()%2==0&&wordss.length()%2!=0)
				{
					res=str2+" "+str3;
				}
				else if(wordss.length()%2==0&&words.length()%2!=0)
				{
					res=str3+" "+str2;
				}
		}
			
			
		
		
		
		char ch7='"';
		char ch8='"';
		String res1="";
	res1=String.valueOf(ch7)+res+String.valueOf(ch8);

	
	

		return res1;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		ExtractWord ew=new ExtractWord();
		System.out.println(ew.Extract(input1, input2));
	}

}
