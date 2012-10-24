package kathrin;

import java.util.Scanner;

public class BuchstabenZaehlen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anzahlBuchstaben;
		String wort;
		int zaehler = 1;

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie ein beliebiges Wort ein.");
		wort = scan.nextLine();
		anzahlBuchstaben = wort.length();

		while (zaehler <= anzahlBuchstaben) {
			System.out.println(wort);
			zaehler = zaehler + 1;
		}

	}

}
