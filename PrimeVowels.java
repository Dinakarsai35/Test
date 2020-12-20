package com.wipro;
import java.util.*;
public class PrimeVowels {
	public String findPrimeVowel(int input1)
	{
		int flag=0;int count=0;
		
		int num=0;
		while(count<input1)
		{
			flag=0;
			num=num+1;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
				
			}
			if(flag==0&&num!=1)
			{
				count++;
				System.out.println(num);
			}
		}
		String res="";
		int countvowel=0;
		String s2[]= {"one","two","three","four","five","six","seven","eight","nine"};
		if(num%10==num)
		{
		  String s3=s2[num-1];
		  s3=s3.toLowerCase();
		  for(int k=0;k<s3.length();k++)
		  {
			  char ch=s3.charAt(k);
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			  {
				  res=res+String.valueOf(ch);
				  countvowel++;
			  }
		  }
		}
		else
		{
		 while(num>0)
		 {
			 int d=num%10;
			 String s3=s2[d-1];
			 s3=s3.toLowerCase();
			  for(int k=0;k<s3.length();k++)
			  {
				  char ch=s3.charAt(k);
				  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				  {
					  res=res+String.valueOf(ch);
					  countvowel++;
				  }
			  }
			  num=num/10;
		 }
		}
		return res+countvowel;
		
		
		  
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	   int input1=sc.nextInt();
	   PrimeVowels p=new PrimeVowels();
	   System.out.println(p.findPrimeVowel(input1));
		
	}

}
