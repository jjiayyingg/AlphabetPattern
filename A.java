package jan18_alphabet_pattern;

public class A {

	public void display(int n, int i) {
		// for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i == 1 && j != 1 && j != n || i == n / 2 || j == 1 && i != 1 || j == n && i != 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
