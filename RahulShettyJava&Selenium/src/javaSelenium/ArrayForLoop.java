package javaSelenium;

public class ArrayForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array Declaration type 1
		int [] arr = new int[5];// declaring int array with 5 int variables. This needs to be initialized.
		arr[0] = 9;
		arr[1] =12;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		System.out.println("Printing array 1");	
		//array declaration type 2
		int[] arr1 = {19,92,52,32,42};
		//We cannot use below line of code to print the array elements
		//System.out.println("Array Declaration type 2", +arr1);
		// So we need to use a for loop to iterate and print one element at a time from an array as below.
		for (int i= 0; i< arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("Printing array 2");	
		for (int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
