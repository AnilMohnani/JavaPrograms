package programs2;

public class MaxNumberInTheRowOfMinNumber {
	public static void main(String[] args) {

		int arr[][] = { { 25, 6, 7 }, { 45, 17, 3 }, { 90, 8, 56 } };
		int min = arr[0][0];
		int k = 0;
		int max = arr[k][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					k = i;

				}

			}
		}

		System.out.println("min value " + min);

		for (int l = 0; l < 3; l++) {

			if (arr[k][l] > max) {
				max = arr[k][l];
			}

		}
		System.out.println("Max number in row containing min value is " +max);
	}
}