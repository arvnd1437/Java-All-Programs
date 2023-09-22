package com.pkg.Funtional;

public class LamdaExpression {
	public static void main(String args[]) {
		  
//		  Calc c = (a,b)-> a+b;
		 Calc c = (a,b)-> a*b;
		  
		  System.out.println(c.sum(5, 6));
		    
		 }
		}

		interface Calc
		{
		 int sum(int a, int b );
		}


