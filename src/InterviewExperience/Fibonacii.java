package InterviewExperience;

public class Fibonacii {

	public static void main(String[] args) {
		int a = 0, b = 1;
		int num = 20;
		System.out.println(a);

		for (int i = 1; i <= num; i++) {
			int sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}
	}

}
