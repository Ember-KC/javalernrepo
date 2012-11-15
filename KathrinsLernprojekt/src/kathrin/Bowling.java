package kathrin;

import java.util.Random;

public class Bowling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int gesamtpunkte = 0;
		int ergebnisWurf1 = 0;
		int ergebnisWurf2 = 0;
		int rundenpunkte = 0;

		int j = 0;

		int wurf1[] = new int[10];
		int wurf2[] = new int[10];
		int punkteRunde[] = new int[10];
		String strikeSpare[] = new String[10];

		for (int runde = 0; runde < 10; runde++) {
			System.out.println("Runde " + (runde + 1));
			// erster Wurf
			Random rand = new Random();
			ergebnisWurf1 = rand.nextInt(10) + 1;
			wurf1[runde] = ergebnisWurf1;

			if (ergebnisWurf1 == 10) {
				strikeSpare[runde] = "Strike";
				System.out.println("Strike!");
			}

			else {
				ergebnisWurf2 = rand.nextInt(10 - ergebnisWurf1) + 1;
				wurf2[runde] = ergebnisWurf2;

				// Verhalten des Programms bei einem Spare, d. h. 10 Pins bei
				// beiden Würfen -_> prüfen, ob der vorhergehende Wurf ein Spare
				// war
				if (ergebnisWurf1 + ergebnisWurf2 == 10) {
					strikeSpare[runde] = "Spare";
					System.out.println("Spare!");
				}
			}
			rundenpunkte = ergebnisWurf1 + ergebnisWurf2;
			// Prüfen, ob der vorhergehende Wurf ein Strike war
			if (runde > 1 && "Strike".equals(strikeSpare[runde - 1])) {
				punkteRunde[runde - 1] = punkteRunde[runde - 1]
						+ punkteRunde[runde];
			} else if (runde > 1 && "Spare".equals(strikeSpare[runde - 1])) {
				punkteRunde[runde - 1] = punkteRunde[runde - 1] + wurf1[runde];
			}
			// Rundenergebnis ausgeben und Rundenpunkte zu Gesamtpunkten
			// addieren

			punkteRunde[runde] = rundenpunkte;
			System.out.println("Ergebnis der Runde " + (runde + 1) + ": "
					+ rundenpunkte);
			// Runde hochzählen

		}
		while (j < 10) {
			gesamtpunkte = gesamtpunkte + punkteRunde[j];
			j++;

		}
		System.out.println("Gesamtpunktzahl: " + gesamtpunkte);

	}
}
