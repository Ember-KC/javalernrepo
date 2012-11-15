package javablackbelt;

import javablackbelt.Animal.Gender;

public class AnimalManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal1 = new Animal("Wuffi", "dog", 12, Gender.MALE);
		System.out.println("Geschlecht: " + animal1.getGender());
		System.out.println("Aktuelles Alter :" + animal1.getAge());
		System.out.println("Und nach einem Jahr: " + animal1.birthday());
		Animal animal2 = new Animal("Lala", "dog", 5, Gender.FEMALE);
		System.out.println("Geschlecht: " + animal2.getGender());
		System.out.println("Aktuelles Alter: " + animal2.getAge());
		System.out.println("Und nach einem Jahr: " + animal2.birthday());
	}
}
