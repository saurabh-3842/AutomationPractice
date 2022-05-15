package day3.overloading;

public class oload6 {
	
	void disp(int a, double b) {
		System.out.println("Method A");
	}

	void disp(int a, double b, double c) {
		System.out.println("Method B");
	}

	void disp(int a, float b) {
		System.out.println("Method C");
	}
	void disp(int x, int y) {
		System.out.println("Method D");
	}
	public static void main(String args[]) {
		oload6 obj = new oload6();
		obj.disp(10, 20);
	}
}