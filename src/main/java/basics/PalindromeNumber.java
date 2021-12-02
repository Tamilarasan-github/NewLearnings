package basics;

public class PalindromeNumber
{

	public static void main(String[] args)
	{
		isPalindrome(121);

	}
	
	public static void isPalindrome(int inputNum)
	{
		int reversedNum=0;
		int userInput=inputNum;
		
		while(inputNum!=0)
		{
			int reminder=inputNum%10;
			System.out.println("Reminder is "+reminder);
			reversedNum=reversedNum*10+reminder;
			System.out.println("Reversed num is "+reversedNum);
			inputNum=inputNum/10;
			System.out.println("Input num is "+inputNum);
		}
		
		System.out.println("Reversed Num is "+reversedNum);
		
		if(reversedNum==userInput)
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	//9912321456
	//6541232199

}
