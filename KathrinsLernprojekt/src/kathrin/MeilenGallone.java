package kathrin;

import java.util.Scanner;

public class MeilenGallone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double anfangsmeilen = 0;
		double endmeilen = 0;
		double gallonen = 0;
		double result = 0;

		// Anfangskilometerstand eingeben

		Scanner scan = new Scanner(System.in);
		System.out.println("Anfangsstand Meilen:");
		anfangsmeilen = scan.nextDouble();

		// Prüfen, ob Anfangskilometer negativ sind
		while (anfangsmeilen >= 0) {

			// Endkilometerstand eingeben

			System.out.println("Endstand Meilen:");
			endmeilen = scan.nextDouble();

			// Gallonen eingeben

			System.out.println("Gallonen:");
			gallonen = scan.nextDouble();

			result = (endmeilen - anfangsmeilen) / gallonen;
			System.out.println("Meilen pro Gallone: " + result);

			System.out.println("Anfangsstand Meilen:");
			anfangsmeilen = scan.nextDouble();

		}

		System.out.println("Vielen Dank!");

		// Anfangskilometerstand eingeben

		// Ermitteln, wieviele Meilen gefahren wurden

		// Meilen durch Gallonen teilen

	}

}
