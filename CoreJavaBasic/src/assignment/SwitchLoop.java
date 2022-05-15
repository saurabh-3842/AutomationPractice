package assignment;

public class SwitchLoop {

	public static void main(String[] args) {
		int X = 45, Y = 87, res;
		char ans ='-';
		switch (ans) {
		case '*':
			res= X*Y;
			System.out.println("The Multiplication of Two Numbers :"+res);
			break;
		case '-':
			res=Y-X;
			System.out.println("The Substraction of Two Numbers :"+res);
			break;
		case '/':
			res= Y/X;
			System.out.println("The Division of Two Numbers :"+res);
			break;
		case '+':
			res=X+Y;
			System.out.println("The Addition of Two Numbers :"+res);
			break;
		default :
			System.out.println("The Using Data is Invalid");
			break;
		}
	}
}