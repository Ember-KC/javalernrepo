package javablackbelt;

public class Product {
	private String productName;
	private Supplier supplier;

	public Product(String name, Supplier suppl) {
		productName = name;
		supplier = suppl;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public String getProductName() {
		return this.productName;
	}

}
