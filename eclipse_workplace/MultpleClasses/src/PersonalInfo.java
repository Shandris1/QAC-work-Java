
public class PersonalInfo {
String Name;
int Phy,Che,Mat;
float Total,Per;

public static void main(String[] args) {
	// TODO Auto-generated method stub
PersonalInfo records[]=new PersonalInfo[5];
records[0]=new PersonalInfo();
records[1]=new PersonalInfo();
records[0].Name="Shabir";
records[0].Phy=75;
records[0].Che=75;
records[0].Mat=75;
records[0].Calculation();
records[0].ShowResults();

}

public void Calculation()
{
	Total = Phy+Che+Mat;
	Per=Total*100/150;
}
public void ShowResults()
{
	System.out.println("total"+Total);
	System.out.println("Percentage"+Per);
}



}

