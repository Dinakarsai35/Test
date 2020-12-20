package com.wipro;

import java.util.Scanner;

public class Nonrepeated {
	public int find(int input1)
	{
	int i=0;int j=0,temp=0;
	int count=0,val=0,x=1;
	temp=input1;
	String str=Integer.toString(input1);
	int n2=str.length();
	int ar[]=new int[10];
	int cr[]=new int[100];
	int[] ind=new int[10];
	while(temp>0)
	{
		int d=temp%10;
		ar[d]++;
		temp=temp/10;
		
	}
	int n1=ar.length;
	int br=0;
	//System.out.println("Dinak ");
	for( i=0;i<10;i++)
	{
	
		if(ar[i]>=2)
		{
			br=ar[i];
			count++;
			x=i;
			val++;
			//break;
		
		}
		
	}
//	for( j=0;j<count;j++)
//	{
//		br[j];
	//}
	return br;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		Nonrepeated n=new Nonrepeated();
		System.out.println(n.find(input1));
	}

}
