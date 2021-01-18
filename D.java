package jan18_alphabet_pattern;

public class D {

	public void display(int n, int i) {
		// int n = 10;
		// for(int i=1; i<=n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i == 1 && j != n || j == 1 || i == n && j != n || j == n && i != 1 && i != n) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
