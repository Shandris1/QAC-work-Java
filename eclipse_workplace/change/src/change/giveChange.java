package change;
import java.util.Scanner;

public class giveChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amountLeft = 0;
		int amounttopay = 0;
		int amountgiven = 0;
		ONSTest x;
		x= new ONSTest();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount to pay");
		amounttopay = (int)Math.round((keyboard.nextDouble()*100));
		System.out.println("Enter the amount given");
		amountgiven = (int)Math.round((keyboard.nextDouble()*100));
		amountLeft=amountgiven-amounttopay;
		
		
		//System.out.println("Enter the ammount paid");
		if (amountLeft<0)
		{
			System.out.println("Not enough given, ask for more");
		}
		else
		{
			if (amountLeft>=5000)
			{
				System.out.println("Please give "+(amountLeft/5000)+" 50£ notes ");
				amountLeft=amountLeft-amountLeft/5000*5000;
			}
			if (amountLeft>=2000)
			{
				System.out.println("Please give "+(amountLeft/2000)+" 20£ notes ");
				amountLeft=amountLeft-amountLeft/2000*2000;
			}
			if (amountLeft>=1000)
			{
				System.out.println("Please give "+(amountLeft/1000)+" 10£ notes ");
				amountLeft=amountLeft-amountLeft/1000*1000;
			}
			if (amountLeft>=500)
			{
				System.out.println("Please give "+(amountLeft/500)+" 5£ notes ");
				amountLeft=amountLeft-amountLeft/500*500;
			}
			if (amountLeft>=200)
			{
				System.out.println("Please give "+(amountLeft/200)+" 2£ coin ");
				amountLeft=amountLeft-amountLeft/200*200;
			}
			if (amountLeft>=100)
			{
				System.out.println("Please give "+(amountLeft/100)+" 1£ coin ");
				amountLeft=amountLeft-amountLeft/100*100;
			}
			if (amountLeft>=50)
			{
				System.out.println("Please give "+(amountLeft/50)+" 50p coin ");
				amountLeft=amountLeft-amountLeft/50*50;
			}
			if (amountLeft>=20)
			{
				System.out.println("Please give "+(amountLeft/20)+" 20p coin ");
				amountLeft=amountLeft-amountLeft/20*20;
			}
			if (amountLeft>=10)
			{
				System.out.println("Please give "+(amountLeft/10)+" 10p coin ");
				amountLeft=amountLeft-amountLeft/10*10;
			}
			if (amountLeft>=5)
			{
				System.out.println("Please give "+(amountLeft/5)+" 5p coin ");
				amountLeft=amountLeft-amountLeft/5*5;
			}
			if (amountLeft>=2)
			{
				System.out.println("Please give "+(amountLeft/2)+" 2p coin ");
				amountLeft=amountLeft-amountLeft/2*2;
			}
			if (amountLeft>=1)
			{
				System.out.println("Please give "+(amountLeft/1)+" 1p coin ");
				amountLeft=amountLeft-amountLeft/1*1;
			}
			System.out.println("Thank the customer for his buisness");
		}
	}

}
