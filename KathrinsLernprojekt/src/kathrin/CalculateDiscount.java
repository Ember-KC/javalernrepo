package kathrin;

import java.util.Scanner;

public class CalculateDiscount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final double DISCOUNTRATE = 0.10;
		final double MINDISCOUNTTOTAL = 10.00;
		double netTotal;
		double discountedTotal;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Preis ein.");
		netTotal = scan.nextDouble();

		if (netTotal > 10.00) {
			discountedTotal = netTotal - (netTotal * DISCOUNTRATE);
			if (discountedTotal < 10.00) {
				System.out.println("Discountpreis: " + MINDISCOUNTTOTAL
						+ " Euro.");
			} else {
				System.out.println("Discountpreis: " + discountedTotal
						+ " Euro.");
			}

		} else {
			System.out
					.println("Leider können wir Ihnen keinen Discount geben.");

		}

	}

}
