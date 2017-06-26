import java.util.Arrays;

public class Top3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize=20;
		int [] result=new int [3];
		int [] array1 = new int [arraySize];
		array1=new int[] {1,209,45,4,5,6,7,8,9,10,11,45,12,11,12,309,9,9,9,309};
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<array1.length;j++)
			{
				if(i==0){//Find the highest number and record it in the first slot of result array
					if (array1[j]>result[i])
					{
						result[i]=array1[j];
					}
				}
				else
				{
					if ((array1[j]>result[i])&&(result [i-1]>array1[j]))//find the highest number and compare it with previous highest number. if lower, record it.
					{
						result[i]=array1[j];
					}
				}
			}
		}
		System.out.println("Top 3 = " + Arrays.toString(result));
	}


}
