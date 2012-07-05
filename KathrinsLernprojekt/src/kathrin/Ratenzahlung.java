package kathrin;

import java.util.Scanner;

public class Ratenzahlung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double zinssatz = 0;
		double monatsrate = 0;
		double saldo = 0;
		double gesamtrate = 0;
		double endsaldo = 0;
		int monat = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Bitte geben Sie den Anfangssaldo ein!");
		saldo = scan.nextDouble();

		System.out.println("Bitte geben Sie die monatliche Rate ein!");
		monatsrate = scan.nextInt();

		System.out.println("Bitte geben Sie den Zinssatz ein!");
		zinssatz = scan.nextDouble();

		do {
			saldo = saldo + (saldo * zinssatz) - monatsrate;
			gesamtrate = gesamtrate + monatsrate;
			System.out.println("Monat " + monat + " Saldo: " + saldo
					+ " Gesamtratenzahlung: " + gesamtrate);
			monat = monat + 1;
		} while (saldo > monatsrate);

		monatsrate = saldo + (saldo * zinssatz);
		gesamtrate = gesamtrate + monatsrate;
		endsaldo = saldo + (saldo * zinssatz) - monatsrate;
		monat = monat + 1;
		System.out.println("Monat " + monat + " Saldo: " + endsaldo
				+ " Gesamtratenzahlung: " + gesamtrate);

		scan.close();

	}
}
