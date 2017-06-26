import java.util.Scanner;
public class SayingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		sayingTenToTwenty tenToTwenty;
		sayingTens tens;
		sayingOnes ones;
		tenToTwenty = new sayingTenToTwenty();
		tens = new sayingTens();
		ones = new sayingOnes();
		String thousandsword = "";
		String hundredsword = "";
		String tensword = "";
		String onesword = "";
		System.out.println("Enter the start number");
		int number =keyboard.nextInt();
		System.out.println("Enter the end number");
		int numberend =keyboard.nextInt();
		if (number == 1234)
			number = (int)(Math.random()*10000);

		for(;number<=numberend;number++)
		{
			thousandsword = ones.conversion((number%10000)/1000);
			hundredsword = ones.conversion((number%1000)/100);
			tensword = tens.conversion((number%100)/10);
			onesword = ones.conversion(number%10);
			//System.out.print("The number is: ");
			if (((number%10000)/1000)>0)
				System.out.print(thousandsword+" Thousand ");
			if (((number%1000)/100) > 0)
				System.out.print(hundredsword+" Hundred ");
			if (((number%100)/10)==1) 
			{
				tensword = tenToTwenty.conversion(number);
				System.out.print(tensword);
			}
			else
			{
				tensword = tens.conversion(((number%100)/10));
				System.out.print(tensword+" ");
				onesword = ones.conversion(number%10);
				System.out.print(onesword);
			}
			System.out.println("");
		}




		//fullPhrase = ones.conversion(number);
		//System.out.println(fullPhrase);

	}

}
