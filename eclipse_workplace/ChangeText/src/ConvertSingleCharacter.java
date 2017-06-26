
public class ConvertSingleCharacter {
public String OneCharacter(char a)
{
	char character = ' ';
	int ascii = 0;
	String StringToSend = "";
	ascii = (int)a;
	
	if (ascii <=57 && ascii > 47)
	{
	StringToSend = (Integer.toString((ascii-48)*2));
	}
	
	else if (ascii <=90 && ascii >64)
	{
		StringToSend = Character.toString((char)(ascii + 32));
	}
	
	else if (ascii <= 122 && ascii > 96)
	{
		StringToSend = Character.toString((char)(ascii - 32));
	}
	else
	{
		StringToSend = Character.toString((char)ascii);
	}

	//System.out.println(a);
	//System.out.println(ascii);
	//System.out.println(StringToSend);
	return StringToSend;
}
}

/*
StringToSend = StringToSend + a;
ascii = ascii *2;
StringToSend = Integer.toString(ascii);

*else if (ascii <= 96)
	{
		StringToSend = Character.toString((char)ascii);
	}
*
*else if (ascii <= 64)
	{
		StringToSend = Character.toString((char)ascii);
	}
	
	if (ascii <= 47)
	{
	StringToSend = Character.toString((char)ascii);	
	}
	else
*/
