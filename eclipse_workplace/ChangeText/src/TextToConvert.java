
public class TextToConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ConvertSingleCharacter one;
 one = new ConvertSingleCharacter();
		String N = "27}{@~PSDBhda3187@}{@";//Input
		String output ="";
 for (int i=0;i<N.length();i++)
 {
	 output = output + one.OneCharacter(N.charAt(i));
	 //System.out.println(N.charAt(i));
 }
 System.out.println("Input = "+N);
 System.out.println("Output = "+output);
	}

}
