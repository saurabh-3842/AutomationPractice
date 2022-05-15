package assignment;

public class ForLoop1 {

	public static void main(String[] args) {
		System.out.println("Display Uppercased & Lowercased Alphabets\n");
		for (char Name='A';Name<='Z';Name++) {
			System.out.print(Name+",");
		}
		System.out.println("\n-------*Revers Alphabets*---------");
		for (char Name='Z';Name>='A';Name--) {
			System.out.print(Name+",");
		}
		System.out.println("\n------------------------------------");
		for (char Name='a';Name<='z';Name++) {
			System.out.print(Name+",");
		}
		System.out.println("\n-------*Revers Alphabets*---------");
		for (char Name='z';Name>='a';Name--) {
			System.out.print(Name+",");
		}
	
	}

}