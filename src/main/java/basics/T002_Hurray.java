package basics;

import java.util.ArrayList;
import java.util.List;

public class T002_Hurray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words[] = { "India", "Hey", "Hey", "India", "Dhoni", "Dhoni", "Raina", "Kholi", "Raina", "Kholi" };

		List<String> listOfWords = new ArrayList<String>();

		for (int i = 0; i <=words.length - 1; i++) {
			if (!(i == words.length - 1)) {
				if (words[i].equals(words[i + 1])) {
					System.out.println(words[i] + " & " + words[i + 1] + " = Hurry!");
				} else {
					if (listOfWords.contains(words[i])) {
						System.out.println(words[i] + " already on list = Oops!");
					}
					listOfWords.add(words[i]);
				}
			} else {
				if (listOfWords.contains(words[i])) {
					System.out.println(words[i] + " already on list = Oops!");
				}
			}

		}

	}

}
