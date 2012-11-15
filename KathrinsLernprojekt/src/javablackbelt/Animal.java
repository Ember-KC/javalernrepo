package javablackbelt;

public class Animal {
	private String animalName;
	private String animalType;
	private int animalAge;
	private Gender gender;

	public enum Gender {
		MALE, FEMALE;
	}

	public Animal(String name, String type, int age, Gender gender) {
		animalName = name;
		animalType = type;
		animalAge = age;
		this.gender = gender;

	}

	public int birthday() {
		this.animalAge = this.animalAge + 1;
		return this.animalAge;

	}

	public int getAge() {
		return this.animalAge;
	}

	public Gender getGender() {
		return this.gender;
	}

	public String getName() {
		return this.animalName;
	}

	public String getAnimalType() {
		return this.animalType;
	}

}
