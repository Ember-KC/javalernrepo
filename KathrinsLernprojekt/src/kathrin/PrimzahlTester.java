package kathrin;

public class PrimzahlTester {

	/**
	 * prueft ob die uebergebene nichtnegative Zahl eine Primzahl ist wenn die
	 * uebergebene Zahl eine Primzahl ist, wir JA ausgegeben ansonsten NEIN
	 * 
	 * @param n
	 *            die zu testende nichtnegative Zahl
	 */
	public void istPrimzahl(long n) {

		final String NEIN = "NEIN";
		final String JA = "JA";
		// die Variable speichert, ob es sich um eine Primzahl handelt
		boolean prim = true;

		// Da 0 und 1 keine Primzahlen sind, werden sie von der Rechnung
		// ausgeschlossen
		if (n > 1) {

			// In der Schleife wird n jeweils durch eine fortlaufend dekremierte
			// Zahl geteilt, um zu prüfen, ob der Rest irgendwann 0 ergibt
			for (long j = n - 1; j > 1; j--) {

				if (n % j == 0) { // wenn es gleich 0 ist, ist es keine
					// Primzahl, da die Zahl nie durch 1
					// oder
					// durch sich selbst geteilt wird
					prim = false;
					break;

				}
				// wenn der Rest in der Schleife nie 0 ergibt, ist es eine
				// Primzahl
				else {
					prim = true;
				}
			}
		}
		// Primzahlenvariable für 0 und 1 wird auf false gesetzt
		else {
			prim = false;
		}
		// Ausgabe des Primzahlenstrings
		if (prim) {
			System.out.println(JA);

		} else {
			System.out.println(NEIN);
		}
	}

	public static void main(String[] args) {
		// Diese Variable können sie verändern um Ihre
		// Implementierung zu testen
		int x = 99680;
		// Der nachfolgende Quelltext erzeugt nur die Ausgabe
		System.out.print("Ist ");
		System.out.print(x);
		System.out.println(" eine Primzahl?");
		new PrimzahlTester().istPrimzahl(x);
	}

}