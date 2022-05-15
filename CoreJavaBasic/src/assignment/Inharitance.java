package assignment;

class Company {
	final int dor = 2005;
	float shears = 75.50f;
	static double turnover = 50505050d;

	Company() {
		this.oldComp(18.8f);
		System.out.println("The Company Turnover is : " + turnover);
	}

	Company(int loss) {
		this();
		System.out.println("The yearly Loss is : " + loss);
	}

	Company(double prof) {
		this(15000);
		System.out.println("The Yearly Profit is : " + prof);
	}

	public static void newComp() {
		System.out.println("My Company Name is Mutual Automotive Pvt.Ltd.");
	}

	public static void newComp(int value) {
		System.out.println("The Valuation of Company is : " + value);
		
	}

	public static void newComp(int noEmp, int noMach) {
		System.out.println("The Number of Employee in Company is : " + noEmp);
		System.out.println("The Number of Machine in Company is : " + noMach);
	}

	void oldComp() {
		
		System.out.println("The Year of Company Registration is : " + this.dor);
	}

	void oldComp(int itr) {
		this.oldComp();
		System.out.println("The Company Fill Income Tax Return : " + itr);
	}

	void oldComp(float gst) {
		this.oldComp(950950);
		System.out.println("The Company Fill GST Tax : " + gst);
	}
}

class Employee extends Company {
	final int empId = 2070;
	float DiwaliBonus = 505.5f;
	static double salary = 950000d;

	Employee() {
		super(101010d);
		this.oldEmp(5000);
		this.newEmp(10000);
		this.newEmp(1090807, 1590);
		
	}

	Employee(int age) {
		this();
		System.out.println("My Current age is : " + age);
	}

	Employee(double Pf) {
		this(28);
		System.out.println("My EPFO is : " + Pf);
	}

	static void newEmp() {
		System.out.println("In Company Moulded M/C is under of me");
	}

	static void newEmp(int Bonus) {
		System.out.println("Company Declared Bouns : " + Bonus);
	}

	static void newEmp(int salary, int Esi) {
		System.out.println("My Updated Salary is : " + salary);
		System.out.println("Company Esi is : " + Esi);
	}

	void oldEmp() {
		System.out.println("The Company Shears is : " + super.shears);
		System.out.println("My empId is : " + empId);
	}

	void oldEmp(double month) {
		this.oldEmp();
		System.out.println("My yearly Salary is : " + Employee.salary);
		System.out.println("My monthly payment is : " + month);
	}

	void oldEmp(int giftV) {
		this.oldEmp(79166.666d);
		System.out.println("Company give us Gift Voucher is : " + giftV);
	}

}

public class Inharitance {

	public static void main(String[] args) {
		Company.newComp();
		Company.newComp(90909090);
		Employee S1 = new Employee(25000d);
		Employee.newEmp();
		Company.newComp(58, 15);

	}
}