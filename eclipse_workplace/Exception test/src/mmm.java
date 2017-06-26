class mmm
{
	public static void main(String x[])
	{
		math45 m = new math45();
		try
		{
			m.divide(2,6);
		}
		catch (myExp X)
		{
			System.out.println("ERROR Second number too high");
		}
	}
}

class math45
{
	public void divide(int a,int b) throws myExp
	{
		int c=0;
		if (a<b)
		{
			myExp E = new myExp();
			throw E;
		}
		c=a/b;
	}
}


