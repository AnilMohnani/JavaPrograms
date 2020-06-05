package programs;

public class Calculator {
	public static void main(String[] args) {

		int a = 10, b = 20;
		char ch = '-';

		switch (ch) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(b - a);
			break;
		default:
			System.out.println("not");

		}
		}
}
