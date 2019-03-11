package poddevalov.main;

import poddevalov.metod.stirng.Enter;

public class Task02 {
	public static void main(String[] args) {
		String sourseString = new String();
		int x = 1;
		char i;
		while (x < 1000) {
			sourseString += String.valueOf(x);
			x++;
		}
		System.out.println(sourseString.charAt(Enter.enterNumber()));
	}

}
