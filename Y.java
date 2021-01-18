package jan18_alphabet_pattern;

public class Y {

	public void display(int n, int i) {
		// int n = 10;
		// for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (j == i && i <= n / 2 || j + i == n + 1 && i < n / 2 || j == n / 2 && i > n / 2) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
