package javaPractice;

public class IfElseConcept {

	public static void main(String[] args) 
	{
		int a=40;
		int b=20;
		int c = 30;
		//If & If Else
		if(a<b) {
			System.out.println("a is lesser than b");
		}
		if(a>b) {
			System.out.println("a is greater than b");
		}
		else  
		{
			System.out.println("b is greater");


		}
		//nested If-Else
		if(a<b & a<c)
		{
			System.out.println("a is lesser than b & c");
		}
		else if (a<b & b>c)
		{
			System.out.println("a is lesser than b, but c is lesser than b");
		}

	}

}
