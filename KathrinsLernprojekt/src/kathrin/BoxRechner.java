package kathrin;

class BoxRechner {

	public static void main(String[] args) {
		Box box = new Box(2.5, 5.0, 6.0);

		System.out.println("Flaeche: " + box.berechneFlaeche() + " Volumen: "
				+ box.berechneVolumen());

		System.out.println("Laenge: " + box.getLaenge() + " Hoehe: "
				+ box.getHoehe() + " Breite: " + box.getBreite());

		Box kleineBox = box.kleinereBox();
		System.out.println("Box um 25% geschrumpft - Laenge "
				+ kleineBox.getLaenge() + " Hoehe: " + kleineBox.getHoehe()
				+ " Breite: " + kleineBox.getBreite());
		System.out.println(box.boxVergleich(box, kleineBox));

		System.out.println("Jetzt kommen Zufallsboxen!");

		Box zufallsBox1 = box.zufallsBoxen();
		System.out.println("Zufallsbox 1: Laenge: " + zufallsBox1.getLaenge()
				+ " Hoehe: " + zufallsBox1.getHoehe() + " Breite: "
				+ zufallsBox1.getBreite());

		Box zufallsBox2 = box.zufallsBoxen();
		System.out.println("Zufallsbox 2: Laenge: " + zufallsBox2.getLaenge()
				+ " Hoehe: " + zufallsBox2.getHoehe() + " Breite: "
				+ zufallsBox2.getBreite());

		System.out.println(zufallsBox1.boxVergleich(zufallsBox1, zufallsBox2));
	}
}