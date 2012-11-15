package kathrin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			File file = new File(
					"C:/Users/Kathrin/Documents/Java/workspace/KathrinsLernprojekt/datenInput.txt");
			// System.out.println(file.getAbsolutePath());
			// System.out.println(file.canRead());
			FileReader reader = new FileReader(file);
			Scanner scanner = new Scanner(reader);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println("Der Urlaub beginnt am " + line + ".");
				showDate(line);
			}
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}

	}

	public static void showDate(String line) throws ParseException {

		// Ermitteln wieviele Millisekunden ein Tag hat
		long tagMillis = 1000 * 60 * 60 * 24;
		// Datumsformatcontainer fürs Parsen des Datums-Strings erstellen
		SimpleDateFormat mySimpleFormatter = new SimpleDateFormat("dd.MM.yyyy");
		// Datums-String in ein Datumsobjekt umwandeln
		Date myDate = mySimpleFormatter.parse(line);
		// Datum in Millisekunden umwandeln
		long myTime = myDate.getTime();
		// Tagesdatum in Millisekunden abrufen
		long todayTime = new Date().getTime();
		// Differenz der Daten in Millisekunden berechnen
		long dateDifference = myTime - todayTime;
		System.out.println("Noch " + dateDifference / tagMillis
				+ " Tage bis zum Urlaub!");

	}

}
