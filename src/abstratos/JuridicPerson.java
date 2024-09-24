package abstratos;

public class JuridicPerson extends Person{
	private Integer numberEmployees;
	
	public JuridicPerson() {};

	public JuridicPerson(String name, Double annualIncome, Integer numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	};

	@Override
	public Double incomme() {
		double calc = 0;
		if(numberEmployees > 10) {
			calc = getAnnualIncome() * 0.14;
		}else {
			calc = getAnnualIncome() * 0.16;
		}
		return calc;
	}
}
