package basics;

import java.util.Iterator;

public class T001_RandomNumbersAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numbers[]= {1,2,3,4,5,6, 7, 8, 9, 0,-1,-2,-3,-4,-5};
		int sum=6;
		for (int i = 0; i < numbers.length; i++) 
		{
			for (int j=i+1; j < numbers.length; j++) {
				if(numbers[i]+numbers[j]==sum)
				{
					System.out.println(numbers[i]+" plus "+numbers[j]+" equals "+sum);
				}
			}
		}

	}

}
