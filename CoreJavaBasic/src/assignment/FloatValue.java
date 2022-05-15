package assignment;

public class FloatValue {
	
		double height = 25,res;
	public static void main(String[] args) {
		System.out.println("Multiply Two Floating Point Numbers");
		float base = 35.5f;
		FloatValue S1 = new FloatValue();
		S1.res =0.5*base*(S1.height);
		System.out.println("The Area of Triangle one is : "+S1.res);
		S1.multiplay(56,86.5f);
	}
	 public void multiplay(double h,float b) {
		 double res = 0.5*h*b;
		 System.out.println("The Area of Triangle two is : "+res);
		
	}

}