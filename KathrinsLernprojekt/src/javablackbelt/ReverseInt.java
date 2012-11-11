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
		System.out.println("Einmal umgedreht " + reverse(input));
		scan.close();
	}

	// TODO Diesen Schwachsinn vernünftig implementieren!!!

	public static String reverse(int input) {
		String intString;
		String output = "";
		intString = (new Integer(input)).toString();
		int i = intString.length();
		while (i > 0) {
			output = output + intString.charAt(i - 1);
			i--;

		}
		return output;

	}
}
