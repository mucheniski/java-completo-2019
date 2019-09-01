package entities;

public class IndividualPerson extends TaxPayer {

	private Double healthExpenditures;
	
	public IndividualPerson() {
		super();
	}

	public IndividualPerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double taxPaid() {
		double tax = 0.0;
		if (annualIncome < 20000.00) {
			tax = annualIncome * 0.15;
		}
		else {
			tax = annualIncome * 0.25;
		}
		
		if (healthExpenditures > 0.0) {
			tax -= (healthExpenditures * 0.5);
		}
		return tax;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
		
}
