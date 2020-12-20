package com.wipro;

import java.util.Scanner;

public class Non {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		System.out.println("Given number is "+n);
		int i,j,temp=0,val=0,index=0;
		int[] arr=new int[10];
		int[] ind=new int[10];
		while(n>0)
		{
			temp=n%10;
			arr[temp]++;
			n=n/10;
			temp=0;
		}
		int max=0;
		for(i=0;i<10;i++)
		{
			if(arr[i]==1)//use ==1 for non repeated
			{
				ind[val]=i;
				val++;
				
			}
		}
		if(val==0)
			System.out.println("There are no values repeated");
		for(j=0;j<val;j++)
		{
			System.out.println(ind[j]+" ");
		}
		System.out.println("No of values are "+val);
	}

}
