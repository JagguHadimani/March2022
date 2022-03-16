package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		// Creating an ArrayList of Integer.
		// Since the Array list stores objects as values in the list we need to pass the
		// wrapper class elements of specific type as shown below.
		// Integer | Float | String | Boolean

		// Creating the Arraylist
		ArrayList<Integer> list = new ArrayList<>();
		// ArrayList<String> list = new ArrayList<>();
		// ArrayList<Float> list = new ArrayList<>();
		// ArrayList<Boolean> list = new ArrayList<>();

		// Adding Elements to the ArrayList
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(6);
		System.out.println(list); // printing the object lists all the elements in the ArrayList.

		// Get elements in the ArrayList or Get elements at the specific location.
		int element = list.get(1);
		System.out.println(element);

		// Adding/Inserting elements at specific location in the ArrayList
		list.add(0, 11);// this will push elements by 1 index to the right.
		System.out.println(list);
		
		//Set value for the specified index
		list.set(0,77);
		list.set(1,33);
		list.set(2,50);
		list.set(3,55);
		System.out.println(list);
		
		//Delete an element at the specific location
		list.remove(3);
		System.out.println(list);
		
		//Size of an Arraylist <obj>.size()
		int size = list.size();
		System.out.println("Arraylist size is : " +size);
		
		//looping through the Arraylist elements
		for (int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//Sorting the Arraylist elements, collections.sort(<obj>)
		Collections.sort(list);
		System.out.println(list);
	}

}
