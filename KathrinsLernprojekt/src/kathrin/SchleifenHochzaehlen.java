package kathrin;

import java.util.Scanner;

public class SchleifenHochzaehlen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int zaehler;
		int limit;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Startwert ein.");
		zaehler = scan.nextInt();
		System.out.println("Bitte geben Sie den Endwert ein.");
		limit = scan.nextInt();
		
		while (zaehler <= limit) {
			System.out.println("Der Zähler ist " + zaehler);
			zaehler = zaehler + 1;
		}
		

	}
}
