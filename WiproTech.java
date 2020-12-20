package com.wipro;

import java.util.Scanner;

public class WiproTech {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str="Wipro Technologies< Bangalore";String rev1="";
		String rev="";
		String s[]=str.split(" ");
		
		 		
				for(int i=0;i<s.length;i++) {
					String word=s[i];
					String rw="";
					for(int j=word.length()-1;j>=0;j--)
					{
						rw=rw+word.charAt(j);
					}
					rev=rev+rw+" ";
					//System.out.println("rev "+rev);
					}

		 
		 
		
		
	
		
		rev1=rev.toLowerCase();

		String temp="";
       for(int i=0;i<str.length();i++)//i=1
       {
	     char ch1=str.charAt(i);//ch1=W i
	     char ch2=rev1.charAt(i);//ch2=o r
	     if(Character.isUpperCase(ch1))//true f
	     {
	    	 char ch3=Character.toUpperCase(ch2);//ch3=O
	    	 temp=temp+String.valueOf(ch3);//temp=O
	     }
	     else if((ch1!=' ')&&(!(Character.isAlphabetic(ch1))))
	     {
	    	 if(Character.isUpperCase(ch1))
	    	 {
	    	 
	    	 
	    		 temp=temp+String.valueOf(ch2);
	    	 }
	    	 else
	    	 {
	    		 
	    	 
	    		 char ch3=Character.toUpperCase(ch2);//ch3=O
		    	 temp=temp+String.valueOf(ch3);//te	 
	    	 }
	     }
	     else
	     {
	    	 temp=temp+String.valueOf(ch2);//Or
	     }
       }
       System.out.println(str);
     System.out.println(temp);
	}

}
