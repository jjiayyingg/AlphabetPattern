package jan18_alphabet_pattern;

public class Q {

	public void display(int n, int i) {
		// int n = 10;
		// for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i == 1 && j != 1 && j < n * 3 / 4 || i == n && j != 1 && j < n * 3 / 4 || j == 1 && i != 1 && i != n
					|| j == n * 3 / 4 && i != 1 && i != n || j == i && i > n / 2) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
