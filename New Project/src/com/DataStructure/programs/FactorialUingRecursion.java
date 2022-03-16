package com.DataStructure.programs;

/*Recursion means the repeated application of a recursive procedure or definition. 
The determination of a succession of elements (such as numbers or functions) 
by operation on one or more preceding elements according to a rule or formula involving a finite number of steps.
Ex: 5! = 5*4*3*2*1
*/
public class FactorialUingRecursion {

	static long factorial(long n) 
	{
		if(n==0)
			return 1;
		else 
		{
			return(n*factorial(n-1));
		}
	}

	public static void main(String[] args) 
	{
		//int i;
		long fact =1;
		long number =5;
		fact = factorial(number);
		System.out.println("Factorial of " +number+" is = "+fact);
	}
}
