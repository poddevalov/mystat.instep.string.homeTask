package poddevalov.main;

import java.util.Arrays;

import poddevalov.metod.stirng.Enter;

public class Task09 {

	public static String deletePunct(String input) {
		String regex = "\\p{Punct}";
		return input.replaceAll(regex, "");
	}

	public static String deleteProbel(String input) {
		return input.replace(" ", "");
	}

	public static boolean comparisonOfLength(String input1, String input2) {
		if (input1.length() == input2.length())
			return true;
		else
			return false;
	}

	public static char[] arrayStirng(String input) {
		return input.toCharArray();
	}

	public static char[] sortArray(char[] input) {
		Arrays.sort(input);
		return input;
	}

	public static void main(String[] args) {
		String sc = new String(Enter.enterStringKeyboard());
		String sc2 = new String(Enter.enterStringKeyboard());

		sc = deleteProbel(deletePunct(sc));
		sc2 = deleteProbel(deletePunct(sc2));
		sc = sc.toLowerCase();
		sc2 = sc2.toLowerCase();
		if (comparisonOfLength(sc, sc2)) {
			sc = new String(sortArray(arrayStirng(sc)));
			sc2 = new String(sortArray(arrayStirng(sc2)));
		}
		System.out.println(sc.equals(sc2) ? "YES" : "NO");
	}
}
