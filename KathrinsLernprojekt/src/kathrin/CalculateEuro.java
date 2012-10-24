package kathrin;

import java.util.Scanner;

public class CalculateEuro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int centBetrag, dollarBetrag, restCentBetrag;

		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte gib einen Centbetrag ein.");
		centBetrag = scan.nextInt();

		dollarBetrag = centBetrag / 100;
		restCentBetrag = centBetrag % 100;
		String dollarString = "";

		if (dollarBetrag > 0) {
			dollarString = dollarBetrag + " Dollar und ";
		}

		System.out.println("Das ergibt " + dollarString + restCentBetrag
				+ " Cent.");

	}
}
