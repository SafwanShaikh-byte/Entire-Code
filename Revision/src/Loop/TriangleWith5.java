package Loop;

public class TriangleWith5 {

	public static void main(String[] args) {
		
		System.out.println("Triangle Pattern with #");

		int n = 5;

		for (int i = 1; i <= n; i++) {
			// Print spaces
			for (int j = n; j >i; j--) {
				System.out.print(" ");
			}

			// Print #
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("#");
			}

			System.out.println();
		}
	}
}
