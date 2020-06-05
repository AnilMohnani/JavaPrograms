package programs;

import java.util.Scanner;

public class MultiplyFloatingNumbers {
	public static void main(String[] args) {
		float f1;
		float f2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		f1 = sc.nextFloat();
		System.out.println("Enter 2nd no");
		f2 = sc.nextFloat();
		System.out.println(f1*f2);

	}
}

