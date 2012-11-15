package kathrin;

import java.util.Scanner;

public class NachnameMajuskel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Geben Sie Ihren Vornamen und "
				+ "Nachnamen getrennt durch ein " + "Leerzeichen ein.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		String vorname = name.substring(0, name.indexOf(" "));
		String nachname = name.substring(name.indexOf(" ") + 1);
		nachname = nachname.toUpperCase();

		System.out.println(vorname + " " + nachname);

		name = name.replace(" ", "");
		System.out.println(name);

		scan.close();

	}
}
