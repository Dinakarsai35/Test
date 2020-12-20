package com.wipro;

import java.util.Scanner;

public class countcharacters {
	public int findLo(String input1,String input2)
	{
		int count=0;
		input1=input1.toLowerCase();
		char ch1=input2.charAt(0);
		for(int i=0;i<input1.length()-1;i++)
		{
			char ch=input1.charAt(i);
			if(ch==ch1)
			{
				count++;
			}
			
			
		}
		if(count==0) {
			count=0;
		}
		
		return count;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		countcharacters c1=new countcharacters();
		System.out.println(	c1.findLo(input1,input2));
	}
}
