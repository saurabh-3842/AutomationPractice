package day1.globalvariables;

public class GlobalVariable2 {
		static int empID = 143;//Static Global Variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age = 28,empID=456;//local variable
		char name = 'S';//local variable
		System.out.println("My name is : "+name);
		System.out.println("My Age is : "+age);
		System.out.println("My empID is : "+empID);
		System.out.println("My SGV empID is : "+GlobalVariable2.empID);
		empID = 123;
		System.out.println("My Updated empID is : "+empID);
		GlobalVariable2.empID =654;
		System.out.println("My Updated SGV empID is : "+GlobalVariable2.empID);
		System.out.println("Program Ends");

	}

}
