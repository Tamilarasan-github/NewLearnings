package basics;

import java.util.Scanner;

public class StringReverse
{

	public static void main(String[] args)
	{
		System.out.println("Please enter the input");
		Scanner scan=new Scanner(System.in);
		String input=scan.next();
		System.out.println("Input String is "+input);
		int length=input.length();
		System.out.println("Length of String is "+length);
		StringBuffer str=new StringBuffer();
		
		for(int i=length-1; i>=0; i--)
		{
			str.append(input.charAt(i));
		}
		System.out.println("Output is "+str.toString());

	}

}
