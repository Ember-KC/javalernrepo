package kathrin;

import java.util.Scanner;

public class QuadratwurzelSchaetzen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double FASTNULL = 1.0E-14;
		double n = 0;
		double alteSchaetzung = 0;
		double neueSchaetzung = 0;

		Scanner scan = new Scanner(System.in);
		System.out
				.println("Geben Sie die Zahl für die Sie die Quadratwurzel schätzen wollen ein.");
		n = scan.nextDouble();
		if (n >= 0) {
			System.out.println("Geben Sie Ihre erste Schätzung ein.");
			alteSchaetzung = scan.nextDouble();

			while (Math.abs(n / (neueSchaetzung * neueSchaetzung) - 1.0) > FASTNULL)

			{

				neueSchaetzung = n / (2 * alteSchaetzung) + alteSchaetzung / 2;
				alteSchaetzung = neueSchaetzung;
				System.out.println(neueSchaetzung);
			}
			System.out.println("Die Quadratwurzel von " + n + " ist "
					+ neueSchaetzung);

		} else {
			System.out.println("Bitte geben Sie eine positive Zahl ein!");
		}

	}

}
