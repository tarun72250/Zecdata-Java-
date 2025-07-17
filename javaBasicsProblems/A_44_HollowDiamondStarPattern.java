package javaBasicsProblems;

import java.util.Scanner;

public class A_44_HollowDiamondStarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n =sc.nextInt();
		
		//Upper Part
		for(int i=0;i<=n;i++) {
			
			//for spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for hollow star pattern 
			for(int j=1;j<=2*i-1;j++) {
				
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		//Lower Part
		for(int i=n-1;i>=1;i--) {
			//for spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for hollow complete star pettern
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
	}
}
