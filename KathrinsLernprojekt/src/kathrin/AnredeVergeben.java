package kathrin;

import java.util.Scanner;

public class AnredeVergeben {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String name = "test";

		while (!name.equals("")) {
			System.out.println("Bitte geben Sie Ihren Namen ein.");
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();

			if (name.startsWith("Amy") || name.startsWith("Buffy")
					|| name.startsWith("Cathy")) {
				System.out.println("Mrs. " + name);
			} else if (name.startsWith("Elroy") || name.startsWith("Fred")
					|| name.startsWith("Graham")) {
				System.out.println("Mr. " + name);
			} else {
				System.out.println(name);

			}

		}
	}
}
