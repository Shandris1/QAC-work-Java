
public class ForFlowChart {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		int a;
		for (a=1; a<10;a++)
		{
			System.out.println(a);
			if ((a%2)==0)
			{
				System.out.println("Even");
				if (a>5)
					System.out.println("-");
				else
					System.out.println("*");
			}
			else
			{
				System.out.println("odd");
				if (a>5)
					System.out.println("!");
				else
					System.out.println("?");
			} 


		}
*/ /*
		int a,b;
		for (a=1;a<=10;)
		{
			for (b=1;b<=a;)
			{
				System.out.println(b);
				b++;
			}
			a++;
			}
			
		}
		*/
		int a,b;
		for (a=1;a<=10;)
		{
			if (a%2!=0)//is odd?
			{
			for (b=1;b<=a;)
			{
				System.out.print(b);
				b++;
			}
			System.out.println();
			}
			else
			{
				System.out.println(a);
			}
			a++;
			}
			
		}
	}
 