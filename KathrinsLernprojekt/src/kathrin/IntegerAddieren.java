package kathrin;

import java.util.Random;
import java.util.Scanner;

public class IntegerAddieren {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int summe = 0;
		int zahl = 0;
		String antwort = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Eingabeaufforderung <ja> oder <nein>?");
		antwort = scan.nextLine();

		if (antwort.equalsIgnoreCase("ja")) {

			for (int i = 1; i < 6; i++) {
				System.out.println("Geben Sie die " + i + ". Zahl ein.");
				zahl = scan.nextInt();
				summe = summe + zahl;
			}
		}

		else {
			for (int i = 1; i < 6; i++) {

				Random rand = new Random();
				zahl = rand.nextInt(9) + 1;
				System.out.println(zahl);
				summe = summe + zahl;
			}

		}
		System.out.println("Gesamtsumme: " + summe);

		scan.close();
	}
}
