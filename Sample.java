package com.wipro;

import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sum=0,a,b,mul=0,f;
		System.out.println("Enter a string : ");
		String str=sc.nextLine();
		int len=str.length();
		System.out.println("length of string is "+len);
		//int comVal=len*100;
		//System.out.println("Common value is going to add is "+comVal);
		System.out.println("Choose 1 for normal");
		System.out.println("Choose 2 for multyplying with is length ");
		int choose=sc.nextInt();
		String[] words=str.split(" ");
		switch(choose) {
		case 1 :
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			for(int j=0;j<word.length();j++) {
				char ch=word.charAt(j);
				if(Character.isLowerCase(ch)) {
					a=ch-96;
					sum+=a;
				}
				else if(ch=='.') {
					f=ch+53;
					sum+=f;
				}
				else {
					b=ch-38;
					sum+=b;
				}
			}
		}
		break;
		case 2 :
			for(int i=0;i<words.length;i++) {
				String word=words[i];
				int len1=word.length();
				int comVal=len1*100;
				//System.out.println("ComVal is "+comVal);
				for(int j=0;j<word.length();j++) {
					char ch=word.charAt(j);
					
					if(Character.isLowerCase(ch)) {
						a=ch-96;
						sum=sum+(a+comVal);

					}
					else if(ch=='.') {
						f=ch+53;
						sum+=f;
					}
					else {
						b=ch-38;
						sum=sum+(b+comVal);
					}
				}
			}
			break;
		}

		System.out.println(sum);
		
	}

}
