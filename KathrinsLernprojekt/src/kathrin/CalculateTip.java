package kathrin;

import java.util.Scanner;

public class CalculateTip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Kosten für Essen eingeben
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Kosten für das Essen ein:");
		double costsMeal = scan.nextDouble();
		// Prozentsatz für Trinkgeld eingeben
		System.out
				.println("Bitte geben Sie den Prozentsatz für das Trinkgeld ein:");

		double percentTip = scan.nextDouble();
		// Essenskosten mit Trinkgeld und Steuer multiplizieren
		double totalCosts = costsMeal + costsMeal * percentTip + costsMeal
				* 0.06;
		System.out.println("Der Gesamtbetrag ist " + totalCosts);

	}

}
