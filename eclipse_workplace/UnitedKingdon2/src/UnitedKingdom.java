
public class UnitedKingdom {

	public static void main(String[] args)
	{	
		// TODO Auto-generated method stub
		
		Math2 mathing = new Math2();
		mathing.Addition(5, 10);

	}
}

class Math
{
	public void Addition(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println(c);


	}
	public void subtract(int a,int b)
	{
		int c;
		c= a-b;
		System.out.println(c);
	}
}
class Math2 extends Math
{
	public void division(int a, int b)
	{
		int c;
		c=a/b;
		System.out.println(c);

	}
}
}