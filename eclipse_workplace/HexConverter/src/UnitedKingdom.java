
public class UnitedKingdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binaryConversion2 conversion;
		//conversion = new binaryConversion2();
		//conversion.convert(18);
		//binaryConversion conversion2;
		//conversion2 = new binaryConversion();
		//conversion2.convert(18);

		hexconversion convert1;
		convert1 = new hexconversion();
		convert1.converthex(101011011);
		
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
		String overallResult="";
		wholeBinary = Integer.toString(a);
		int tempResult = 0 ;
		int binaryMult = 0 ;
		int counter = wholeBinary.length();
		int j=0;
		System.out.println("Length = " +wholeBinary.length());
		for (j=0;(wholeBinary.length()-j) >= 4;)
		{
			j=j+4;
			fourBinary = wholeBinary.substring(counter-4, counter);
			counter = counter - 4; 
			binaryMult = 1;
			tempResult=0;
			//System.out.println("Temp = "+tempResult);
			for(int i = 3;i>-1;i--)
			{
				
				tempResult =  tempResult + (int)(fourBinary.charAt(i)-48)*binaryMult;
				binaryMult = binaryMult * 2; 
				//System.out.println("current Binary = "+fourBinary.charAt(i));
				//System.out.println("number So far = s"+tempResult);
				if (tempResult>9)
				{
					result = Character.toString((char)(tempResult + 55));
				}
				else
					result=Integer.toString(tempResult);
			}
			
			overallResult = result + overallResult;
			
		}
		
		restBinary = wholeBinary.substring(0, counter);
		binaryMult = 1;
		tempResult=0;
		result = "";
		System.out.println(restBinary);
		for(int i = (restBinary.length()-1);i>-1;i--)
		{
			//System.out.println("I = "+i);
			tempResult =  tempResult + (int)(restBinary.charAt(i)-48)*binaryMult;
			binaryMult = binaryMult * 2; 
			//System.out.println("current Binary = "+fourBinary.charAt(i));
			//System.out.println("number So far = s"+tempResult);
			if (tempResult>9)
			{
				result = Character.toString((char)(tempResult + 55));
			}
			else
				result=Integer.toString(tempResult);
			//System.out.println("i = " + result);
		}
	
	overallResult = result + overallResult;
		
		
		System.out.println("i = " + overallResult);
		//else
		{
			//System.out.println("why though");
			//restBinary = wholeBinary.substring(0, counter+1);
		}
		//result = result;
		/*
		while (counter < 4)
		{
			result = result;
			counter ++;
		}
		String number = "";
		*/
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