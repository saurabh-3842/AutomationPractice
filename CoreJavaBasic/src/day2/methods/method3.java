package day2.methods;

public class method3 {

	public static void main(String[] args) {
		double sum = getAdditionResult(25,30);
		sum = sum*100;
		System.out.println("Result of Addition: "+sum);
		System.out.println("Result of Addition2: "+method3.getAdditionResult(250.36,45));
	}
	/*
	 * accessmodifier:  default
	 * non-accessmodifier: static
	 * return type: double
	 * methodName: getAdditionResult
	 * argument/parameter: double
	 * return value: double
	 */
	static double getAdditionResult(double num1,double num2) {
		System.out.println("Number 1 : "+num1);
		System.out.println("Number 2 : "+num2);
		double res = num1+num2;
		return res;
	}
}