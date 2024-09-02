package entities;

public class OrderItem {
	private Integer quantity;
	private double price;
	private Product2 product;
	
	//CONSTRUTORES
	public OrderItem() {}

	public OrderItem(Integer quantity, double price,Product2 p) {
		this.quantity = quantity;
		this.price = price;
		this.product = p;
	}

	//GETTERS AND SETTERS
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}
	
	//METODOS
	public double subTotal() {
		return quantity * price;
	}

	
	
	//toString
	@Override
	public String toString() {
		return getProduct().getName()
				+", $"
				+String.format("%.2f",price)
				+", Quantity: "
				+ quantity
				+ ", SubTotal: $"
				+String.format("%.2f", subTotal());
	}
	
	
}
