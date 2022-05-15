package day1.globalvariables;

public class GlobalVariable1 {
		static int age = 29;//static global variable
	public static void main(String[] args) {
		System.out.println("Program Starts");
		int age = 28;//local variable
		char name = 'S';//local variable
		System.out.println("My name is : "+name);
		System.out.println("My Age is : "+age);//it can be access directly only when local variable is absent
		System.out.println("My Updated Age is : "+GlobalVariable1.age);//Standard way to access SGV 
		System.out.println("Ends");

	}

}
