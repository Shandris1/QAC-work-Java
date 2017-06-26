
public class ifharder {

	public void hardif()
	{
	int no=2152;
	if(no<4000)
	{
		System.out.println("A");
		no=no+100;
		if(no>5000)
		{
			System.out.println("B");
			System.out.println("C");
		}
		else System.out.println("D");
		System.out.println("E");
	}
	else
	{
		no=no+1000;
		System.out.println("F");
		System.out.println("G");
		if(no<500)System.out.println("J");
		else
		{
			System.out.println("H");
			System.out.println("I");
		}
		System.out.println("K");
		}
	System.out.println("L");
	}
		
		
}

