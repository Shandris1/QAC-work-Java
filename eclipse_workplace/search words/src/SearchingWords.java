//This program searches the string and replaces it with replace string
public class SearchingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String InputString = "welcome fdahjfdsjfdsjoejkroq test fdahjfdsjfdsjoejkroq test";
		String SearchString = "welcome";
		String ReplaceString = "hello";
		SearchingMethod Investigation = new SearchingMethod();
		Investigation.Find(InputString,SearchString,ReplaceString);
		System.out.println("input length = " +InputString.length());
	}

}

class SearchingMethod
{
	public void Find (String Input, String Search,String Replace)
	{
		int SearchPosition = 0;
		int WordCount = 0;
		String WordPosition = "";
		int SavedPosition = 0;
		int flag = 0;
		//int flag2 = 0;
		String ResultString = "";
		
		for (int i=0;i<Input.length();i++)
		{
			System.out.println("ibeginning of loop = " +i);
			//System.out.print(" ");
			if (SearchPosition==0)
			{
				SavedPosition = i;
				if (flag == 0)
				{
					ResultString = ResultString + Input.charAt(i);
				}
				else
				{
					flag = 0;
					ResultString = ResultString.substring(0,ResultString.length()-1);
					
					ResultString = ResultString + Replace ;
					System.out.println("i b4 = " +i);
					i = SavedPosition-1;
					//i = (SavedPosition+Search.length()-1);
					System.out.println("i aftr = " +i);
				}
			}
			while (Input.charAt(i)==Search.charAt(SearchPosition))
			{
				SearchPosition ++;
				if( SearchPosition == (Search.length())) 
				{
					if (WordCount>0)
						WordPosition = WordPosition + ",";
					SearchPosition = 0;
					WordCount ++;
					flag = 1;
					WordPosition = WordPosition + SavedPosition;

					break;

				}
			}
		} 
		System.out.println("Word Count: "+WordCount);
		System.out.println("Word Positions: "+WordPosition);
		System.out.println("Result phrase: "+ResultString);

	}
}