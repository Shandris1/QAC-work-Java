import java.util.Scanner;
public class addDigits 
{

	public static void main(String[] args)
	{	
		int num;
		int temp = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");
		num = keyboard.nextInt();
		//System.out.println(num/100+(num-num/100*100)/10+num%10);
		while (num>0)
		{
		temp = temp + num%10;
		num = num/10;
		System.out.println("temp "+temp);
		System.out.println("num "+num);
		}
		System.out.println(temp);
	}
}


