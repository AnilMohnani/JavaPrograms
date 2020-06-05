package programs;

public class VowelConstant {

	public static void main(String[] args) {
		char c = 'z';
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Vowel");
		} else
			System.out.println("Constant");

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Vowel");
		break;
		default:
		System.out.println("Constant");
		break;
		}

	}
}
