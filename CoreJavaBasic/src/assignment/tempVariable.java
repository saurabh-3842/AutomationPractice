package assignment;

public class tempVariable {

	public static void main(String[] args) {
		System.out.println("Swap Two Numbers using Temporary Variable");
		int num1 = 145, num2 = 256;
		double X,Y;
		X = num2+num1;
		Y = num2-num1;
		System.out.println("The Value Befor Swaping Is");
		System.out.println("Value of X is : "+X+" & Value of Y is : "+Y);
		double T = X;
		X=Y;
		Y=T;
		System.out.println("The Value After Swaping Is");
		System.out.println("Value of X is :* "+X+" & Value of Y is : "+Y);
	}

}
