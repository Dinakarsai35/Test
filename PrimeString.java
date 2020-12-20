package com.wipro;
import java.util.*;
public class PrimeString {
	public String findString(String input1)
	{
		int flag=0;int count=0;
		int index=0;
		String str="";String str1="";
		char ch3;
		String s[]=input1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			count=0;
			str="";
			String sub=s[i];
			flag=0;
			for(int j=2;j<=sub.length();j++)
			{
				flag=0;
				for(int k=2;k<=j/2;k++)
				{
					if(j%k==0)
					{
						flag=1;
						break;
						
					}
				}
				
				if(flag==0)
				{
				
					index=j-1;
				count++;
				char ch=sub.charAt(index);
			//	System.out.println(ch);
			   int num=ch+count;
			  // System.out.println(num);
			    ch3=(char)num;
			//   System.out.println(ch3);
				str=str+String.valueOf(ch3);
				}
			
			}
			str1=str1+" "+str;
		}
		return str1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		PrimeString ps=new PrimeString();
		System.out.println(ps.findString(input1));
	}

}
