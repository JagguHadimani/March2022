package javaPractice;

public class ArrayConcepts {

	public static void main(String[] args) 
	{

		/* What is Static Array in Java - Core Java - Part - 4 - https://www.youtube.com/watch?v=LBgQBb5pxXs
		 * Arrays are used to hold homogeneous data using a single variable. 
		 * Ex: if we have 10 apples we need not have to declare 10 variables to store 10 apples
		 * instead we declare 1 variable and store all the apples in one array. 
		 * We retrieve those apples by indexing.
		 */
		
		//One Dimensional Array
		//Disadvantage - fixed array size also called static array. Can not scale up or down once set. 
		//stores a homogeneous data types in the array. We cannot store multiple data types in an array.
		//- to overcome this we use collections like arraylist, hash tables also called  dynamic array.
		//To overcome this problem we use object array.

		//declaring an int array
		int i[] = new int[4];
		i[0] = 50;
		i[1] = 10;
		i[2] = 20;
		i[3] = 40;
		//i[4] = 30;
		System.out.println(i[3]);
		System.out.println(i.length);
		
		System.out.println("********via for loop*****************");
		for(int j=0; j< i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//2. Double Arrya
		System.out.println("********double array*****************");
		double d[] = new double[3];
		d[0]= 2.00;
		d[1] = 4.25;
		d[2] = 6.50;
		System.out.println(d[2]);
		
		// 3. Char array
		System.out.println("********char array*****************");
		char c [] = new char[3];
		c[0] = 'g';
		c[1] = 2;
		c[2] = '#';
		System.out.println(c[0]);
		
		//4. String array
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "Bangalore";
		s[2] = "Chapter";
		System.out.println(s[0] + s[1] + s[2]);
		
		//5. Object Array.
		//Object is the most super class of all the classes in Java.
		Object obj[] = new Object[6];
		obj [0] = "sdf";
		obj [1] = 30;
		obj [2] = "Male";
		obj [3] = "London";
		System.out.println(obj[3]);
System.out.println(obj.length);
	}

}
 