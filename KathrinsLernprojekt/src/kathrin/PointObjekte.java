package kathrin;

import java.awt.Point;

public class PointObjekte {

	public static void main(String[] args) {

		Point pt1 = new Point(10, 10);
		Point pt2 = new Point(50, 30);
		flaecheBerechnen(pt1, pt2);

		pt1.move(20, 30);
		pt2.move(60, 80);
		flaecheBerechnen(pt1, pt2);

		double entfernung = pt1.distance(pt2.x, pt1.y);
		System.out.println("Die Entfernung zwischen den Punkten ist "
				+ entfernung);
		int haschi = pt1.hashCode();
		System.out.println("Der gehaschte Punkt ist " + haschi);

	}

	public static void flaecheBerechnen(Point pt1, Point pt2) {

		int flaeche = (Math.abs(pt1.x - pt2.x)) * (Math.abs(pt1.y - pt2.y));
		System.out.println("Die Fläche ist " + flaeche);
	}
}
