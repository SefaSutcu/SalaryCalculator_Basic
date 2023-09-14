
public class SalariedEmployee extends Employee {
	private double weeklySalary;
	public SalariedEmployee (String first, String last, String ssn, double salary) {
		super(first, last, ssn);
		setWeeklySalary(salary);
	 }
	 public void setWeeklySalary(double salary) {
		if(salary<0) {
		 	throw new IllegalArgumentException("weekly salary has to be >0");
		}
		weeklySalary = salary;
	 }
	 public double  getWeeklySalary() {
		  return weeklySalary;
	 }
	 public double getPaymentAmount() {
		 return weeklySalary;
	 }
	 public String toString() {
		 return "salaried employee: " +getFirstName()+" "+getLastName()+"\n"+
				"social security number: " +getSocialSecurityNumber()+"\n"+
				"weekly salary: " +getWeeklySalary();
	 }
}
