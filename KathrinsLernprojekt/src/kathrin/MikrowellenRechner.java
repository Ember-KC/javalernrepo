package kathrin;

import java.util.Scanner;

public class MikrowellenRechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anzahlPosten, erhitzungszeitPosten;
		double erhitzungszeit = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Wieviele Posten wollen Sie erhitzen?");
		anzahlPosten = scan.nextInt();

		System.out.println("Wie ist die Erhitzungszeit pro Posten?");
		erhitzungszeitPosten = scan.nextInt();

		erhitzungszeit = berechneErhitzungszeit(anzahlPosten,
				erhitzungszeitPosten);

		System.out.println("Die Erhitzungszeit ist " + erhitzungszeit
				+ " Sekunden.");
	}

	public static double berechneErhitzungszeit(int anzahlPosten,
			int erhitzungszeitPosten) {
		double erhitzungszeit = 0.0;
		if (anzahlPosten == 1) {
			erhitzungszeit = erhitzungszeitPosten;
		} else if (anzahlPosten == 2) {
			erhitzungszeit = erhitzungszeitPosten * 1.5;

		} else if (anzahlPosten == 3) {
			erhitzungszeit = erhitzungszeitPosten * 2;

		} else if (anzahlPosten > 3) {

			System.out.println("Nicht mehr als drei Stücke erhitzen!");

		} else {
			System.out.println("Bitte tun Sie etwas in die Mikrowelle!");
		}
		return erhitzungszeit;

	}

}
