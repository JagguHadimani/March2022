package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;

//
public class ArrayVsArrayList {

	public static void main(String[] args) {

		// Creating an Array
		String[] friendsArray = { "Ravi", "Jagadish", "Prakash", "Ramesh" };
		// or another way of declaring a String Array
		String[] friendsArray1 = new String[4];

		// Creating an ArrayList
		ArrayList<String> friendsArrayList = new ArrayList<>(
				Arrays.asList("Sharanappa", "Kallappa", "Mallappa", "Veerappa"));
		// Or another way of creating an arrayLiat
		ArrayList<String> friendsArrayList1 = new ArrayList<>(); // Empty ArrayList though

		// Get Elements of an Array
		System.out.println(friendsArray[2]); // at specific index.
		// to print all the elements of an Array use for loop.
		// for (int i =0; i<friendsArray.length; i++ )
		for (int i = 0; i < friendsArray.length; i++) 
		{
			System.out.println(friendsArray[i]);
			

		}
	}

}
