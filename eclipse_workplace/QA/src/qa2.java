
public class qa2 {
	private int chem=-1,phy = -1,bio=-1,failingMarks=0;
	//	private int failed;
	float per,total;
	public void Calculations()
	{
		total = chem+phy+bio;
		per = (float)total*100/450;
	}
	public void ShowResults()
	{
		if (chem == -1 || phy == -1 || bio == -1)
			System.out.println("invalid grade");
		else if (failingMarks == 1)System.out.println("Please retake the exam");
		else if (failingMarks == 2)System.out.println("Please repeat the course");
		else if (failingMarks == 3)System.out.println("Please go home, you are drunk");
		else
		{
			System.out.println("totalscore = "+total);
			System.out.println("Percentage = "+per);
		}
	}
	public int Physics(int a)
	{
		if (a>=0 && a<=150)
		{
			phy = a;
			if (phy < 70) 
				failingMarks++;
		}
		else System.out.println("incorrect physics grade");
		return a;
	}
	public int Chemistry(int a)
	{
		if (a>=0 && a<=150)
		{
			chem = a;
			if (chem < 70)
				failingMarks++;
		}
		else System.out.println("incorrect chemistry grade");
		return a;
	}

	public int Biology(int a)
	{
		if (a>=0 && a<=150)
		{
			bio = a;
			if (bio < 70)
				failingMarks++;
		}
		else System.out.println("incorrect biology grade");
		return a;
	}
}


