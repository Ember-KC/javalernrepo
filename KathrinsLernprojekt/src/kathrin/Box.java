package kathrin;

import java.util.Random;

public class Box {

	private double laenge;
	private double breite;
	private double hoehe;
	private double volumen;
	private double flaeche;

	Box(double laenge, double breite, double hoehe) {
		this.laenge = laenge;
		this.breite = breite;
		this.hoehe = hoehe;

	}

	public double berechneVolumen() {
		volumen = laenge * breite * hoehe;
		return volumen;

	}

	public double berechneFlaeche() {
		flaeche = (breite * hoehe * 2) + (laenge * breite * 2)
				+ (laenge * hoehe * 2);
		return flaeche;
	}

	public double getLaenge() {
		return laenge;
	}

	public double getBreite() {
		return breite;
	}

	public double getHoehe() {
		return hoehe;
	}

	public Box kleinereBox() {
		return new Box(0.75 * this.laenge, 0.75 * this.breite,
				0.75 * this.hoehe);
	}

	public Box zufallsBoxen() {
		Random rand = new Random();

		double laenge = 0;
		laenge = (rand.nextInt(6) + 1);

		double breite = 0;
		breite = (rand.nextInt(6) + 1);

		double hoehe = 0;
		hoehe = (rand.nextInt(6) + 1);

		return new Box(laenge, breite, hoehe);
	}

	public String boxVergleich(Box box1, Box box2) {
		String status = "";
		if (box1.laenge <= box2.laenge && box1.breite <= box2.breite
				&& box1.hoehe <= box2.hoehe) {
			status = "Passt!";
		} else if (box2.laenge <= box1.laenge && box2.breite <= box1.breite
				&& box2.hoehe <= box1.hoehe) {
			status = "Passt!";
		} else {
			status = "Passt nicht!";
		}

		return status;
	}
}
