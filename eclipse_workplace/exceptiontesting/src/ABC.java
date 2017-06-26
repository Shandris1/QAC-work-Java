
public class ABC {
public ABC()
{
System.out.println("x");	
}
public static void main(String[] args) {
	int c;
	//c=4/0;
	try{
	c=4/0;
	System.out.println(c);
	}/*
	catch(IndexArrayOutOfBoundException AS)
	{
		System.out.println(c);
	}*/
	catch(ArithmeticException AS)
	{
		System.out.println("Cannot divide anything");
	}
	System.out.println("WEAHADSJKHDSAJKLDSA");
}
}
