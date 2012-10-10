package kathrin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankkontoTest {

	@Test
	public void testBankkonto1() {
		Bankkonto bank = new Bankkonto("Otto", "AB395739457", 550.00);
		double gebuehr = bank.geldAbheben(50.00);
		assertEquals(0.15, gebuehr, 0.1);
	}

	@Test
	public void testBankkonto2() {
		Bankkonto bank = new Bankkonto("Hans", "456457547", -400.00);
		double gebuehr = bank.geldAbheben(500.00);
		assertEquals(0.00, gebuehr, 0.1);
	}

}
