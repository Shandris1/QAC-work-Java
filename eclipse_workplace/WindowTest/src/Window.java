import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frame Win=new Frame();
TextField T1=new TextField();
Button Bi= new Button("+");
TextField T2 = new TextField(10);
TextField T3 = new TextField(10);
Event2 E=new Event2(T1,T2,T3);
FlowLayout FL = new FlowLayout();
Bi.addActionListener(E);
Win.SetLayout(FL);
Win.add(new Label("No1:"));
Win.add(T1);
Win.add(new Label("+"));
Win.add(new Label("No2:"));
Win.add(T2);
Win.add(Bi);
Win.add(T3);
Win.setSize(400,500);
Win.setVisible(true);
	}



/*Event2 E=new Event2(Ti);
Bi.addActionListener(E);
Win.add(Ti,BorderLayout.NORTH);
Win.add(Bi,BorderLayout.CENTER);
Win.setSize(300,500);
Win.setVisible(true);
	}
*/

class Event2 implements ActionListener
{
	TextField X,Y,Z;
	public Event2(TextField T1,TextField T2,TextField T3)
	{
		X=T1;
		Y=T2;
		Z=T3;
	}
	public void actionPerformed(ActionEvent T)
	{
		int A,B,C;
		A=Integer.parseInt(X.getText());
		B=Integer.parseInt(Y.getText());
		C=A+B;
		Z.setText(Integer.toString(C));
	}
	
}