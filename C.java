package jan18_alphabet_pattern;

public class C {

	public void display(int n, int i) {
		// int n = 10;
		// for(int i=1; i<=n; i++) {
		for (int j = 1; j <= n; j++) {
			if (i == 1 && j != 1 || j == 1 && i != 1 && i != n || i == n && j != 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		//System.out.println();
		// }
	}
}
