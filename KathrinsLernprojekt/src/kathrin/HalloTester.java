package kathrin;

import java.util.Scanner;

class HalloObjekt {

	private boolean uppercase;

	HalloObjekt() {
		this(true);

	}

	HalloObjekt(boolean uppercase) {
		this.uppercase = uppercase;
	}

	void sprich(String mitteilung, int length) {
		int i = 0;
		while (i < length) {
			if (uppercase) {
				System.out.println(mitteilung.toUpperCase());

			} else {
				System.out.println(mitteilung);
			}
			i = i + 1;
		}
	}
}

public class HalloTester {
	public static void main(String[] args) {
		HalloObjekt einObjekt = new HalloObjekt();
		System.out.println("Geben Sie eine Mitteilung ein!");
		Scanner scan = new Scanner(System.in);
		String mit = scan.nextLine();
		int leng = mit.length();

		einObjekt.sprich(mit, leng);
		scan.close();
	}
}
