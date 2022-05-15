package assignment;

public class LargeValue {

	public static void main(String[] args) {
		int X=143, Y=243, Z=183;
		if((X>=Y)&&(Y>=Z)) {
			System.out.println("The Largest Number is :"+X);
		}
		 if((Y>=X)&&(Y>=Z)) {
			 System.out.println("The Largest Number is :"+Y);
			}
		 if((Z>=X)&&(Z>=Y)) {
			 System.out.println("The Largest Number is :"+X);
		}
		
	}

}