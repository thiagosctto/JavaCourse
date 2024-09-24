package abstratos;

public class PhysicsPerson extends Person{
	private Double healthSpending;
		
	public PhysicsPerson() {}

	public PhysicsPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	};
	
	@Override
	public Double incomme() {
		double calc = 0;
		if(getAnnualIncome() < 20000) {
			calc = getAnnualIncome() * 0.15 - healthSpending * 0.5;
		}else {
			calc = getAnnualIncome() * 0.25  - healthSpending * 0.5;
		}
		return calc;
	}
}
