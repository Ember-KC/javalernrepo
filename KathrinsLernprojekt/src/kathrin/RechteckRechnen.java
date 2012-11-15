package kathrin;

import java.util.Scanner;

public class RechteckRechnen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ersterX = -1;
		int ersterY = -1;
		int zweiterX = -1;
		int zweiterY = -1;
		int hoehe = 1;
		int breite = 1;
		int flaeche = 0;

		while (breite != 0 && hoehe != 0) {

			ersterX = -1;
			ersterY = -1;
			zweiterX = -1;
			zweiterY = -1;
			hoehe = 1;
			breite = 1;
			flaeche = 0;

			ersterX = scanNumber("X", "Erster");

			ersterY = scanNumber("Y", "Erster");

			zweiterX = scanNumber("X", "Zweiter");

			zweiterY = scanNumber("Y", "Zweiter");

			breite = Math.abs(zweiterX - ersterX);
			hoehe = Math.abs(zweiterY - ersterY);

			flaeche = breite * hoehe;
			System.out.println("Breite: " + breite + " , Hoehe; " + hoehe
					+ " , Fläche: " + flaeche);
		}
		System.out
				.println("Das ist kein Rechteck!!! Und negative Werte sind nicht erlaubt!!!");

	}

	private static int scanNumber(final String axis, final String zahl) {
		int retCoord = -1;
		while (retCoord < 0) {
			Scanner scan = new Scanner(System.in);

			System.out.println(zahl + " Eckpunkt " + axis + "-Koordinate");
			retCoord = scan.nextInt();
			if (retCoord < 0) {
				System.out.println("Bitte einen positiven Wert eingeben!");
			}
		}

		return retCoord;
	}

}
