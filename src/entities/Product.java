package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	//overload
	public Product() {};
	
	//constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//overload
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	//metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int qtd) {
		this.quantity += qtd;
	}
	
	public void removeProducts(int qtd) {
		this.quantity -= qtd;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+", "
			+quantity
			+" units, Total: $ "
			+String.format("%.2f",totalValueInStock());
	}
}
