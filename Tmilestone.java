package com.wipro;

import java.util.Arrays;
import java.util.Scanner;

public class Tmilestone {
	public int findM(int input1,int input2,int input3)
	{
		String res="";
		int th1=input1/1000;
		int th2=input2/1000;
		int th3=input3/1000;
		int h1=(input1%1000)/100;
		int h2=(input2%1000)/100;
		int h3=(input3%1000)/100;
		int t1=((input1%1000)%100)/10;
		int t2=((input2%1000)%100)/10;
		int t3=((input3%1000)%100)/10;
		int o1=input1%10;
		int o2=input2%10;

		int o3=input3%10;

		int arr[]= {th1,th2,th3};
		int arr1[]= {h1,h2,h3};
		int arr2[]= {t1,t2,t3};
		int arr3[]= {o1,o2,o3};
		Arrays.sort(arr);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		
		int a=arr[arr.length-1];
		int b=arr1[arr.length-1];
		int c=arr2[arr.length-1];
		int d=arr3[arr.length-1];
		String s1=Integer.toString(a);
		String s2=Integer.toString(b);
		String s3=Integer.toString(c);
		String s4=Integer.toString(d);
		res=s1+s2+s3+s4;
		int o=Integer.parseInt(res);
		return o;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		Tmilestone tm=new Tmilestone();
		System.out.println(tm.findM(input1, input2, input3));
	}

}
