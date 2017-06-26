public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float answer;
		int path;
		Math3 calculate = new Math3();
		answer = calculate.divide(15, 0);
		System.out.println(answer);
		path = (int)(Math.random()*4);
		float x = (int)(Math.random()*100);
		float y = (int)(Math.random()*100);
		switch (path)
		{
		case 1:
		answer = calculate.add(x, y);
		System.out.println("result of addition between "+(int)x+" and "+(int)y+" is " +(int)answer);
		break;
		case 2:
			answer = calculate.subtract(x, y);
			System.out.println("result of subtraction between "+(int)x+" and "+(int)y+" is " +(int)answer);
			break;
		case 3:
			answer = calculate.divide(x, y);
			System.out.println("result of division between "+(int)x+" and "+(int)y+" is " +answer);
			break;
		default:
			answer = calculate.multiply(x, y);
			System.out.println("result of multiplication between "+(int)x+" and "+(int)y+" is " +(int)answer);
			break;
		}
		//System.out.println(answer);
	}

}
