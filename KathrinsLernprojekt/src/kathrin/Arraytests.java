package kathrin;

public class Arraytests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double overhoursTotal = 0;
		// TODO Auto-generated method stub
		double[] overhours = { 1.00, 2.00, 5.00, 6.00, 3.00, 2.00, 4.00, 1.00,
				2.00, 5.00, 1.00, 0.5, 3.00, 2.00, 4.00, 1.00 };
		for (int i = 0; i < overhours.length; i++) {
			overhoursTotal = overhoursTotal + overhours[i];
		}
		System.out.println("Es wurden insgesamt " + overhoursTotal
				+ " Überstunden gemacht.");
		System.out.println(overhours[2]);

	}
}
