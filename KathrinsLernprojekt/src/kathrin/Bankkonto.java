package kathrin;

import java.util.Scanner;

class Bankkonto {

	String kontoinhaber;
	String kontonummer;
	double kontostand;

	Bankkonto(String ktoinhaber, String ktonummer, double ktostand) {
		kontoinhaber = ktoinhaber;
		kontonummer = ktonummer;
		kontostand = ktostand;

	}

	double geldAbheben(double abhebeBetrag) {
		double gebuehr = 0;
		if (kontostand - abhebeBetrag > -500) {
			gebuehr = berechneGebuehr(kontostand);
			kontostand = kontostand - abhebeBetrag;

		} else {
			System.out.println("Ihr Konto ist überzogen!");
		}
		return gebuehr;

	}

	double berechneGebuehr(double kontostand) {
		double gebuehr = 0;

		if (kontostand < 1000.00) {
			gebuehr = 0.15;
		}
		return gebuehr;

	}

	void geldEinzahlen(double einzahlungsBetrag) {
		kontostand = kontostand + einzahlungsBetrag;
	}

	double getKontostand() {

		return kontostand;

	}

	double getBetrag() {
		double betrag = 0.00;

		Scanner scanBetrag = new Scanner(System.in);
		betrag = scanBetrag.nextDouble();
		scanBetrag.close();
		return betrag;
	}

	private Bankkonto() {

	}

}
