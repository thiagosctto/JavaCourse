package herancaPolimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manafactureDate;
	
	public UsedProduct() {};
	
	public UsedProduct(String name, Double price, LocalDate manafactureDate) {
		super(name, price);
		this.manafactureDate = manafactureDate;
	}

	//GETTERS AND SETTERS
	public LocalDate getManafactureDate() {
		return manafactureDate;
	}

	public void setManafactureDate(LocalDate manafactureDate) {
		this.manafactureDate = manafactureDate;
	};
	
	//METODS
	@Override
	public String priceTag() {
		return getName()+" ( used ) $ "+String.format("%.2f", getPrice())+" (Manufacture date: "+ manafactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+")";
	}
}
