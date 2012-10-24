package kathrin;

public class Niederschlag {
	public static void main(String[] args) {

		double[] monatsliste = { 12.0, 14.0, 8.0, 5.0, 6.7, 8.4 };

		calculateAverage(monatsliste);

		double[] monatsliste1 = { 12.0, 14.0, 8.7, 5.0 };

		calculateAverage(monatsliste1);

		double[] monatsliste2 = { 12.0, 14.99765456 };

		calculateAverage(monatsliste2);

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
