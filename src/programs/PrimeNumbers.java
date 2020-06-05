package programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 17, count = 2;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				++count;

			}
			
		}
		if (count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
