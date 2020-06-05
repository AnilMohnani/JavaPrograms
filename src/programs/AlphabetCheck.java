package programs;

public class AlphabetCheck {

	public static void main(String[] args) {
		char ch='?';

		if(ch >='a' && ch <='z' || ch >='A' && ch <='Z')
		{
			System.out.println("Alphabet");
		}
		else System.out.println("Not Alphabet");
	}

}
