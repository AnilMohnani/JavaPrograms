package programs;

public class PowerOfNumber {

	public static void main(String[] args) {
		int base = 2, exponent = 4;
		long result = 1;
		while (exponent != 0) {
			result = result * base;
			exponent--;

		}
		System.out.println(result);
		System.out.println(Math.pow(4, 5));
	}

}
