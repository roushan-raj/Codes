class Test1
  {
	 private int a,b,area;
	 void input(int x, int y)
	 {
		 a=x;
		 b=y;
	 }
	 void display()
	 {
		 area=a*b;
		 System.out.println(area);
	 }
  }
public class Test
	 {
		  public static void main(String args[])
		  {
			  Test1 t=new Test1();
			  t.input(3,4);
			  t.display();
		  }
	 }
	 
  
  

