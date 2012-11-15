package kathrin;

import java.util.Scanner;

public class PrimzahlenAusgeben {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxNumber = 2000;
		Scanner scan = new Scanner(System.in);
		System.out.println("Möchten Sie Primzahlen bis " + maxNumber
				+ " anzeigen lassen? (J/N)");
		String answer = scan.nextLine();
		if (answer.equals("J")) {

			long start = System.currentTimeMillis();

			for (int i = 0; i <= maxNumber; i++) { // i ist die Zahl, die
													// geteilt wird
				boolean prim = true;
				for (int j = 2; j < i; j++) { // j ist die Zahl, durch die
												// geteilt
												// wird
					if (i % j == 0) { // wenn es gleich 0 ist, ist es keine
										// Primzahl, da die Zahl nie durch 1
										// oder
										// durch sich selbst geteilt wird
						prim = false;
						break;

					}
				}
				if (prim) {
					System.out.println(i);
				}

			}

			long end = System.currentTimeMillis();

			System.out.println("Dauer: " + (end - start));
		} else
			System.out.println("Dann eben nicht!");
	}

}
