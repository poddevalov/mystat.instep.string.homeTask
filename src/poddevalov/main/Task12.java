package poddevalov.main;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

import poddevalov.metod.stirng.Enter;

public class Task12 {
	public static void main(String[] args) {
		int count = 0;
		String sourse = new String(Enter.enterStringKeyboard());
		String regex = ("(^(;|:)-*([)]+|[(]+))|(^(;|:)-*((\\[)+|(\\])+))");
		StringTokenizer sc = new StringTokenizer(sourse);
		while (sc.hasMoreTokens()) {
			if (sc.nextToken().matches(regex))
				count++;
		}
		if (count > 0)
			System.out.println("Количество смайликов в тексте " + count);
		else if (count == 0)
			System.out.println("В заданном тексте нет смайликов");
	}

}
