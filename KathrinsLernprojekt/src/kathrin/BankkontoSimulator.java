package kathrin;

public class BankkontoSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bankkonto neuesKonto = new Bankkonto("Kathrin", "1234567", 3500.00);

		System.out.println("Aktueller Kontostand: "
				+ neuesKonto.getKontostand());
		neuesKonto.geldEinzahlen(500.00);
		neuesKonto.geldAbheben(1000.00);
		neuesKonto.geldAbheben(4000.00);
		System.out.println("Aktueller Kontostand: "
				+ neuesKonto.getKontostand());

		// Konto darf negativen Kontostand haben bis -500 Euro
		// für jede Auszahlung wird Gebühr von 0,15 Euro fällig wenn Kontostand
		// < 1000 Euro
	}
}
