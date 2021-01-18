package jan18_alphabet_pattern;

public class V {

	public void display(int n, int i) {
		// int n = 10;
		// for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (j == 1 && i <= n / 2 || j == n && i <= n / 2 || i - j == n / 2 || j + i == 3 * n / 2 + 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
