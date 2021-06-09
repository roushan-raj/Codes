package geeksforgeeks;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner (System.in);
		 int t = sc.nextInt();  //no of test cases
		 for(int i=0; i<t; i++){
		     int s = sc.nextInt();  //size of array
		     //int a[]=new int[s];
		     int sum=0;
		    
		       for(int j=1; j<=s; j++){
		          
		           sum = sum+j;
		         
		       }
		       System.out.println(sum);
		     }
		    
		 }

	}


