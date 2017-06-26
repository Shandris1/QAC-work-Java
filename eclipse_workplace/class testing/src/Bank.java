
class Bank {
int A;
static Bank R;
public void msg()
{
System.out.println("hello");
}
private Bank(){}
public static Bank XYZ()
{
	if(R==null)
	{
		R= new Bank();
	}
	return R;
}

}
