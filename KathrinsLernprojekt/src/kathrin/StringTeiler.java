package kathrin;

import java.util.Scanner;

public class StringTeiler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;

		System.out.println("Bitte geben Sie ein Wort ein.");
		Scanner scan = new Scanner(System.in);
		String wort = scan.nextLine();
		System.out.println(wort.length());

		do {
			System.out.println((wort.charAt(i)) + "\n");
			i = i + 1;
		} while (i < wort.length());

	}
}
