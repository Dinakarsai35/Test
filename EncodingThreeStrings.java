package com.wipro;

import java.util.Scanner;

public class EncodingThreeStrings {
	public String encode(String input1,String input2,String input3)
	{
		String front="";
		String middle="";
		String end="";
           String arr[]= {input1,input2,input3};
           for(int i=0;i<arr.length-1;i++)
           {
        	   String str=arr[i];
        	   if(str.length()%3==0)
        	   {
        		   front=front+str.substring(0, str.length()/3);
        		   middle=middle+str.substring(str.length()/3, 2*(str.length()/3));
        		   end=end+str.substring(2*(str.length()/3));
        	   }
        	   else if(str.length()%3==1)
        	   {
        		   front=front+str.substring(0, str.length()/3);
        		   middle=middle+str.substring(str.length()/3, 2*(str.length()-1)+1);
        		   end=end+str.substring(2*(str.length()-1)+1);
        		   
        	   }
        	   else
        	   {
        		   front=front+str.substring(0, (str.length()/3)+1);
        		   middle=middle+str.substring((str.length()/3)+1, 2*(str.length()-1)+1);
        		   end=end+str.substring(2*(str.length()-1)+1);
        	   }
        	   
        	   
           }
         
         
		
		

	System.out.println(front);
		return "s";
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		String input3=sc.nextLine();
		EncodingThreeStrings e=new EncodingThreeStrings();
		System.out.println(e.encode(input1, input2, input3));
	}

}
