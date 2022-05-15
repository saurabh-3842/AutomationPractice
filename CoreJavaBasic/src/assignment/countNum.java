package assignment;

public class countNum {

	public static void main(String[] args) {
		System.out.println("Count Number of Digits in an integer");
		int A = 145697878, ct = 0;
		while (A != 0) {
			A = A / 10;
			ct++;
		}
		System.out.println("Number of Digit is : " + ct);
		System.out.println("--------------------------");
		int cs = 0;
		for (int B = 15487; B > 0; cs++) {
			B = B / 10;
		}
		System.out.println("Number of Digit is : " + cs);

		System.out.println("--------------------------");
		countNum s1 = new countNum();
		s1.count(45688884);

	}

	public double count(int num) {
		int cs = 0;
		for (int t = num; t > 0; cs++) {
			t = t / 10;
		}
		System.out.println("Number of Digit is : " + cs);
		return num;
	}

}