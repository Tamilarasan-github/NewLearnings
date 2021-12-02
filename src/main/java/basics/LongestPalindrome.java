package basics;

public class LongestPalindrome
{
	public static void main(String[] args)
	{
		//findLongestPalindrome("121");
		
		System.out.println(longestPalindromeString("1234"));
		System.out.println(longestPalindromeString("12321"));
		System.out.println(longestPalindromeString("9912321456"));
		System.out.println(longestPalindromeString("9912333321456"));
		System.out.println(longestPalindromeString("12145445499"));
		System.out.println(longestPalindromeString("1223213"));
		System.out.println(longestPalindromeString("abb"));
	}
	
	public static  String findLongestPalindrome(String input)
	{
		int inputSize=input.length();
		String longestPalindrome=input.substring(0,1);;
		for(int i=0; i<inputSize-1; i++)
		{
			String newPalindrome=getPalindrome(input, i, i);
			if(newPalindrome.length()>=longestPalindrome.length())
			{
				longestPalindrome=newPalindrome;
			}
		}
		
		return longestPalindrome;
	}
	
	public static String getPalindrome(String input, int left, int right)
	{
		while(left>=0 && right<input.length() && input.charAt(left)== input.charAt(right))
		{
			left--;
			right++;
			System.out.println("Left pointing to:"+left);
			System.out.println("Right pointing to:"+right);
		}
		String palindrome=input.substring(left+1, right);
		return palindrome;
	}
	
	
	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
//			//odd cases like 121
//			String palindrome = intermediatePalindrome(s, i, i);
//			if (palindrome.length() > longest.length()) {
//				longest = palindrome;
//			}
			//even cases like 1221
			String palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}
}
