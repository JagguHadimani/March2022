package javaPractice;

import java.util.LinkedList;

public class LinkedListNaveen {

	public static void main(String[] args) {
		LinkedList<String> lln = new LinkedList<String>();
		//Adding elements to LinkedList
		lln.add("Jagadish");
		lln.add("Software Engineer");
		lln.add("QA Lead");
		lln.add("Photon");
		System.out.println(lln);
		
		//Remove elements from the linkedlist
		lln.remove();// This removes the first element in the list
		System.out.println(lln);
		
		lln.remove(2); //This removes the element at index 2
		System.out.println(lln);

		//AddFirst
		lln.addFirst("Jagadish Hadimani");
		System.out.println(lln);
		//AddLast
		lln.addLast("Jagadish Hadimani");
		System.out.println(lln);
		
		//Get & Set values
		System.out.println(lln.get(0));
		lln.set(0, "Mike Jagger");
		System.out.println(lln.get(0));
		

	}

}
