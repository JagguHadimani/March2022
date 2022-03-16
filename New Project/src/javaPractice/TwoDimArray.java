package javaPractice;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		String str[][] = new String[5][3];
		System.out.println(str.length); //will return total number of rows.
		System.out.println(str[0].length); // for column we need to specify the row number.
		//assigning the values to the array.
		//1st row
		str [0][0] = "laila";
		str [0][1] = "majnu";
		str [0][2] = "virat";
		str [0][3] = "anushka";
		str [0][4] = "anushkas";
		//2nd row
		str [1][0] = "kjkl";
		str [1][1] = "wer";
		str [1][2] = "hgffgh";
		//str [1][3] = "uyt";

		System.out.println(str[0][1]);
	}

}
