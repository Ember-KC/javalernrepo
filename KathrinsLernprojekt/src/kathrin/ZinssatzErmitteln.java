package kathrin;

public class ZinssatzErmitteln {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double dollars = 1000.00;
		double zinssatz = 0.01;
		int LAUFZEIT = 40;

		zinssatz = berechneZinssatz(dollars, LAUFZEIT, zinssatz);
		System.out.println("Nach 40 Jahren bei einem Zinssatz von " + zinssatz
				* 100 + "Prozent sind Sie Millionär!");
	}

	public static double berechneZinssatz(double dollars1, int LAUFZEIT1,
			double zinssatz) {

		while (dollars1 < 1000000) {
			int i = 0;
			dollars1 = 1000.00;
			zinssatz = zinssatz + 0.01;
			System.out.println(zinssatz + " - " + dollars1);

			while (i < LAUFZEIT1) {
				dollars1 = dollars1 + dollars1 * zinssatz;
				i++;
				System.out.println(dollars1);
			}
		}
		return zinssatz;

	}

}
