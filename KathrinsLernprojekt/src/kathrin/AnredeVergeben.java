package kathrin;

import java.util.Scanner;

public class AnredeVergeben {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String geschlecht;

		System.out.println("Bitte geben Sie Ihren Namen ein.");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		switch (name) {
		case "Amy":
			geschlecht = "female";
			break;
		case "Buffy":
			geschlecht = "female";
			break;
		case "Cathy":
			geschlecht = "female";
			break;
		case "Elroy":
			geschlecht = "male";
			break;
		case "Fred":
			geschlecht = "male";
			break;
		default:
			geschlecht = "";
		}

		if (geschlecht.equals("female")) {
			System.out.println("Mrs. " + name);
		} else {
			System.out.println("Mr. " + name);
		}
	}
}
