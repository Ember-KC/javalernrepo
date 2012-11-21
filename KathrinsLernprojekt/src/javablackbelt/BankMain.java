package javablackbelt;

import java.util.ArrayList;

public class BankMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer1 = new Customer("Hans", "Wurst");
		Customer customer2 = new Customer("Karl", "Otto");
		BankAccount bankAccount1 = new BankAccount("A354978", 39.99, customer1);
		BankAccount bankAccount2 = new BankAccount("B234345", 65.79, customer1);
		BankAccount bankAccount3 = new BankAccount("C868699", 567.77, customer2);

		ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
		bankAccountList.add(bankAccount1);
		bankAccountList.add(bankAccount2);
		bankAccountList.add(bankAccount3);

		System.out.println(extractCustomers(bankAccountList));

	}

	public static ArrayList<Customer> extractCustomers(
			ArrayList<BankAccount> bankAccountList) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		for (BankAccount ba : bankAccountList) {
			Customer customer = ba.getCustomer();
			if (!customerList.contains(customer)) {
				customerList.add(customer);
			}
		}

		return customerList;
	}
}
