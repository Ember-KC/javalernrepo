package kathrin;

import java.util.Random;
import java.util.Scanner;

public class WuerfelSpiel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ergebnisComputer = 0;
		int ergebnisSpieler = 0;
		int computerGewonnen = 0;
		int spielerGewonnen = 0;

		while (computerGewonnen < 5 || spielerGewonnen < 5) {

			Random rand = new Random();
			ergebnisComputer = (rand.nextInt(6) + 1 + rand.nextInt(6) + 1);
			System.out.println("Der Computer wirft " + ergebnisComputer);
			Scanner scan = new Scanner(System.in);
			System.out
					.println("Wenn Sie einen 11-seitigen Würfel wollen, drücken Sie bitte \"1\". "
							+ "Wenn Sie zwei 6-seitige Würfel wollen, drücken Sie bitte \"2\".");
			int auswahl = scan.nextInt();

			if (auswahl == 1) {
				ergebnisSpieler = (rand.nextInt(11) + 1);
				System.out.println("Sie werfen " + ergebnisSpieler + ".");

			} else {
				ergebnisSpieler = (rand.nextInt(6) + 1 + rand.nextInt(6) + 1);
				System.out.println("Sie werfen " + ergebnisSpieler + ".");

			}

			if (ergebnisComputer > ergebnisSpieler) {
				computerGewonnen = computerGewonnen + 1;
				System.out.println("Der Computer hat die Runde gewonnen.");

			}

			else {
				spielerGewonnen = spielerGewonnen + 1;
				System.out.println("Sie haben die Runde gewonnen.");
			}

		}
		if (computerGewonnen > spielerGewonnen) {
			System.out.println("Der Computer hat das Spiel gewonnen!");
		} else {
			System.out.println("Sie haben das Spiel gewonnen!");
		}

	}
}
