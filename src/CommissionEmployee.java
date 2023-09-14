
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	public CommissionEmployee (String first, String last, String ssn, double gross, double rate) {
		super (first, last, ssn);
		setGrossSales(gross);
		setCommissionRate(rate);
	}
	public void setGrossSales(double gross) {
		if(gross<0) {
		 	throw new IllegalArgumentException("gross sales has to be >=0");
		}
		grossSales = gross;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setCommissionRate(double rate) {
		if(rate<0 && rate>1) {
		 	throw new IllegalArgumentException("hours has to be >0 and <1");
		}
		commissionRate = rate;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public double getPaymentAmount() {
		return grossSales * commissionRate;
	}
	public String toString() {
		return  "commission employee: " +getFirstName() +" " +getLastName() +"\n"+
			    "social security number: " +getSocialSecurityNumber() +"\n"+
				"gross sales: " +getGrossSales() +"\n"+
			    "commission rate: " +getCommissionRate();
	}
}
