package kathrin;
import java.util.Scanner;

public class Quadratrechnung {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte eine Ganzzahl ein.");
		x = scan.nextInt();
		calculatePower(x);

	}

	private static void calculatePower(double xParam) {
		double z = Math.pow(xParam, 2);
		double wert = 3 * z - 8 * xParam + 4;
		System.out.println("Wenn x den Wert " + xParam
				+ " hat, ergibt die Gleichung " + wert);

	}

}
