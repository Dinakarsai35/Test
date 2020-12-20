package com.wipro;

import java.util.Scanner;

public class Userid_Generation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NAME");
		String fname=sc.nextLine();
		System.out.println("ENTER LAST NAME");
		String lname=sc.nextLine();
		String small="",large="";
		if(fname.length()<lname.length()) {
			small=fname;
			large=lname;
		}
		else if(fname.length()==lname.length()) {
			int a1=fname.charAt(0);
			int a2=lname.charAt(0);
			if(a1<=a2) {
				small=fname;
				large=lname;
			}
			else {
				small=lname;
				large=fname;
			}
		}
		else {
			//System.out.println("ENTERED INTO ELSE");
			small=lname;
			large=fname;
		}
		String pin2="";
		System.out.println("ENTER PIN OF 6-DIGIT'S");
		int pin=sc.nextInt();
		System.out.println("ENTER N VALUE");
		int n=sc.nextInt();
		String pin1=Integer.toString(pin);
		//System.out.println("pin1= "+pin1);
		char p1=pin1.charAt(n-1);
		//System.out.println("p1= "+p1);

		for(int i=pin1.length()-1;i>=0;i--)
			pin2=pin2+pin1.charAt(i);
		char p2=pin2.charAt(n-1);
		//System.out.println("p2= "+p2);

		String id="",finalId="";
		id=small.charAt(0)+large+Character.toString(p1)+Character.toString(p2);
		System.out.println("BEFORE TOGGLE "+id);
		for(int i=0;i<id.length()-2;i++) {
			char ch=id.charAt(i);
			if(Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);
				finalId+=Character.toString(ch);
			}
			else {
				ch=Character.toLowerCase(ch);
				finalId+=Character.toString(ch);
			}
		}
		finalId=finalId+Character.toString(p1)+Character.toString(p2);
		System.out.println("AFTER TOGGLE "+finalId);

	}

}
