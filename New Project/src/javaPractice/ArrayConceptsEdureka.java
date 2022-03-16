package javaPractice;

public class ArrayConceptsEdureka {

	public static void main(String[] args) 
	{
		/*   
		 array declaration
		 1 - type var-name[]; ex: int week[];
		 2 - array-var = new type[size]; month= new int[size];
		 */

		//single value container
		int state1 = 500;
		int state2 = 500;
		int state3 = 500;
		int state4 = 500;
		int state5 = 500;


		//Multi value container = array
		//	int [] statePopulation = new int[5];// BY default all the values of the array elements were 0;
		//If we want we can also define the array elements when we declare the arrray as below
		int [] statePopulation = {10,20,30,40,50};
		//int [] statePopulation = new int[5];
		//1. Read Single element in an array
		System.out.println("statePopulation = " +statePopulation );
		//statePopulation = [I@7852e922 - When the array variable is defined and printed, statePopulation = [I@7852e922 memory address of the variable is printed.

		//2. Read All elements in the array
		//Before assigning the values to the array read and print the array.
		for (int i=0; i<statePopulation.length;i++)
		{

			System.out.println("statePopulation ["+i+"] is: " +statePopulation[i]);
		}

		int[] countryPopulation = new int[5];
		//Before assigning the values to the array print the array.
		for (int i=0; i<countryPopulation.length;i++)
		{

			System.out.println("countryPopulation ["+i+"] is: " +countryPopulation[i]);
		}
		System.out.println("countryPopulation  after updating array value" );
		countryPopulation[0] = 100;
		countryPopulation[1] = 200;
		countryPopulation[2] = 300;
		countryPopulation[3] = 400;
		countryPopulation[4] = 500;
		for (int j=0; j<countryPopulation.length;j++)
		{

			System.out.println("countryPopulation ["+j+"] is: " +countryPopulation[j]);
		}
		
		//3. Write & Update operation of array values
		System.out.println("After updating the existing values  of an array");
		countryPopulation[0] = 7000;
		countryPopulation[1] = 8000;
		countryPopulation[2] = 9000;
		countryPopulation[3] = 5000;
		countryPopulation[4] = 4000;
		for (int j=0; j<countryPopulation.length;j++)
		{

			System.out.println("countryPopulation ["+j+"] is: " +countryPopulation[j]);
		}
	}

}
