package kathrin;
import java.util.Scanner;
import static java.lang.Math.PI;

public class Calculations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int radius;
		double flaeche;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Radius ein.");
		radius = scan.nextInt();
		flaeche = radius * radius * PI;
		System.out.println("Bei einem Radius von " + radius
				+ " ist die Flaeche " + flaeche + ". Pi ist " + PI);

	}

}
