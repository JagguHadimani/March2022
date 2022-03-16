package com.HarshaJava.Practice;

public class ConstructorOverloading {
	int i;
	int ii;
	double dd;


	ConstructorOverloading()
	{
		i=10;
	}

	ConstructorOverloading(int a)
	{
		i=a;
	}

	ConstructorOverloading(int b, int c)
	{
		dd=12.25;
	}

	ConstructorOverloading(int d, double e)
	{
		dd=25.25;
	}

	 int print() 
	{
		int aa = 5;
		System.out.println("A dummy method in the class");
		return aa;
	}
	int   print(int a, int b) 
	{
		int bb;
		System.out.println("A dummy method in the class");
		return bb;
	}
	void  print(double d) 
	{
		System.out.println(" double method overloading");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(10);
		ConstructorOverloading co2 = new ConstructorOverloading(1 , 5.1);
		//co2.print();
		//co1.print();
		double l=1.0; //1l
		co.dd =  l; 
		System.out.println(l);
		int d = 0;
		co.print(d);
	}

}
