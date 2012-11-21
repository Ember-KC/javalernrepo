package javablackbelt;

public class Customer {
	private String firstName;
	public String lastName;

	public Customer(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
