
import static java.lang.Math.*;
class Q47_Quadratic_Equation_roots {

	
	public static double [] findRoots(double a, double b, double c){
		
		double [] ans = new double [2];


		double d = b * b - 4 * a * c;
		double sqrt_val = sqrt(abs(d));

		if (d > 0) {

			double d1 = (double)(-b + sqrt_val) / (2 * a);
		    double d2 = (double)(-b - sqrt_val) / (2 * a);
		    
		    ans[0] = d1;
			ans[1] = d2;
		    
		}
		
		return ans;
		
	}
	
    public static void main(String args[]){

		double a = 1, b = -2, c = -3;
		
		double [] ans = findRoots(a, b, c);
		for(double d : ans) {
			System.out.print(d + ",");
		}
	}
}
