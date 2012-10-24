package kathrin;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTaxTotal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double TAXRATE = 0.05;
		double netAmount;
		double taxAmount;

		Scanner scan = new Scanner(System.in);
		System.out
				.println("Bitte geben Sie den Preis des Kleidungsstücks ein.");
		netAmount = scan.nextDouble();

		if (netAmount >= 100) {
			taxAmount = netAmount * TAXRATE;

		} else {
			taxAmount = 0;
		}

		double grossAmount = netAmount + taxAmount;

		DecimalFormat taxFormat = new DecimalFormat("0.00");
		String taxString = taxFormat.format(taxAmount);

		DecimalFormat grossFormat = new DecimalFormat("0.00");
		String grossString = grossFormat.format(grossAmount);

		System.out.println("Die Steuer beträgt " + taxString + " Dollar.");
		System.out.println("Der Gesamtpreis ist " + grossString + " Dollar.");

	}

}
