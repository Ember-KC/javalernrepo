package kathrin;

import java.util.Random;

public class Bowling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int runde = 1;
		int gesamtpunkte = 0;
		int rundenpunkte = 0;

		while (runde <= 10) {
			System.out.println("Runde " + runde);
			// erster Wurf
			Random rand = new Random();
			rundenpunkte = rand.nextInt(10) + 1;

			// zweiter Wurf
			if (rundenpunkte < 10) {
				rundenpunkte = rundenpunkte + rand.nextInt(10 - rundenpunkte)
						+ 1;
			}
			// Rundenergebnis ausgeben und Rundenpunkte zu Gesamtpunkten
			// addieren
			System.out.println("Ergebnis der Runde " + runde + ": "
					+ rundenpunkte);
			gesamtpunkte = gesamtpunkte + rundenpunkte;

			// Runde hochzählen
			runde = runde + 1;
		}
		System.out.println("Gesamtpunktzahl: " + gesamtpunkte);

	}
}
