package jan18_alphabet_pattern;

import java.util.*;

public class AlphabetPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		go(scanner); // start the program

		scanner.close();
	}

	private static void go(Scanner scanner) {
		// get font size from user
		System.out.println("Please provide a font size:");
		System.out.println("(Allowed values of 10 to 30)");
		int n = inputFontSize(scanner);

		// get name from user
		char[] nameChar = inputName(scanner);

		// display user's name
		displayName(n, nameChar);

		repeatOrQuit(scanner);
	}

	private static void repeatOrQuit(Scanner scanner) {

		// repeat?
		System.out.println("Enter '0' to quit,");
		System.out.println("else enter any other key to try again.");
		String restart = scanner.nextLine();

		switch (restart.charAt(0)) {
		// 0 = program ends
		case '0':
			System.out.println("Program terminated.");
			break;
		// other keys - repeat program
		default:
			go(scanner);
		}
	}

	private static char[] inputName(Scanner scanner) {

		// name input
		System.out.println("What is your name?");
		String name = scanner.nextLine();

		name = name.toUpperCase();
		char[] nameChar = name.toCharArray();

		return nameChar;
	}

	private static int inputFontSize(Scanner scanner) {
		int n = 10;

		try {

			// font size input
			n = scanner.nextInt();

			// skipping one scanner line
			scanner.nextLine();

		} catch (Exception e) {
			System.out.println("Invalid response.");
			System.out.println("Please provide an integer from 10 to 30: ");

			// skipping one scanner line
			scanner.nextLine();

			// if fail, get input again
			n = inputFontSize(scanner);
		}

		// if not within range, reject and get input again
		if (n < 10 || n > 30) {
			System.out.println("Invalid response.");
			System.out.println("Please provide an integer from 10 to 30: ");
			n = inputFontSize(scanner);

			// if n is odd, make it even
		} else if (n % 2 != 0) {
			n -= 1;
		}

		return n;
	}

	private static void displayName(int size, char[] name) {

		// line break between display and other text
		System.out.println();

		// i block
		for (int i = 1; i <= size; i++) {

			// iterating through char[]
			for (int a = 0; a < name.length; a++) {
				char current = name[a];

				// instantiating
				A a1 = new A();
				B b1 = new B();
				C c1 = new C();
				D d1 = new D();
				E e1 = new E();
				F f1 = new F();
				G g1 = new G();
				H h1 = new H();
				I i1 = new I();
				J j1 = new J();
				K k1 = new K();
				L l1 = new L();
				M m1 = new M();
				N n1 = new N();
				O o1 = new O();
				P p1 = new P();
				Q q1 = new Q();
				R r1 = new R();
				S s1 = new S();
				T t1 = new T();
				U u1 = new U();
				V v1 = new V();
				W w1 = new W();
				X x1 = new X();
				Y y1 = new Y();
				Z z1 = new Z();

				// alphabet patterns
				switch (current) {
				case 'A':
					a1.display(size, i);
					break;
				case 'B':
					b1.display(size, i);
					break;
				case 'C':
					c1.display(size, i);
					break;
				case 'D':
					d1.display(size, i);
					break;
				case 'E':
					e1.display(size, i);
					break;
				case 'F':
					f1.display(size, i);
					break;
				case 'G':
					g1.display(size, i);
					break;
				case 'H':
					h1.display(size, i);
					break;
				case 'I':
					i1.display(size, i);
					break;
				case 'J':
					j1.display(size, i);
					break;
				case 'K':
					k1.display(size, i);
					break;
				case 'L':
					l1.display(size, i);
					break;
				case 'M':
					m1.display(size, i);
					break;
				case 'N':
					n1.display(size, i);
					break;
				case 'O':
					o1.display(size, i);
					break;
				case 'P':
					p1.display(size, i);
					break;
				case 'Q':
					q1.display(size, i);
					break;
				case 'R':
					r1.display(size, i);
					break;
				case 'S':
					s1.display(size, i);
					break;
				case 'T':
					t1.display(size, i);
					break;
				case 'U':
					u1.display(size, i);
					break;
				case 'V':
					v1.display(size, i);
					break;
				case 'W':
					w1.display(size, i);
					break;
				case 'X':
					x1.display(size, i);
					break;
				case 'Y':
					y1.display(size, i);
					break;
				case 'Z':
					z1.display(size, i);
					break;

				// space
				case ' ':
					for (int j = 1; j <= size; j++) {
						System.out.print(" ");
					}
					break;

				// skip special characters
				default:
					break;
				}

				// additional spacing between each char
				System.out.print(" ");
			}

			// line break to next i value
			System.out.println();
		}

		// line break between display and other text
		System.out.println();
	}

}
