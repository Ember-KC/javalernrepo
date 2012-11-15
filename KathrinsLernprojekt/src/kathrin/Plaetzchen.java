package kathrin;

public class Plaetzchen {
	String sorte;
	String groesse;
	String form;
	boolean verzierung;

	public Plaetzchen(String sorte, String groesse, String form,
			boolean verzierung) {
		this.sorte = sorte;
		this.groesse = groesse;
		this.form = form;
		this.verzierung = verzierung;
	}

	public void ausgeben() {
		String verz = "nein";
		if (verzierung) {
			verz = "ja";
		}
		System.out.println("Sorte: " + sorte + ", Groesse: " + groesse
				+ ", Form: " + form + ", Verzierung: " + verz);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plaetzchen plaetz1 = new Plaetzchen("Kokos", "mittel", "rund", true);
		plaetz1.ausgeben();

		Plaetzchen plaetz2 = new Plaetzchen("Affennuss", "klein", "rund", false);
		plaetz2.ausgeben();

		Plaetzchen plaetz3 = new Plaetzchen("Honigkuchen", "groﬂ",
				"rechteckig", false);
		plaetz3.ausgeben();

	}
}
