package kathrin;

import java.util.Scanner;

public class VersandkostenRechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int gewicht = 1;
		double versand = 3.00;
		double aufschlag = 0.25;
		int zusatzgewicht = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Sendungsgewicht in Pfund:");
		gewicht = scan.nextInt();
		scan.close();

		while (gewicht > 0) {
			if (gewicht <= 10) {
				System.out.println("Versandkosten: $" + versand);

			} else {
				zusatzgewicht = gewicht - 10;
				versand = versand + (zusatzgewicht * aufschlag);
				System.out.println("Versandkosten: $" + versand);

			}
			System.out.println("Sendungsgewicht in Pfund:");
			gewicht = scan.nextInt();
			versand = 3.00;
		}

		System.out.println("Schluss jetzt!");
	}

}
