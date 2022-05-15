package assignment;

public class Ifcondi3 {

	public static void main(String[] args) {
		int year = 1000;
		if (((year%4==0) && (year%100!=0)) || (year%400==0)) {
			System.out.println("The Year is leap Year");
		}else {
			System.out.println("The Year is Not Leap Year");
		}
	}
}		