import java.util.Arrays;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int stackSize = 5;

		String [] array = new String [stackSize];
		for (int j=0;j<stackSize;j++)
		{
		push(array,Integer.toString((int)(Math.random()*5000)));
		System.out.println(Arrays.toString(array));
		}
		System.out.println(peek(array));
		for (int j=0;j<stackSize;j++)
		{
		System.out.println(pop(array));
		System.out.println(Arrays.toString(array));
		}
		clear(array);
		for (int j=0;j<stackSize;j++)
		{
		push(array,Integer.toString((int)(Math.random()*5000)));
		System.out.println(Arrays.toString(array));
		}
		clear(array);
		System.out.println(Arrays.toString(array));
	}
	public static String[] push(String givenArray[],String element)
	{
		for (int i=givenArray.length-2;i>=0;i--)
		{
			givenArray[i+1]=givenArray[i];
		}
		givenArray [0]=element;
		
		return givenArray;
	}
	public static String pop(String givenArray[])
	{
		String frontElement = givenArray[0];
		for (int i=0;i<givenArray.length-1;i++)
		{
			givenArray[i]=givenArray[i+1];
			
		}
		givenArray[givenArray.length-1]=null;
		return frontElement;
		
	}
	
	public static String peek(String givenArray[])
	{
		String frontElement = givenArray[0];

		return frontElement;
		
	}

	public static void clear(String givenArray[])
	{
		for (int i=0;i<givenArray.length;i++)
		{
			givenArray[i]=null;
			
		}
}
}
