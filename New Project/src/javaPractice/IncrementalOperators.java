package javaPractice;

public class IncrementalOperators {

	public static void main(String[] args) 
	{
		//post increment


		int i = 1;
		int j = i++;
		int k = j++; 
		System.out.println(i);
		System.out.println(j);
		System.out.println("k=" +k);

		//pre increment
		int a=1;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);

		//post decrement
		int m=5;
		int n=m--;
		System.out.println(m);
		System.out.println(n);

		//pre decrement
		int p=2;
		int q = --p;
		System.out.println(p);
		System.out.println(q);
		// in pre increment/pre decrement, both the variables will have the same values
		// in post increment first variable will be higher value than the second
		// in post decrement first variable will be smaller value than the second
		
	}

}
