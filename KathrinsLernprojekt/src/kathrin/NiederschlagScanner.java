package kathrin;

import java.util.Scanner;

public class NiederschlagScanner {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double april, mai, juni;
		System.out.println("Bitte geben Sie den Niederschlag für April ein.");
		april = scan.nextDouble();
		System.out.println("Bitte geben Sie den Niederschlag für Mai ein.");
		mai = scan.nextDouble();
		System.out.println("Bitte geben Sie den Niederschlag für Juni ein.");
		juni = scan.nextDouble();
		double[] monatsliste = { april, mai, juni };

		calculateAverage(monatsliste);

	}

	public static void calculateAverage(double[] monatsliste) {
		double averageNiederschlag = 0.0;
		int anzahlMonate = monatsliste.length;
		for (int i = 0; i < anzahlMonate; i++) {
			averageNiederschlag = averageNiederschlag + monatsliste[i];
		}

		System.out.println("Durchschnitt: " + averageNiederschlag
				/ anzahlMonate);
	}
}
