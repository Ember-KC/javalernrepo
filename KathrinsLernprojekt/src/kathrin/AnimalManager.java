package kathrin;

import javablackbelt.Animal;
import javablackbelt.Animal.Gender;

public class AnimalManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal1 = new Animal("Wuffi", "dog", 12, Gender.MALE);
		System.out.println("Aktuelles Alter :" + animal1.getAge());
		System.out.println("Und nach einem Jahr: " + animal1.birthday());
	}

}
