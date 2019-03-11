package poddevalov.main;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import poddevalov.metod.stirng.Enter;


public class Task04 {
	public static void divideOnWord(String input){
		String next = new String();
		StringTokenizer st = new StringTokenizer(input);
		while(st.hasMoreTokens()){
			next = st.nextToken();
			if(checkCondition(next))
				System.out.print(next + " ");
		}
	}
	
	public static boolean checkCondition(String next){
		String regular = "^[aeuioyAEYUIO].+[^aeuioyAEYUIO]$";
		Pattern p = Pattern.compile(regular);
		Matcher m = p.matcher(next);
		return m.matches();
	}

	public static void main(String[] args) {
		String sourseString = new String(Enter.enterStringKeyboard());
		divideOnWord(sourseString);
	}
}
