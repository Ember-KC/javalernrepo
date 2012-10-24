package kathrin;

import java.util.Scanner;

class Auto {
	double startMeilen;
	double endMeilen;
	double gallonen;

	Auto(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;

	}

	double berechneMPG() {
		double meilenGallone = endMeilen - startMeilen / gallonen;
		return Math.floor(meilenGallone);
	}

	String autobewertung(double meilenGallone) {
		String returnvalue = "";
		if (meilenGallone < 15.0) {
			returnvalue = "Sparauto!";

		} else if (meilenGallone > 30.0) {
			returnvalue = "Spritschleuder!";

		}
		return returnvalue;

	}
}

public class MeilenGalloneExtended {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double startMeilen;
		double endMeilen;
		double gallonen;

		System.out.println("Geben Sie den Anfangsmeilenstand ein!");
		Scanner scan = new Scanner(System.in);
		startMeilen = scan.nextDouble();

		System.out.println("Geben Sie den Endmeilenstand ein!");
		endMeilen = scan.nextDouble();

		System.out.println("Geben Sie die Gallonen ein!");
		gallonen = scan.nextDouble();

		scan.close();

		Auto auto = new Auto(startMeilen, endMeilen, gallonen);
		System.out.println("Meilen pro Gallone: " + auto.berechneMPG());
		System.out.println(auto.autobewertung(auto.berechneMPG()));

	}
}
