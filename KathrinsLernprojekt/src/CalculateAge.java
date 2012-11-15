import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age;
		String birthYear;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Bitte geben Sie Ihr Geburtsjahr ein.");
			birthYear = scan.nextLine();
			substractYears(birthYear);

		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public static void substractYears(String birthYear) throws ParseException {

		int intBirthYear = Integer.parseInt(birthYear);

		// Aktuelles Jahr vom System abrufen
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date()); // heute
		int thisYear = cal.get(Calendar.YEAR);

		System.out.println("Sie werden dieses Jahr: "
				+ (thisYear - intBirthYear));

	}

}
