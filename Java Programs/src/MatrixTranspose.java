import java.util.*;
public class MatrixTranspose 
{
   public static void main(String [] args)
   {
	   Scanner kb=new Scanner(System.in);
	   int Matrix[][]=new int [10][10];
	   System.out.println("Enter the matrix rows and column");
	   int i,j,a,b;
	   a=kb.nextInt();
	   b=kb.nextInt();
	   System.out.println("Enter the matrix elements");
	   
	   for(i=0;i<a;i++) {
		   for(j=0;j<b;j++) {
			   Matrix[i][j]=kb.nextInt();
		   }
	   }
	   System.out.println("Entered matrix is: ");
	   for(i=0;i<a;i++) {
		   for(j=0;j<b;j++) {
			   System.out.printf("%d\t",Matrix[i][j]);
		   }
		   System.out.println();
	   }
	   
	   int transpose[][]=new int[10][10];
	   for(i=0;i<b;i++) {
		   for(j=0;j<a;j++) {
			   transpose[j][i]=Matrix[i][j];
		   }
	   }
	   System.out.println("Transpose of the given Matrix is: ");
	    for(i=0;i<a;i++) {
	    	for(j=0;j<b;j++) {
	    		System.out.printf("%d\t",transpose[i][j]);
	    	}
	    	System.out.println();
	    }
	}
}
