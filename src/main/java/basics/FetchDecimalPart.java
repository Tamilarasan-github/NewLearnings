package basics;

public class FetchDecimalPart
{

	public static void main(String[] args)
	{
		getDecimalPart(2.200);
		System.out.println("==================================");
		getDecimalPart(552.255500);
		System.out.println("==================================");
		getDecimalPart(2.2050);
		System.out.println("==================================");
		getDecimalPart(2.0200);
	}
	
	public static String getDecimalPart(double input)
	{
		double actual=input;
		System.out.println("double decimal: "+input);
		int num=(int)actual;
		System.out.println("Number: "+num);
		double num2=actual-num;
		System.out.println("double decimal part: "+num2);
		String numAsString=String.valueOf(num2);
		System.out.println("String decimal part: "+numAsString);
		String output=numAsString.substring(numAsString.indexOf(".")+1);
		System.out.println("Final output: "+output);
		return output;
		
	}

}
