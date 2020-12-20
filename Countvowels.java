package com.wipro;
import java.util.*;
public class Countvowels{
	public String findCount(String input1)
	{
		int ac=0,ec=0,ic=0,oc=0,uc=0;
		char ch,c;
		String t,r = "";String b="";
		int i=0;
		int n=input1.length();
		for(i=0;i<n;i++)
		{
			ch=input1.charAt(i);
			if(ch=='a')
			{
				ac++;
			}
			else if(ch=='e')
			{
				ec++;
			}
			else if(ch=='i')
			{
				ic++;
			}
			else if(ch=='o')
			{
				oc++;
			}
			else if(ch=='u')
			{
				uc++;
			}
			else
			{
			}
			}
		if(ac==1&&ec==1&&ic==1&&oc==1&&uc==1)
		{
			for(i=0;i<n;i++)
			{
		       ch=input1.charAt(i);
		        
		      if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
		      {
		    	  r=r+String.valueOf(ch);
		      }
			}
			String a=r.toUpperCase();
			int l=a.length();
			b= a + ":" + l;
		}
		else
		{
			input1=input1.toUpperCase();
			StringBuilder sb=new StringBuilder(input1);
			sb=sb.reverse();
			
			b= sb+":"+"ERROR";
		}
	
		return b;
	}
		public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.next();
		Countvowels v=new Countvowels();
		System.out.println(v.findCount(input1));
	}

}
