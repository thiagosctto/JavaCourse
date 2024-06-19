package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	//CONSTRUTORES
	public Order() {}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	//GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	};
	
	//METODOS
	public void addItem(OrderItem item) {
		
	}
	
	public void removeItem(OrderItem item) {
		
	}
	
	public double total() {
		return 0;
	}
}
