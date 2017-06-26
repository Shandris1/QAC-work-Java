
public class UnitedKingdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryConversion2 conversion;
		conversion = new binaryConversion2();
		conversion.convert(18);
		binaryConversion conversion2;
		conversion2 = new binaryConversion();
		conversion2.convert(18);

	}
}
class binaryConversion 
{
	public void convert(int a)
	{
		int l=1;
		for (;l<a;)
		{
			l=l*2;
		}
		for(;l>0;)
		{

			if (a/l==1)
			{
				System.out.print("1");
				//System.out.println("l="+a);
				//System.out.println("a="+a);
				a=a-l;
			}
			else
				System.out.print("0");
			l=l/2;
			//System.out.print(a);
		}
	}	
}

class binaryConversion2
{
	public void convert(int a)
	{
		int l;
		String number = "";
		while(a>1)
		{
			System.out.println("a%2 = "+a%2);
			System.out.println("a="+a);
			//System.out.println("l="+l);
			if (a ==2)
			{
				number = ("1") + number;
				a=0;
			}

			else if(a%2>0)
			{

				a=a-1;
				number = ("1") + number;
			}
			else 
			{
				a=a/2;
				number = ("0") + number ;
				//System.out.println("-1"+a%l);
			}
			//l=l*2;
		}	
		//number = a + number;
		System.out.println(number);

	}
}
class hexconversion
{
	public void converthex(int a)
	{
		String wholeBinary = "";
		String fourBinary = "";
		String restBinary = "";
		String result = "";
		int counter = wholeBinary.length();
		if (wholeBinary.length() > 4)
		{
			fourBinary = wholeBinary.substring(counter, counter+4);
		}
		else
		{
			restBinary = wholeBinary.substring(0, counter+1);
		}
		
		while (counter > 4)
		{
			result = 
		}
		String number = "";
		
	}	
	//number = a + number;
	
}






/*
		Bank HSBC,NatWest;
		BloodAndThunder Hero;
		Hero = new BloodAndThunder(1,2);
		HSBC = new Bank();
		NatWest = new Bank();
		HSBC.SetDolar(95);
		HSBC.SetDolar(95,87);
		NatWest.DollarRate();
		HSBC.SetA();
		NatWest.SetDolar(96);
		HSBC.convertmoney(100);
		NatWest.convertmoney(100);
	}

}

class Bank {
	static int Dollar;
	int x;
	public void SetDolar(int a)
	{
		Dollar = a;
	}
	public void SetDolar(int a,int b)
	{  
		System.out.println(a+""+b);
	}
	public void SetA()
	{
		x = Dollar;
		System.out.println(x);
	}
	public void convertmoney(int m)
	{
		System.out.println(m*Dollar);
	}
	public void DollarRate()
	{
		System.out.println("Dollar:"+Dollar);
	}
}
class BloodAndThunder
{
	public BloodAndThunder()
	{
		System.out.println("Something");
	}

	public BloodAndThunder(int a)
	{
		this();
		System.out.println(a);
	}

	public BloodAndThunder(int a, int b)
	{
		this(a);
		System.out.println(b);
	}
}

	/*		int HardwareCost = 15;
		int SoftwareCost = 5;
		int Duh = 7;
		int x = 0;
		Addition location;
		location = new Addition();
		System.out.println(location.test);
		location.trial();
		System.out.println(location.test);
		//System.out.println(HardwareCost+SoftwareCost+Duh);
		//System.out.println(consultantFee(HardwareCost,SoftwareCost));
		//while (x<15)
		//{
			//x++;
			//System.out.println(x);

		//}

	}

	public static int consultantFee(int A,int B)
	{
		int OverallCost = 0;
		OverallCost = (A+B)*1000;

	return (OverallCost);
	}

}
class Addition 
{

	int test = 2;
	int curious = 4;
	int sum = 0;
	public void trial()
	{
	System.out.println("addition works");
	sum = test+curious;
	}
	}
 */