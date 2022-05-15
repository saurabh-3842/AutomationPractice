package day3.overloading;

class oload01 {
	
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(int num1, int num2)  
    {
         System.out.println(num1+num2);
    }
    public void callMe() {
    	System.out.println("I am callMe() of DisplayOverloading class");
    }
}
public class oload5
{
	void callMe() {
		System.out.println("I am callMe() of MethodOverloading4 class");
	}
   public static void main(String args[])
   {
       oload01 obj = new oload01();
       obj.disp('a');
       obj.disp(20 , 10);
       obj.callMe();
       
       oload5 m1=new oload5();
       m1.callMe();
   }
}