package kathrin;

import java.util.Scanner;

class VorratskammerTester {
	public static void main(String[] args) {
		Marmelade glasAusgewaehlt = null;
		int menge = 0;

		Marmelade stachelbeer = new Marmelade("Stachelbeer", "04.07.09", 12);
		Marmelade erdbeer = new Marmelade("Erdbeer", "30.09.10", 8);
		Marmelade aprikosen = new Marmelade("Aprikosen", "31.10.10", 3);

		Vorratskammer vorrat = new Vorratskammer(stachelbeer, erdbeer,
				aprikosen);
		vorrat.ausgeben();

		vorrat.auswaehlen();
		vorrat.auftragen(menge, glasAusgewaehlt);
		vorrat.ausgeben();

		vorrat.auswaehlen();
		vorrat.auftragen(menge, glasAusgewaehlt);
		vorrat.ausgeben();
	}
}

class Marmelade {
	// Instanzvariablen
	private String inhalt; // Art der Frucht im Glas
	private String datum; // Datum des Abfüllens
	private int menge; // Menge der Marmelade im Glas

	// Konstruktor
	public Marmelade(String inhalt, String datum, int menge) {
		this.inhalt = inhalt;
		this.datum = datum;
		this.menge = menge;
	}

	// Methoden
	public boolean istLeer() {
		return (menge == 0);
	}

	public void ausgeben() {
		System.out.println(inhalt + "   " + datum + "   " + menge + " Unzen.");
	}

	public void auftragen(int unzen, Marmelade glasMarmelade) {
		if (!istLeer()) {
			if (unzen <= menge) {
				System.out.println("Auftragen von " + unzen + " Unzen "
						+ inhalt);
				menge = menge - unzen;
			} else {
				System.out.println("Auftragen von  " + menge + " Unzen "
						+ inhalt);
				menge = 0;
			}
		} else
			System.out.println("Keine Marmelade im Glas!");
	}

}

class Vorratskammer {
	// Instanzvariablen
	private Marmelade glas1;
	private Marmelade glas2;
	private Marmelade glas3;
	private Marmelade glasAusgewaehlt;

	// Konstruktor
	public Vorratskammer(Marmelade glas1, Marmelade glas2, Marmelade glas3) {
		this.glas1 = glas1;
		this.glas2 = glas2;
		this.glas3 = glas3;
		glasAusgewaehlt = null;
	}

	// Methoden
	public void ausgeben() {
		System.out.println("Die Vorratskammer enthält:");
		System.out.print("1: ");
		glas1.ausgeben();
		System.out.print("2: ");
		glas2.ausgeben();
		System.out.print("3: ");
		glas3.ausgeben();
	}

	// wir setzen voraus, dass der Anwender eine richtige Auswahl trifft, 1, 2,
	// oder 3
	public Marmelade auswaehlen() {
		System.out.println("Bitte treffen Sie ihre Auswahl!");
		Scanner scan = new Scanner(System.in);
		int glasNummer = scan.nextInt();
		scan.close();
		if (glasNummer == 1)
			glasAusgewaehlt = glas1;

		else if (glasNummer == 2)
			glasAusgewaehlt = glas2;

		else
			glasAusgewaehlt = glas3;

		return glasAusgewaehlt;

	}

	// Auftragen der ausgewählten Marmelade
	public void auftragen(int unzen, Marmelade marm) {
		glasAusgewaehlt.auftragen(unzen, marm);
	}
}
