package poddevalov.main;

import poddevalov.metod.stirng.Enter;


public class Task08 {
	public static boolean identifierDefinitionsC(String input) {
		String regular = "([a-z]+_{1}[a-z]+)+";
		if (input.matches(regular))
			return true;
		return false;
	}

	public static boolean identifierDefinitionsJava(String input) {
		String regular = "([a-z]+[A-Z]{1}[a-z]+)+";
		if (input.matches(regular))
			return true;
		return false;

	}

	public static boolean variableNameCommon(String input) {
		String regular = "[a-z]+";
		if (input.matches(regular))
			return true;
		return false;
	}

	public static boolean mixedName(String input) {
		String regular = "([a-z]+_{1}[A-Z]{1}[a-z]+)+";
		if (input.matches(regular))
			return true;
		return false;
	}

	public static String convertingToJava(String input) {
		String[] sc = input.split("_");
		String toJava = sc[0];
		String temp = "";
		for (int i = 1; i < sc.length; i++) {
			for (int j = 0; j < sc[i].length(); j++) {
				if (j == 0)
					temp = String.valueOf(sc[i].charAt(j)).toUpperCase();
				else
					temp = String.valueOf(sc[i].charAt(j));
				toJava += temp;
			}
		}
		return toJava;
	}

	public static String convertingToCPlus(String input) {
		String toCPlus = "";
		String temp = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isUpperCase(input.charAt(i)))
				temp = "_" + String.valueOf(input.charAt(i)).toLowerCase();
			else
				temp = String.valueOf(input.charAt(i));
			toCPlus += temp;
		}
		return toCPlus;
	}

	public static void main(String[] args) {
		String output = "";
		String currentLine = new String(Enter.enterStringKeyboard());
		if (identifierDefinitionsC(currentLine)) {
			System.out.println("C++ variable");
			output = convertingToJava(currentLine);
			System.out.println(output);
		} else if (identifierDefinitionsJava(currentLine)) {
			System.out.println("variable Java");
			output = convertingToCPlus(currentLine);
			System.out.println(output);
		} else if (mixedName(currentLine))
			System.out.println("The string has mixed syntax");
	}
}
