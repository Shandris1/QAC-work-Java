
public class test {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		{	
			Math2 mathing = new Math2();
			mathing.division(5, 10);
			Line C = new Line();
			doDrawing(C);
		}

	static public void doDrawing(Draw x)
	{
		x.Drawing();
	}
}
	


class doDrawing1
{

}
	abstract class Math
	{
		abstract public void Addition(int a, int b);
		public void subtract(int a,int b)
		{
			int c;
			c= a-b;
			System.out.println(c);
		}
	}
	final class Math2 extends Math
	{
		
		public void division(int a, int b)
		{
			int c;
			c=a/b;
			System.out.println(c);
			

		}
		public void Addition(int a, int b)
		{
			System.out.println("Y tho");
		}
	}
	abstract class Draw
	{
		abstract public void Drawing();
	}
	class Circle extends Draw
	{
		public void Drawing()
		{
			System.out.println("circle");
			
		}
		
	}
	class Line extends Draw
	{
		public void Drawing()
		{
			System.out.println("line");
			
		}
	}
	
	
