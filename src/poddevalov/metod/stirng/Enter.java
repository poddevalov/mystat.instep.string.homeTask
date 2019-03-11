package poddevalov.metod.stirng;

import java.util.Scanner;

public class Enter {

	public static String enterStringKeyboard() {
		String input = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stirng:");
		return input = sc.nextLine();
	}

	public static char enterSymbolKeybort() {
		char symbol = 0;
		String input = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter symbols: ");
		input = sc.nextLine();
		return symbol = input.charAt(0);
	}
	public static int enterNumber(){
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		return i = sc.nextInt();
		
	}
}
