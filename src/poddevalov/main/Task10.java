package poddevalov.main;

import poddevalov.metod.stirng.Enter;

public class Task10 {
	public static void diamondPrinting2(String input) {

		for (int i = input.length(); i >= 0; i--) {

			for (int j = input.length() - i + 1; j < input.length(); j++) {
				System.out.print(input.charAt(j));
			}
			System.out.println();
		}
	}

	public static void diamondPrinting(String input) {
		int temp;
		for (int i = 0; i < input.length(); i++) {
			temp = input.length() - 1;
			while (temp >= 0) {
				System.out.print(" ");
				if (temp == i) {
					for (int j = 0; j < i + 1; j++)
						System.out.print(input.charAt(j));
				}
				temp--;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		String sourse = new String(Enter.enterStringKeyboard());
		if (sourse.length() <= 50) {
			diamondPrinting(sourse);
			diamondPrinting2(sourse);
		} else
			System.out.println("Длина строки вышла за допустимые пределы");
	}
}
