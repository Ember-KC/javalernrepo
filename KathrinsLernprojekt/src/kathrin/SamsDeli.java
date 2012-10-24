package kathrin;

import java.util.Scanner;

public class SamsDeli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nameArtikel, expressOption;
		double preisArtikel = 0.0, versandKosten = 0.0, gesamtKosten = 0.0;
		final double REDVERSAND = 2.00, VOLLVERSAND = 3.00, EXPRESS = 5.00;

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Name des gewünschten Artikels eingeben: ");
		nameArtikel = scan.nextLine();

		System.out.println("Bitte Preis des Artikels eingeben: ");
		preisArtikel = scan.nextDouble();

		scan = new Scanner(System.in);
		System.out.println("Möchten Sie Express-Versand? (J / N) ");
		expressOption = scan.nextLine();

		if (preisArtikel < 10.00) {
			if ("J".equals(expressOption)) {
				gesamtKosten = preisArtikel + REDVERSAND + EXPRESS;
				versandKosten = REDVERSAND + EXPRESS;
			} else {
				gesamtKosten = preisArtikel + REDVERSAND;
				versandKosten = REDVERSAND;
			}

		} else {
			gesamtKosten = preisArtikel + VOLLVERSAND;

		}
		System.out.println("Rechnung");
		System.out.println(nameArtikel + " : " + preisArtikel);
		System.out.println("Versand: " + versandKosten);
		System.out.println("Gesamtpreis: " + gesamtKosten);

	}

}
