package day1.globalvariables;

public class GlobalVariable3 {
		int empID = 143;//Non Static Global Variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age = 28;//local variable
		char name = 'S';//local variable
		GlobalVariable3 s1 = new GlobalVariable3();
		System.out.println("My name is : "+name);
		System.out.println("My Age is : "+age);
		System.out.println("My NSGV empID is : "+s1.empID);
		s1.empID=431;
		System.out.println("My NSGV Updated empID is : "+s1.empID);
		System.out.println("Program Ends");

	}

}
