package javaPractice;

public class StringConcatination {

	public static void main(String[] args) 
	{
		System.out.println("Its a new start");
		String s= "Irs raining cats and Dogs";
		System.out.println(s.indexOf("t"));
		System.out.println(s.indexOf("d", 2));
		
		//String concatenation
		int a=100;
		int b=200;
		String x = "Its a ";
		String y = " Beautiful World ";
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+a+b+y+a+x+b);
		System.out.print(x+y+a+b+(a+b));
		System.out.println(x+y+a+b);
		/*for{i=0;i=10;i++
			
		};*/
	}

}
