package javablackbelt;


public class BankAccount {
	private String number;
	private double balance;
	private Customer customer;

	BankAccount(String num, double bal, Customer cust) {
		number = num;
		balance = bal;
		customer = cust;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;

	}

	public Customer getCustomer() {
		return this.customer;

	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return this.number;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

}
