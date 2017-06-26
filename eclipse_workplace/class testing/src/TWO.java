
public class TWO extends ONE {
public TWO ()
{
	super(2,7); 
	System.out.println("2");	

}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	TWO T = new TWO();
	Bank HSBC,Barclays;
	HSBC=Bank.XYZ();
	Barclays =Bank.XYZ();
	HSBC.A=75;
	System.out.println(Barclays.A);
	//System.out.println("x");
}

}
