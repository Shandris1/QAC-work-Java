import java.util.Arrays;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String map [][]= new String[2][5];
		for (int j=0;j<map[0].length+5;j++)
		{
			
			map=add(map,Integer.toString(j),"house"+Integer.toString(j));
		}
		System.out.println("Map Array = " + Arrays.toString(map[0]));
		System.out.println("Value Array = " + Arrays.toString(map[1]));
		System.out.println(findByKey(map,"2"));
		System.out.println(mapKey(map,"1","OVERWATCH"));
		System.out.println("Map Array = " + Arrays.toString(map[0]));
		System.out.println("Value Array = " + Arrays.toString(map[1]));
		System.out.println(containsValue(map,"OVERWATCH"));

	}


	public static String[][] add(String[][]map,String key,String value)
	{
		int flag = 0;
		for(int i=0;i<map[0].length;i++)
		{
		if (map[0][i]==key)
				{
			flag = 1;
				
		System.out.println("duplicate key detected");
		}}
		for(int i=0;flag == 0;i++)
		{
			//System.out.println("Map Array = " + Arrays.toString(map[0]));
			if (map[0][i]==null)
			{
				map[0][i]=key;
				map[1][i]=value;
				flag = 1;
			}
			else if (i>=map[0].length-1)
			{
				flag = 1;
				System.out.println("Map full");
			}
			else
			{}

		}
		return map;
	}
	public static String[][] remove(String[][]map,String key)
	{
		int flag =0;
		for(int i=0;flag == 0;i++)
		{
			if (map[0][i]==key)
			{
				map[0][i]=null;
				flag = 1;
			}
			else if (i>=map[0].length-1)
			{
				flag = 1;
				System.out.println("key not found");
			}
			else
			{}

		}
		return map;
	}
	public static String findByKey(String[][]map,String key)
	{
int flag = 0;
		for(int i=0;flag == 0;i++)
		{
			System.out.println("current key"+map[0][i]);
			System.out.println("search key"+key);

			if (map[0][i].equals (key))
			{
				return map[1][i];
			}
			else if (i>=map[0].length-1)
			{
				flag = 1;
				System.out.println("key not found");
				return null;
			}
			else
			{}
		
		
	}
		System.out.println("key not found");
		return null;
}
	public static String[][] mapKey(String[][]map,String key,String value)
	{
		int flag = 0;
		for(int i=0;flag == 0;i++)
		{
			if (map[0][i].equals(key))
			{
				map[1][i]=value;
				return map;
			}
			else if (i>=map[0].length-1)
			{
				flag = 1;
				System.out.println("key not found");
				return null;
			}
			else
			{}
		//return null;
		
	}
		return null;	
		
		
		
	}
	public static boolean containsValue(String[][]map,String value)
	{
		int flag = 0;
		for(int i=0;flag == 0;i++)
		{
			if (map[1][i].equals(value))
			{
				//map[1][i]=value;
				return true;
			}
			else if (i>=map[0].length-1)
			{
				flag = 1;
				System.out.println("value not found");
				return false;
			}
			else
			{}
		//return false;
		
	}
		return false;	
		
		
		
	}
}

