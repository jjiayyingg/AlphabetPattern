package jan18_alphabet_pattern;

public class R {

	public void display(int n, int i) {
		// int n = 10;
		// for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (j == n / 2 || i == 1 && j != n && j > n / 2 || i == n / 2 && j != n && j > n / 2
					|| j == n && i < n / 2 && i != 1 || i == j && i > n / 2) {
				System.out.print("*");
			} else if (j > n / 2) {
				System.out.print(" ");
			}
		}
		// System.out.println();
		// }
	}
}
