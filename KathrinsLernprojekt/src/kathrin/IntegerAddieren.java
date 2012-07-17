package kathrin;

import java.util.Scanner;

public class IntegerAddieren {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int summe = 0;
		int zahl = 0;

		for (int i = 1; i < 6; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Geben Sie die " + i + ". Zahl ein.");
			zahl = scan.nextInt();
			summe = summe + zahl;
		}
		System.out.println("Gesmatsumme: " + summe);
	}

}
