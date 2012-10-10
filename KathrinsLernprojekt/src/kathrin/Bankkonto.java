package kathrin;

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

	private Bankkonto() {

	}

}
