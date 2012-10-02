package kathrin;

import java.util.Scanner;

public class AnredeVergeben {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Bitte geben Sie Ihren Namen ein.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		if (name.startsWith("Amy") || name.startsWith("Buffy")
				|| name.startsWith("Cathy")) {
			System.out.println("Mrs. " + name);
		} else {
			System.out.println("Mr. " + name);
		}
	}
}
