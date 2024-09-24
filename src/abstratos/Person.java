package abstratos;

public abstract class Person {
	private String name;
	private Double annualIncome;
	
	public Person() {}

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	};
	
	public Double incomme() {
		double calc = 0;
		if(annualIncome < 20000) {
			calc = annualIncome * 0.15;
		}else {
			calc = annualIncome * 0.25;
		}
		return calc;
	}
}
