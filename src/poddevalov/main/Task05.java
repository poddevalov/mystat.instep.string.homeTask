package poddevalov.main;

import java.util.StringTokenizer;

import poddevalov.metod.stirng.Enter;


public class Task05 {
	public static void theOutput(String input) {
		int count = 0;
		StringTokenizer st = new StringTokenizer(input, ": ");
		while (st.hasMoreTokens()) {
			if (check(st.nextToken()))
				count++;
		}
		if (count > 0)
			System.out.println(count);
		else 
			System.out.println("no such words!");
	}

	public static boolean check(String next) {
		boolean b = false;
		if (next.length() % 2 == 0)
			b = true;
		return b;
	}

	public static void main(String[] args) {
		String sourseString = new String(Enter.enterStringKeyboard());
		theOutput(sourseString);
	}
}
