package assignment;

public class Ifcondi2 {

	public static void main(String[] args) {
		System.out.println("The Vowles Is Below");
		for (char i='A';i<'Z';++i) {
			if((i=='A')||(i=='E')||(i=='I')||(i=='O')||(i=='U')) {
				System.out.print(i+",");
			}
		}
		System.out.println("\nThe Consonents is Below");
		for (char i='A';i<'Z';++i) {
			if(!(i=='A')||(i=='E')||(i=='I')||(i=='O')||(i=='U')) {
				System.out.print(i+",");
			}
		}
	}
}