package javaPractice;

public class MethodOverloading {

	int  CalculateSum( int x, int y)
	{
		int sum = (x + y);
		return (x + y);
	}

	int CalculateSum( int x,  int y,  int z)
	{
		int sum = (x + y + z);
		return (sum);
	}



	double CalculateSum(double a, int x) 
	{
		double sum = (a + x);
		return (sum);

	}
	public static void main(String[] args) 
	{
		//int a = 2;
		//double d = 3.25;
		//String s = new String("Jagadish");
		MethodOverloading ml = new MethodOverloading();
		ml.CalculateSum(10.5, 8);
	/*	sum = ml.this
		System.out.println(sum);
		ml.CalculateSum(2, 2);
		System.out.println(sum);
		ml.CalculateSum(1,2,3);
		System.out.println(sum);*/


	}
}






