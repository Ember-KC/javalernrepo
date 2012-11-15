package kathrin;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FakultaetRechnen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int zaehler = 1;
		int fakultaet;
		long ergebnis = 1;

		Scanner scan = new Scanner(System.in);
		System.out
				.println("Bitte geben Sie eine Zahl ein, für die sie die Fakultät berechnen lassen wollen.");
		fakultaet = scan.nextInt();

		if (fakultaet <= 20) {

			while (zaehler <= fakultaet) {
				ergebnis = ergebnis * zaehler;
				zaehler = zaehler + 1;

			}
			NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
			String ergebnisString = nf.format(ergebnis);
			System.out.println("Das Ergebnis ist " + ergebnisString);

		} else {
			System.out
					.println("Bitte eine Zahl eingeben, die kleiner als 20 ist - sonst dauert es zu lang. ;)");

		}

	}

}
