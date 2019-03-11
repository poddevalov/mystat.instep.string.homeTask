package poddevalov.main;

import poddevalov.metod.stirng.Enter;
public class Task07 {
	public static void replacementCharacter(String input) {
		String changetStirng = new String();
		String temp1;
		String temp2;
		char s;
		for (int i = 0; i < input.length(); i++) {
			temp1 = "";
			temp2 = "";
			s = input.charAt(i);
			if (Character.isDigit(s)) {
				temp1 = String.valueOf(s);
				temp2 = temp1.replace(temp1, "_");
			} else if (Character.isLowerCase(s)) {
				temp1 = String.valueOf(s);
				temp2 = temp1.toUpperCase();
			} else if (Character.isUpperCase(s)) {
				temp1 = String.valueOf(s);
				temp2 = temp1.toLowerCase();
			} else if (s == ' ')
				temp2 = String.valueOf(s);
			else
				temp2 = String.valueOf(s);
			changetStirng += temp2;
		}
		System.out.println(changetStirng);
	}

	public static void main(String[] args) {
		String sourseString = new String(Enter.enterStringKeyboard());
		replacementCharacter(sourseString);
	}
}
