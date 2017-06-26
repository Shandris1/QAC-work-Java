import java.util.Arrays;
import java.util.Random;



public class UnitedKingdom 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		a manipulation = new a();
		int topNumber = 0;
		int currentNumber =0;
		int bottomNumber = 1;
		int arraySize = 6000;
		int [] array1 = new int [arraySize];
		int [] sortedArray = new int [arraySize];
		/*
		int topLimit = 50;
		int bottomLimit=-1;
		int topPosition = 0;
		int bottomPosition = 0;
		//double averege = 0;
		*/
		
		for (int i=0;i<arraySize;i++)
		{
			array1[i]= (int)((Math.random()*5000));
			
		}
		System.out.println("Start Array = " + Arrays.toString(array1));
		manipulation.bubbleSort(array1);
	
	
	}


		
}
		/*
//System.out.println((int)(Math.random()*50));
		System.out.println(Arrays.toString(array1));
		for (int position =0;position<(arraySize/2);position++)
		{
		for (int i = 0;i<arraySize;i++)
		{
			averege = averege + array1[i];
			currentNumber = array1[i];
			if (currentNumber > topNumber && currentNumber<=topLimit)
			{
				topNumber=currentNumber;
				topPosition = i;
			}
		}
		averege = averege/arraySize;
		System.out.println("Top number = " +topNumber);
		bottomNumber = array1[1];
		for (int i = 0;i<arraySize;i++)
		{
			currentNumber = array1[i];
			if (currentNumber < bottomNumber && currentNumber>=bottomLimit)
			{
				bottomNumber=currentNumber;
				bottomPosition = i;
			}
		}
		System.out.println("Bottom number = "+bottomNumber);
		sortedArray [0+position]= bottomNumber;
		bottomLimit = bottomNumber;
		bottomNumber = 50;
		sortedArray [arraySize-1-position]=topNumber;
		topLimit = topNumber;
		topNumber = 0;
		array1[topPosition]=(int)averege;
		array1[bottomPosition]=(int)averege;
		}
		System.out.println("SortedArray = " + Arrays.toString(sortedArray));
		*/

