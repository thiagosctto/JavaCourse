package entities;

public class OrderItem {
	private int quantity;
	private double price;
	
	//CONSTRUTORES
	public OrderItem() {}

	public OrderItem(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	//GETTERS AND SETTERS
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//METODOS
	public double subTotal() {
		return 0;
	}
	
}
