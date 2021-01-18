package jan18_alphabet_pattern;

public class K {

	public void display(int n, int i) {
		// int n = 20;
		// for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (j == n / 2 || i == j && i > n / 2 || i + j == n + 1 && i <= n / 2) {
				System.out.print("*");
			} else if (j > n / 2) {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
