
public class test {
	public static void main(String[] args) {
	SalariedEmployee salariedEmp = new SalariedEmployee( "Big", "Lebowski", "000-000", 800);
	HourlyEmployee hourlyEmp = new HourlyEmployee("Luke", "Skywalker", "111-111", 16.75, 40);
	CommissionEmployee commissionEmp = new CommissionEmployee("Leia", "Organa", "222-222", 10000, 0.06);
	BasePlusCommissionEmployee BpCommissionEmp = new BasePlusCommissionEmployee("Obi-Wan", "Kenobi", "333-333", 5000, 0.04, 300);
	inovice inovice1 = new inovice("01234","seat",2,375);
	inovice	inovice2 = new inovice("56789","tire",4,79);
	payable[] payableObjects = new payable[6];
	payableObjects [0] = inovice1;
	payableObjects [1] = inovice2;
	payableObjects [2] = salariedEmp;
	payableObjects [3] = hourlyEmp;
	payableObjects [4] = commissionEmp;
	payableObjects [5] = BpCommissionEmp;
	int i,j;
	double k;
	System.out.println("---Inovices and employees proccessed polymorphically---");
	for(i=0; i<6; i++) {
		System.out.println(payableObjects[i].toString());
		if (payableObjects[i] instanceof BasePlusCommissionEmployee) {
			k = BpCommissionEmp.getBaseSalary()*11/10;
			BpCommissionEmp.setBaseSalary(k);
			System.out.println("new base salary with %10 increase is; "+BpCommissionEmp.getBaseSalary());
			}
		System.out.println("payment amount; " +payableObjects[i].getPaymentAmount()+"\n");
		}
	for (j=0;j<6;j++) {
		System.out.print("\nemployee "+j);
		System.out.print(" is a "+payableObjects[j].getClass().getName());
		}
	}
}
