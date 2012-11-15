package kathrin;

import java.util.Scanner;

public class BobsDiscount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int SCHRAUBENPREIS = 5;
		final int MUTTERNPREIS = 3;
		final int UNTERLEGSCHEIBENPREIS = 1;
		int anzahlSchrauben;
		int anzahlMuttern;
		int anzahlUnterlegscheiben;
		double centTotal;
		double euroTotal;

		Scanner scan = new Scanner(System.in);

		// User nach Anzahl Schrauben fragen
		System.out.println("Bitte Anzahl der Schrauben eingeben.");
		anzahlSchrauben = scan.nextInt();

		// User nach Anzahl Muttern fragen
		System.out.println("Bitte Anzahl der Muttern eingeben.");
		anzahlMuttern = scan.nextInt();

		// User nach Anzahl Unterlegscheiben fragen
		System.out.println("Bitte Anzahl der Unterlegscheiben eingeben.");
		anzahlUnterlegscheiben = scan.nextInt();

		// Prüfen, ob Anzahl Schrauben und Muttern identisch ist
		if (anzahlSchrauben == anzahlMuttern) {
			System.out.println("Die Bestellung ist okay.");

		} else {
			System.out.println("Bitte prüfen Sie Ihre Bestellung.");
		}

		// Gesamtbetrag ausgeben
		centTotal = anzahlMuttern * MUTTERNPREIS + anzahlSchrauben
				* SCHRAUBENPREIS + anzahlUnterlegscheiben
				* UNTERLEGSCHEIBENPREIS;
		euroTotal = centTotal / 100;
		System.out.println("Gesamtbetrag: " + euroTotal + " Euro");

	}
}
