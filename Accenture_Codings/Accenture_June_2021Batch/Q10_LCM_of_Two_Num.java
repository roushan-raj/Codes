
public class Q10_LCM_of_Two_Num {
	
	static int mx, level, lcm = 0;
	
	public static void findLCM(int x, int y) {
		if(x > y){
			mx = level = x;
	      }
	      else{
	    	  mx = level = y;
	      }

	      while(x!= 0) {
	         if(mx % x == 0 && mx % y == 0) {
	            lcm = mx;
	            break;
	         }
	         mx = mx + level;
	      }
	      System.out.println(lcm);
	}

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		findLCM(x, y);
	}

}
