package com.wipro;


 class fun {
	
	 void add(int a,int b)
	{
		System.out.println(a+b);
	}
 }
	 class Example extends fun{
			
		 void add(int a,int b)
		{
			System.out.println(a*b);
		}

	 
	public static void main(String args[])
	{
	
		
		Example e =new Example();
		e.add(2, 3);
		e.add(3, 5);
	}
	 }
 

