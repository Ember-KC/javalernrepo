package javablackbelt;

import java.util.Scanner;

public class ValidateBankaccount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie Ihre Kontonummer ein!");
		int account = scan.nextInt();
		System.out.println("Kontonummer ist valide? " + validate(account));
		scan.close();
	}

	public static boolean validate(int accountNo) {
		boolean validStatus = false;

		int lastDigits = accountNo % 100;
		int firstDigits = accountNo / 100;
		System.out.println(firstDigits % 97);

		if (firstDigits % 97 == lastDigits) {
			validStatus = true;
		}

		return validStatus;

	}
}
