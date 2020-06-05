package programs;

public class Swapping {

	public static void main(String[] args) {

		int a = 87;
		int b = 234;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);

		System.out.println(
				"------------------------------------Without Temp variable-----------------------------------------");
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);

	}
}
