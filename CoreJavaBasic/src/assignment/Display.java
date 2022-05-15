package assignment;

public class Display {

	public static void main(String[] args) {
		System.out.println("Display Text Five Times");
		System.out.println("Display Number 1 to 5");
		Display S1 = new Display();
		S1.display(5);
		for (int i=1;i<=5;i++) {
			System.out.println(i+" I Miss You");
			
		}	
}
		private void display(int num) {
			for(int i=num;i>0;i--) {
				System.out.println(i+" I love You");
			}
			System.out.println("-----------------");
		}
	}
