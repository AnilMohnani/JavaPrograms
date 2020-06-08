package programs;

public class FactorialRecursion {

	public static void main(String[] args) {
		int fact = FactorialRecursion.factCalc(5);
		System.out.println(fact);
	}

	public static int factCalc(int num) {
		if (num >= 1) {
			return num * factCalc(num - 1);
		} else
			return 1;
	}

}
