package kathrin;

import java.util.Scanner;

public class ReifendruckMessen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int druckHintenLinks;
		int druckHintenRechts;
		int druckVorneLinks;
		int druckVorneRechts;
		boolean druckOk = true;

		Scanner scan = new Scanner(System.in);
		System.out.println("Reifendruck hinten links eingeben: ");
		druckHintenLinks = scan.nextInt();
		druckOk = reifendruckBereich(druckHintenLinks, druckOk);

		System.out.println("Reifendruck hinten rechts eingeben: ");
		druckHintenRechts = scan.nextInt();
		druckOk = reifendruckBereich(druckHintenRechts, druckOk);

		System.out.println("Reifendruck vorne links eingeben: ");
		druckVorneLinks = scan.nextInt();
		druckOk = reifendruckBereich(druckVorneLinks, druckOk);

		System.out.println("Reifendruck vorne rechts eingeben: ");
		druckVorneRechts = scan.nextInt();
		druckOk = reifendruckBereich(druckVorneRechts, druckOk);

		druckOk = reifendruckVergleichen(druckHintenLinks, druckHintenRechts,
				druckVorneLinks, druckVorneRechts, druckOk);

		if (!druckOk) {
			System.out.println("Der Druck Ihrer Reifen ist nicht in Ordnung.");
		} else {
			System.out.println("Der Reifendruck ist in Ordnung.");
		}

	}

	public static boolean reifendruckBereich(int reifendruck, boolean druckOk) {
		if (reifendruck < 35 || reifendruck > 45) {
			druckOk = false;
			System.out
					.println("Der Druck dieses Reifens liegt auﬂerhalb des empfohlenen Bereichs.");
		}
		return druckOk;
	}

	public static boolean reifendruckVergleichen(int druckHintenLinks,
			int druckHintenRechts, int druckVorneLinks, int druckVorneRechts,
			boolean druckOk) {
		
		int abweichungHinten = druckHintenLinks - druckHintenRechts;
		int abweichungVorne = druckVorneLinks - druckVorneRechts;
		
		if (abweichungHinten <= 3 && abweichungHinten >= -3
				&& abweichungVorne <= 3 && abweichungVorne >= -3
				&& druckOk == true) {
			druckOk = true;
		} else {
			druckOk = false;
		}

		return druckOk;
	}

}
