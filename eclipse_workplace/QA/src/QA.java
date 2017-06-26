import java.util.Scanner;

public class QA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valid_input = -1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter an integer");


		qa2 Peter,John;
		ifstatements Peters;
		ifharder Johns;
		Peters = new ifstatements();
		Johns = new ifharder();
		Peter = new qa2();
		John = new qa2();
		while ((valid_input<0) || (valid_input>150))
		{
		System.out.println("enter Chem grade");
		valid_input = Peter.Chemistry(keyboard.nextInt());
		}
		valid_input = -1;
		while ((valid_input<0) || (valid_input>150))
		{
		System.out.println("enter Bio grade");
		valid_input = Peter.Biology(keyboard.nextInt());
		}
		valid_input = -1;
		while ((valid_input<0) || (valid_input>150))
		{
		System.out.println("enter Phy grade");
		valid_input = Peter.Physics(keyboard.nextInt());
		}
		valid_input = -1;
		/*
		John.Biology(55);
		John.Chemistry(55);
		John.Physics(60);
		*/
		Peter.Calculations();
		Peter.ShowResults();
		//John.Calculations();
		//John.ShowResults();
/*
		John.Calculations();
		John.ShowResults();
		Peters.testing();
		Johns.hardif();
	*/
	}



}