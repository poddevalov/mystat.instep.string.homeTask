package poddevalov.main;

import poddevalov.metod.stirng.Enter;

public class Task03 {
	public static int averageLengthWord(String input) {
		int countWord = 1;
		int countLetter = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) >= 'a' && input.length() <= 'z') || (input.charAt(i) >= 'A' && input.length() <= 'Z'))
				countLetter++;
			else if (input.charAt(i) == ' ')
				countWord++;
		}
		return countLetter / countWord;
	}

	public static void main(String[] args) {
		int averageLength;
		String sourseString = new String(Enter.enterStringKeyboard());
		averageLength = averageLengthWord(sourseString);
		System.out.println(averageLength);
	}

}
