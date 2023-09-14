
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	public BasePlusCommissionEmployee (String first, String last, String ssn, double gross, double rate, double bSalary) {
		super (first, last, ssn,gross,rate);
		setBaseSalary(bSalary);
	}
	public void setBaseSalary(double bSalary) {
		if(bSalary<0) {
		 	throw new IllegalArgumentException("base salary has to be >=0");
		}
		baseSalary = bSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public double getPaymentAmount() {
		return (super.getCommissionRate() * super.getGrossSales()) + baseSalary;
	}
	public String toString() {
		return  "base plus commission employee: " +getFirstName() +" " +getLastName() +"\n"+
			    "social security number: " +getSocialSecurityNumber() +"\n"+
			    "gross sales: " +super.getGrossSales() +"\n"+
			    "commission rate: " +super.getCommissionRate() +"\n"+
			    "base salary: " +getBaseSalary();
	}
}
