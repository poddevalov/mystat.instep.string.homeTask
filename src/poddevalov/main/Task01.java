package poddevalov.main;

import poddevalov.metod.stirng.Enter;


public class Task01 {

	public static void main(String[] args) {
		String sourseString = new String(Enter.enterStringKeyboard());
		char symbol = Enter.enterSymbolKeybort();
		entrySymbolString(sourseString, symbol);
	}

	public static void entrySymbolString(String input, char symbol) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (symbol == input.charAt(i)) {
				count++;
				System.out.print(i + " ");
			}
		}
		if (count > 0)
			System.out.print("\n" + "Number of matches: " + count);
		else
			System.out.println(input);
	}
}
