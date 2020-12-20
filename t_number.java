package com.wipro;

import java.util.Scanner;

public class t_number {
public int findT(int input1,int input2,int input3)
{
	int count=0,sum=0;int j=0,k=0;int flag=0;int t=1;
	for(int i=2;i<=input2/2;i++)
	{
		if(input2%i==0)
		{
			flag=1;
			break;
		}
		else
		{
			flag=0;
		}
	}
	if((flag==0)&&(input2%2==0)&&(input2!=0))
	{
	  	int num=input2;int i=0;j=1;
	  	while(count<input2)
	  	{
	  		
	  		
	  		for(j=input2;j<=1000;j++)
	  		{
	  		for(k=2;k<=j/2;k++)
	  		{
	  			if(j%k==0)
	  			{
	  				flag=1;
	  				break;
	  				
	  			}
	  		
	  		}
	  		if(flag==0)
	  		{
	  			sum=sum+j;
	  		
	  			count++;
	  			
	  		}
	  		}
	  	}
	  		t=input1*input1*sum;
	  
	}
	else if((flag==0)&&(input2%2!=0)&&(input2!=1))
	{

	int i=0;j=1;count=0;flag=0;
	  	while(input3>count)
	  	{
	  		
	  		
	  		for(j=2;j<=1000;j++)
	  		{
	  		for(k=2;k<=j/2;k++)
	  		{
	  			if(j%k==0)
	  			{
	  				flag=1;
	  				break;
	  				
	  			}
	  		
	  		}
	  		if(flag==0)
	  		{
	  			sum=sum+j;
	  		
	  			count++;
	  			
	  		}
	  		}
	  	}
	  	t=input2*input2*sum;
	  		
	}
	else if(input2==0)
	{
		int i=0;j=1;count=0;flag=0;sum=0;t=0;
		int n=input2+input3;
	  	while(count<n)
	  	{
	  		
	  		
	  		for(j=input3;j<=1000;j++)
	  		{
	  		for(k=2;k<=j/2;k++)
	  		{
	  			if(j%k==0)
	  			{
	  				flag=1;
	  				break;
	  				
	  			}
	  		
	  		}
	  		if(flag==0)
	  		{
	  			sum=sum+j;
	  		
	  			count++;
	  			
	  		}
	  		}
	  	}
	  	t=input3*input3*sum;
	}
	return t;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int input1=sc.nextInt();
	int input2=sc.nextInt();
	int input3=sc.nextInt();
	t_number t=new t_number();
	System.out.println(t.findT(input1, input2, input3));
}
}
