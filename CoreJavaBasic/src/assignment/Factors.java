package assignment;

public class Factors {
	static {
		System.out.println("Factors of Positive & Negative Numbers\n");
	}
	public static void main(String[] args) {
		int num=52;
		for (int i = 1; i<=num; i++) {
			if (num%i==0) {
				System.out.print(i+",");
			}
		}
		System.out.println("\n***********************");
		int num1=-45;
		for (int i = num1; i<=Math.abs(num1); i++) {
			if (i==0) {
//				continue;
			}else
				if(num1%i==0)
				System.out.print(i+",");
			}
		System.out.println("\n******************************");
		factor(56);
		factor(-34);
		}
	static void factor(int num) {
		
		if (num > 0) {
			for (int i = 0; i <= num; ++i) {
				if (i == 0) {
//					continue;
				} else 
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
			}
			System.out.print("\n*********************************");
		} else 
			for (int i = num; i <= Math.abs(num); ++i) {
				if (i == 0) {
//					continue;
				} else {
					if (num % i == 0) {
						System.out.print(i + ", ");
					}
				}
			}
		System.out.println();
	}
}