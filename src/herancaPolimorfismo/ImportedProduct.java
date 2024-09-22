package herancaPolimorfismo;

public class ImportedProduct extends Product {
	private Double customsFee;
	
	//CONSTRUCTORS
	public ImportedProduct() {}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	//GETTERS AND SETTERS
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	};
	
	//METODOS
	@Override
	public String priceTag() {
		return super.getName()+" $ "+totalPrice()+"(Customs Fee: $ "+customsFee+")";
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
}
