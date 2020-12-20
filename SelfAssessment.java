package com.wipro;

import java.util.Scanner;

public class SelfAssessment {
	public String find(String input1,int input2)
	{
		String rev="";String rev1="";String s1="";
		if(input2==0)
		{
		String s[]=input1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			String sub=s[i];
		/*	rev="";
			for(int j=sub.length()-1;j>=0;j--)
			{
			char ch=sub.charAt(j);
			rev=rev+String.valueOf(ch);
			
			}
			
			rev1=rev1+rev+" ";
			*/
			
			StringBuffer sb=new StringBuffer(sub);
			sb.reverse();
			rev=rev+sb.toString()+" ";
		}System.out.println(rev);
		
	}
		
		else
		{
			int r=0;int r1=0;
			String s[]=input1.split(" ");
			for(int i=0;i<s.length;i++)
			{
				String sub=s[i];
				rev="";
				
			
				for(int j=sub.length()-1;j>=0;j--)
				{	
				char ch=sub.charAt(j);
				if(Character.isUpperCase(ch))
				{
				 char ch5=rev.charAt(0);
				 ch5=(char) (ch5-32);
				 rev=String.valueOf(ch5);
				}
				
				rev=rev+String.valueOf(ch);
				
				}
				
				rev1=rev1+rev+" ";
				
		}
			System.out.println(rev1);
	}
	
		
		return "s";
		
}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		int input2=sc.nextInt();
		SelfAssessment s=new SelfAssessment();
		System.out.println(s.find(input1,input2));
	}

}
