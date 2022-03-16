package javaPractice;

public class Loops {

	public static void main(String[] args) 
	{



		// 1. While Loop
		//Disadvantage of while loop is it will generate infinite loop if you do not give incremental/ decremental 
		int i= 1; 
		while (i<=5) 
		{
			System.out.println(+i +",");
			i=i+1;
		}
		System.out.println();
		System.out.println("***looping via the for loop****");
		// 2. For Loop
		for (int j=1; j<=5; j++)
		{
			System.out.println("looping via the for loop" +j);
		}
		System.out.println();
		System.out.println("***looping via the for loop****");
		// 2. For Loop
		for (int k=5; k>=-5; k--)
		{
			System.out.println(+k);
		}
	} 
}
