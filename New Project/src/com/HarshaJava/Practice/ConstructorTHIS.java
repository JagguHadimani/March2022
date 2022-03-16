package com.HarshaJava.Practice;

public class ConstructorTHIS {

	int i =10;
	double d=20.25;
	static int j;
	//constructor
	ConstructorTHIS()
	{
		System.out.println("-----Running Constructor body-----");
		int i =20;
		double d=30.25;
		this.i=i;
		this.d =d;
		 int j =50;
		 this.j =j;

	}
	void print() 
	{
		System.out.println("Print method invoked");
		System.out.println("ï = " +i);
		System.out.println("d = " +d);
		System.out.println("j = " +j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ConstructorTHIS c1= new ConstructorTHIS();
		c1.print();
		System.out.println(" i = " +c1.i);
		System.out.println(" j = " +c1.j);
	}

}
