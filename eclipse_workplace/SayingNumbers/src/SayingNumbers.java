
public class SayingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 sayingThousands thousands;
 sayingTenToTwenty tenToTwenty;
 sayingTens tens;
 sayingOnes ones;
 thousands = new sayingThousands();
 tenToTwenty = new sayingTenToTwenty();
 tens = new sayingTens();
 ones = new sayingOnes();
 String thousandsword = "";
 String hundredsword = "";
 String tensword = "";
 String onesword = "";
 int number = 1234;  //change number here!!!!!!
 if (number == 1234)
	 number = (int)(Math.random()*10000);
 for (;true; )
 {
	number = ++number;
 System.out.println(number);
 }
	 thousandsword = ones.conversion((number%10000)/1000);
	 hundredsword = ones.conversion((number%1000)/100);
	 tensword = tens.conversion((number%100)/10);
	 onesword = ones.conversion(number%10);
	 System.out.print("The number is: ");
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
	 		
		
	 	
	 
 
 //fullPhrase = ones.conversion(number);
 //System.out.println(fullPhrase);
 
	}
	
}
