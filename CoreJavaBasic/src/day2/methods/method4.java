package day2.methods;

public class method4 {

	public static void main(String[] args) {
		/**
		 *  res=(p*r*t)/100;
		 */
		System.out.println("Get interest using getInterest(): "+method4.getInterest(250000, 6.5, 60));
		System.out.println("Get interest using getInterest1(): "+method4.getInterest1(250000, 7.9, 60));
		method4.getInterest2(350000, 5, 36);
		System.out.println("**********************");
		double res=method4.getInterest(250000, 6.5, 60);
		System.out.println(res);
	}
	public static double getInterest(int p,double r,int t) {//p=250000, r=6.5, t=60
		return (p*r*t)/100;
	}
			//or
	public static double getInterest1(int p,double r,int t) {//p=250000, r=7.9, t=60
		double res=(p*r*t)/100;
		return res;
	}
		//or
	public static void getInterest2(int p,double r,int t) {//p=350000,r=5,t=36
		double res=(p*r*t)/100;
		System.out.println("Interest is :"+res);
	}
}