package javablackbelt;

import java.util.ArrayList;

public class ProductManager {

	private static final String UND_TSCHUESS = "Und Tschüß!";
	private static final String HUHU_ARRAY = "Huhu Array!";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Supplier supplier1 = new Supplier("Ikea");
		Supplier supplier2 = new Supplier("Java Blackbelt");
		Product product1 = new Product("Chair", supplier1);
		Product product2 = new Product("Table", supplier1);
		Product product3 = new Product("OO Exam", supplier2);

		System.out.println("Das Produkt " + product1.getProductName()
				+ " ist von " + product1.getSupplier().getSupplierName());
		System.out.println("Das Produkt " + product2.getProductName()
				+ " ist von " + product2.getSupplier().getSupplierName());
		System.out.println("Das Produkt " + product3.getProductName()
				+ " ist von " + product3.getSupplier().getSupplierName());

	}

	private static void test() {
		String[] stringArray = new String[5];
		stringArray[0] = HUHU_ARRAY;
		System.out.println(stringArray[0]);
		stringArray[0] = UND_TSCHUESS;
		System.out.println(stringArray[0]);
		System.out.println("======");

		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add(HUHU_ARRAY);
		System.out.println(stringArrayList.get(0));
		stringArrayList.add(0, UND_TSCHUESS);
		System.out.println(stringArrayList.get(0));
		System.out.println(stringArrayList.get(1));
	}
}
