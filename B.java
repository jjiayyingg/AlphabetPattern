package jan18_alphabet_pattern;

public class B {

	public void display(int n, int i) {
		// for(int i=1; i<=n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i == 1 && j != n || i == n / 2 && j != n || j == 1 || j == n && i != 1 && i != n / 2 && i != n
					|| i == n && j != n) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
