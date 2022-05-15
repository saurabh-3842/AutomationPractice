package assignment;

public class PrimeNum {
	// Natural Number > 1
	// Which has only 2 factors 1 and itself
	// 19 => 1 and 19 => Prime Number
	// 18 => 1,2,4,6,8,10,12,14,16,18,20 => Not Prime Number

	public static void main(String[] args) {
		int num = 23;
		int check = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " Is Not A Prime Number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + " Is Not A Prime Number");
					check = 1;
					break;
				}
			}
			if (check == 0) {
				System.out.println(num + " Is A Prime Number");
			}
		}
		checkprime(18);
		checkprime(29);
	}

	static void checkprime(int num1) {
		int check = 0;
		if (num1 == 0 || num1 == 1) {
			System.out.println(num1 + " Is Not A Prime Number");
		} else {
			for (int i = 2; i <= num1 / 2; i++) {
				if (num1 % i == 0) {
					System.out.println(num1 + " Is Not A Prime Number");
					check = 1;
					break;
				}
			}
			if (check == 0) {
				System.out.println(num1 + " Is A Prime Number");
			}
		}

	}

}