
public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	public HourlyEmployee (String first, String last, String ssn, double wageNum, double hoursNum) {
		super (first, last, ssn);
		setWage(wageNum);
		setHours(hoursNum);
	}
	public void setWage(double wageNum) {
		if(wageNum<0) {
		 	throw new IllegalArgumentException("wage has to be >0");
		}
		wage = wageNum;
	}
	public double getWage() {
		return wage;
	}
	public void setHours(double hoursNum) {
		if(hoursNum<0 && hoursNum>168) {
		 	throw new IllegalArgumentException("hours has to be >=0 and <168");
		}
		hours = hoursNum;
	}
	public double getHours() {
		return hours;
	}
	public double getPaymentAmount() {
		if (hours>40) {
			return 40*wage + (hours- 40)*1.5;
		}
		return wage*hours;
	}
	public String toString() {
		return  "hourly employee: " +getFirstName() +" " +getLastName() +"\n"+
			    "social security number: " +getSocialSecurityNumber() +"\n"+
				"hourly wage: " +getWage() +"\n"+
			    "hours worked: " +getHours();
	}
}
