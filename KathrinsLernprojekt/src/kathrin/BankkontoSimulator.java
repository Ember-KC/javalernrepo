package kathrin;

import java.util.Scanner;

public class BankkontoSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bankkonto neuesKonto = new Bankkonto("Kathrin", "1234567", 3500.00);

		Scanner scan = new Scanner(System.in);
		String aktion = "A";
		while (!aktion.equalsIgnoreCase("Esc")) {

			System.out.println("Bitte wählen Sie die gewünschte Aktion!\n"
					+ "(K für Kontostand ausgeben, E für Einzahlung tätigen, "
					+ "A für Abhebung tätigen, Esc für Abbruch)");

			aktion = scan.nextLine();
			if (aktion.equalsIgnoreCase("A")) {
				System.out
						.println("Geben Sie den gewünschten Auszahlungsbetrag ein!");
				double betrag = scan.nextDouble();
				neuesKonto.geldAbheben(betrag);

			} else if (aktion.equalsIgnoreCase("E")) {
				System.out
						.println("Geben Sie den gewünschten Einzahlungsbetrag ein!");
				double betrag = scan.nextDouble();
				neuesKonto.geldEinzahlen(betrag);

			} else if (aktion.equalsIgnoreCase("K")) {
				System.out.println("Geben Sie ein!");
			}

			else if (aktion.equalsIgnoreCase("Esc")) {
				break;
			}

			// TODO: der Einzahlungsbetrag wird der Variablen aktion zugewiesen,
			// dadurch kommt es nach Auszahlungsn zu fehlerhaften Ausgaben
			else {
				System.out.println("Bitte geben Sie eine gültige Aktion ein!");
			}
			System.out.println("Aktueller Kontostand: "
					+ neuesKonto.getKontostand());
		}
		scan.close();

	}
}
