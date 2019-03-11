package poddevalov.main;
public class Task06 {
	public static String [] fillArrayString(String [] incomingArrayString){
		for (int i = 0; i < incomingArrayString.length; i++)
			incomingArrayString[i] = String.valueOf(i);
		return incomingArrayString;
	}
	
	public static void exsceptionNumber(String [] incomingArrayString){
		int count = 0;
		for (String symbol : incomingArrayString){
			if (symbol.contains("4"))
				count++;
			else if (symbol.contains("13"))
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String[] arrayString = new String[10000];
		fillArrayString(arrayString);
		exsceptionNumber(arrayString);
	}
}
