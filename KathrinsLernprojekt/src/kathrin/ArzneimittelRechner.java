package kathrin;

public class ArzneimittelRechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double wirkstoffVerlust = 0.04;
		int monate = 1;
		double wirkstoffgehalt = 100;

		while (wirkstoffgehalt > 50) {
			wirkstoffgehalt = wirkstoffgehalt
					- (wirkstoffgehalt * wirkstoffVerlust);
			System.out.println("Monat: " + monate + "   Wirkstoffgehalt: "
					+ wirkstoffgehalt);
			monate = monate + 1;
		}

		System.out.println("Das Medikament ist abgelaufen!");

	}

}
