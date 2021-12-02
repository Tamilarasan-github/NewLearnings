package basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex
{

	public static void main(String[] args)
	{
		String paragraph="Hello! This is 1000$ per day.";
		
		Pattern pattern=Pattern.compile("[A-Za-z0-9]");
		Matcher matcher=pattern.matcher(paragraph);
		System.out.println("Numbers are..");
		while (matcher.find())
		{
			System.out.println(matcher.group());
			
		}

	}

}
