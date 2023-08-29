package oops;

class Calculation {
	   double z;
	   
	   public void adding(double x, double y) {
	      z = x + y;
	      System.out.println("sum of the given numbers :"+z);
	   }
	   
	   public void Subtracting(double x, double y) {
	      z = x - y;
	      System.out.println("Difference between the given numbers :"+z);
	   }
	}

	public class single extends Calculation {  // single level inheritance
	   public void multiplying(double x, double y) {
	      z = x * y;
	      System.out.println("product of the given numbers:"+z);
	   }
	   
	   public static void main(String args[]) {
	      double a = 17.9, b = 45.8;
	      single xyz = new single();
	      xyz.adding(a, b);
	      xyz.Subtracting(a, b);
	      xyz.multiplying(a, b);
	   }
	}
