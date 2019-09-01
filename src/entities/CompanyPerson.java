package entities;

public class CompanyPerson extends TaxPayer {

	private Integer numberOfEmployee;
	
	public CompanyPerson() {
		super();
	}

	public CompanyPerson(String name, Double annualIncome, Integer numberOfEmployee) {
		super(name, annualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}
	
	@Override
	public double taxPaid() {
		double tax = 0.0;
		if (numberOfEmployee <= 10) {
			tax = annualIncome * 0.16;
		}
		else {
			tax = annualIncome * 0.14;
		}
		return tax;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
	
}
