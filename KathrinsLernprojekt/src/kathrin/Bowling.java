package kathrin;

import java.util.Random;

public class Bowling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int runde = 1;
		int gesamtpunkte = 0;
		int ergebnisWurf1 = 0;
		int ergebnisWurf2 = 0;
		int rundenpunkte = 0;
		int i = 0;

		int wurf1[] = new int[10];
		int wurf2[] = new int[10];
		int punkteRunde[] = new int[10];
		int strikeSpare[] = new int[10];

		while (runde <= 10) {
			System.out.println("Runde " + runde);
			// erster Wurf
			Random rand = new Random();
			ergebnisWurf1 = rand.nextInt(10) + 1;
			wurf1[i] = ergebnisWurf1;
			strikeSpare[i] = 1;

			// zweiter Wurf
			if (ergebnisWurf1 < 10) {
				ergebnisWurf2 = rand.nextInt(10 - ergebnisWurf1) + 1;
				wurf2[i] = ergebnisWurf2;

				// Verhalten des Programms bei einem Spare, d. h. 10 Pins bei
				// beiden
				// Würfen
				if (ergebnisWurf1 + ergebnisWurf2 == 10) {
					strikeSpare[i] = 2;
				}
			}
			// Verhalten des Programms bei einem Strike, d. h. 10 Pins bei einem
			// Wurf
			else {

			}
			// Rundenergebnis ausgeben und Rundenpunkte zu Gesamtpunkten
			// addieren
			rundenpunkte = ergebnisWurf1 + ergebnisWurf2;
			punkteRunde[i] = rundenpunkte;
			System.out.println("Ergebnis der Runde " + runde + ": "
					+ rundenpunkte);
			gesamtpunkte = gesamtpunkte + rundenpunkte;

			// Runde hochzählen
			runde = runde + 1;
			i++;
		}
		System.out.println("Gesamtpunktzahl: " + gesamtpunkte);

	}
}
