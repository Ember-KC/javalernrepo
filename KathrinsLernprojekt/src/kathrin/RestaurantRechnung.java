package kathrin;

import java.util.Scanner;

class RestaurantRechnung {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grundbetrag;
		double trinkgeldProzent;

		System.out.print("Geben Sie den Grundbetrag ein: ");
		grundbetrag = scan.nextDouble();
		System.out.print("Geben Sie den Prozentsatz fuer das Trinkgeld ein: ");
		trinkgeldProzent = scan.nextDouble();

		System.out.println("Grundbetrag "
				+ grundbetrag
				+ " Gesamtkosten: "
				+ (grundbetrag + grundbetrag * 0.06 + grundbetrag
						* trinkgeldProzent));
	}
}