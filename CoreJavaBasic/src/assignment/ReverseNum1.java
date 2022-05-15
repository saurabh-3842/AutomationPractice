package assignment;

public class ReverseNum1 {

	public static void main(String[] args) {
		int num = 125, rev = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("The Reverse Number is : " + rev);
//		ReverseNum1 s1 = new ReverseNum1();
//		s1.resss(123);
		System.out.println("The Reverse Number is : " + resss(252));
	}

	public static boolean resss(int num) {
		System.out.println("The Palindrome Number is : " + num);
		int rev = 0, rem, temp = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			return true;
		}
		return false;

	}
}