package javablackbelt;

import java.util.Scanner;

public class ReverseInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie eine Ganzzahl ein!");
		int input = scan.nextInt();
		getDigitCount(input);
		System.out.println("Einmal umgedreht "
				+ reverse(input, getDigitCount(input)));
		scan.close();
	}

	public static int getDigitCount(int number) {
		double baseExp = 0;
		long baseExpGerundet = 0;
		int anzahlStellen;
		if (number != 0) {
			baseExp = Math.log10(Math.abs(number));

			baseExpGerundet = Math.round(baseExp);
		}

		anzahlStellen = (int) baseExpGerundet;
		return anzahlStellen;
	}

	public static int reverse(int input, int anzahlStellen) {
		int[] zahlenSpeicher = new int[anzahlStellen];
		for (int i = 0; i < zahlenSpeicher.length; i++) {
			input = input % 10;

		}

		// 1020 / 10 = 102 Rest 0
		// 102 / 10 = 10 Rest 2
		// 10 / 10 = 1 Rest 0
		// 1 / 10 = 0 Rest 1
		int output = 0;
		return output;

	}

}
