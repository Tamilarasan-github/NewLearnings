package basics;

import java.util.Scanner;

public class StringPalindrome
{
	public static void main(String[] args)
	{
		checkPalindrome();
	}

	public static void checkPalindrome()
	{
		System.out.println("Please enter input");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		int count = input.length();
		StringBuilder str = new StringBuilder();
		String reversed;
		for (int i = count - 1; i >= 0; i--)
		{
			str.append(input.charAt(i));
		}
		reversed=str.toString();
		System.out.println("Reversed String:"+reversed);
		if (input.equals(reversed))
		{
			System.out.println("Yes, it is palindrome.");
		}
		else
		{
			System.out.println("No, it is not");
		}
	}
}
