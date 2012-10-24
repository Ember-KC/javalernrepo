package kathrin;

public class WochentagBerechner {

	/**
	 * es wird der Wochentag zu einem gueltigen Datum bestimmt
	 * 
	 * @param tag
	 *            der Tag (0 < tag <= 31)
	 * @param monat
	 *            der Monat (0 < monat <= 12)
	 * @param jahr
	 *            die vierstellige Jahreszahl (z. B. 2009)
	 */
	public void berechneWochentag(int tag, int monat, int jahr) {

		if (monat == 1) {
			jahr = jahr - 1;
			monat = monat + 12;
		}

		else if (monat == 2) {
			jahr = jahr - 1;
			monat = monat + 12;

		}

		// Jahrhundert ermitteln
		String j = String.valueOf(jahr);
		String century = j.substring(0, 2);
		int c = Integer.parseInt(century);

		// letzten beiden Ziffern des Jahres ermitteln
		String yearLastDigits = j.substring(2, 4);
		int y = Integer.parseInt(yearLastDigits);

		// Datum berechnen

		int weekday = (tag + (26 * (monat + 1)) / 10 + (5 * y) / 4 + c / 4 + 5
				* c - 1) % 7;

		// Wochentagzahl auf String matchen

		switch (weekday) {
		case 0:
			System.out.println("Sonntag");
			break;
		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		}
	}

	public static void main(String[] args) {
		// Diese Variablen können sie verändern um Ihre
		// Implementierung zu testen
		int t = 25; // der Tag
		int m = 01; // der Monat
		int j = 2013; // das Jahr
		// Der nachfolgende Quelltext erzeugt nur die Ausgabe
		System.out.print("Der ");
		System.out.print(t);
		System.out.print(".");
		System.out.print(m);
		System.out.print(".");
		System.out.print(j);
		System.out.print(" ist ein ");
		new WochentagBerechner().berechneWochentag(t, m, j);
	}

}
