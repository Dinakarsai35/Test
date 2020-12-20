package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class PlaceTheAlphabet {
	public String placeAlpha(int[] input1)
	{
		
		
		int a=0;char e;int var=1;String res1="";
		int array[]=new int[5];
		char[] res=new char[5];
	for(int j=0;j<array.length;j++)
	{
		array[j]=input1[j];
	}
	Arrays.sort(array);
	for(int k=0;k<array.length;k++)
	{
		for(int l=0;l<array.length;l++)
		{
			if(array[k]==input1[l])
			{
				a=96+var;
				e=(char) a;
				res[l]=e;
				var++;
			}
		}
	}
		res1=Arrays.toString(res);
		return res1;
		
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int[] input1=new int[5];
	for(int i=0;i<input1.length;i++)
	{
		input1[i]=sc.nextInt();
	}
	PlaceTheAlphabet p=new PlaceTheAlphabet();
	System.out.println(p.placeAlpha(input1));
}
}
