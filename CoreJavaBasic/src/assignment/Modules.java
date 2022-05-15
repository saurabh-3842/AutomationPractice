package assignment;

public class Modules {
	static int num1 = 5;
	long num2 = 87;
	public static void main(String[] args) {
		System.out.println("The Quotient And Remanider Value Is Below");
		Modules S1 = new Modules();
		int num3 = 8;
		double num4 = 98, res1,res2;
		res1 = ((S1.num2)/num1);
		res2 = num4%num3;
		System.out.println("The Quotient is : "+res1);
		System.out.println("The Remainder is : "+res2);
	}

}