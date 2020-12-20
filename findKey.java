package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class findKey {
	public int findKeyValue(int input1,int input2,int input3)
	{
		String s=Integer.toString(input3);int k=0;int num=0;
		int n=s.length();
		int sum=0;int arr[]=new int[n];
		int th=input1/1000;
		int h=((input2/100)%10);
		while(input3>0)
		{
			int o=input3%10;
			arr[k]=o;
			
			input3=input3/10;
			k++;
		}
		Arrays.sort(arr);
		num=arr[0];
		sum=(th*h)+num;
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		findKey f=new findKey();
		System.out.println(f.findKeyValue(input1,input2,input3));
	}

}
