package kathrin;

import java.util.Scanner;

public class StandardabweichungBerechnen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int laengeZahlenreihe;
		int zaehler = 1;
		double zahl;
		double summe = 0;
		double summeQuadrat = 0;
		double durchschnitt2;
		double durchschnittQ;
		double standardabweichung;

		Scanner scan = new Scanner(System.in);
		System.out.println("Wieviele Zahlen hat Ihre Zahlenreihe?");
		laengeZahlenreihe = scan.nextInt();

		while (zaehler <= laengeZahlenreihe) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Bitte geben Sie die Zahl für Position "
					+ zaehler + " ein.");
			zahl = scan1.nextInt();
			summe = summe + zahl;
			summeQuadrat = summeQuadrat + zahl * zahl;
			zaehler = zaehler + 1;
		}
		durchschnitt2 = (summe / laengeZahlenreihe)
				* (summe / laengeZahlenreihe);
		durchschnittQ = summeQuadrat / laengeZahlenreihe;
		standardabweichung = Math.sqrt(durchschnittQ - durchschnitt2);

		System.out.println("Die Standardabweichung ist " + standardabweichung);
	}

}
