package geeksforgeeks;

import java.util.Scanner;

public class DisplayLongestName {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter test cases");
		int t=sc.nextInt();   // no of test cases
		
		System.out.println("Enter no of strings");
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			String s [] = new String[n];
			
			System.out.println("Enter your Strings");
			
			for(int j=0;j<n;j++) {
				s[j] = sc.next();
			}	
//				int max=0,res=0;
//				for(int j=0;j<n;j++)  {
//				if(max < s[j].length()) {
//					(max) = s[j].length(); 
//					res = j;
//				}	
//			}
//				System.out.println(s[res]);
//				
			int max=0, s1=0;
			for(int j=0;j<n;j++) {
				if(s[j].length() > s[max].length()) {
					max=j;
					s1=j;
				}
			}
			System.out.println(s[s1]);
			
		}
		

	}

}
