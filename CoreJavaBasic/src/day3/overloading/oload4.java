package day3.overloading;

class Adder {
	
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b * c;
	}
	
	static void call() {
		System.out.println("I am call() of Adder class");
	}
}
public class oload4 {
	
	static void call() {
		System.out.println("I am call() of MethodOverloading4 class");
	}
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 15));
		System.out.println(Adder.add(11, 12, 13));
		Adder.call();
//		call();
		//or
		oload4.call();
	}
}