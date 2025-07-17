package javaBasicsProblems;

import java.util.Scanner;

public class A_46_DiamondShapeAlphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int n = sc.nextInt();
		char ch = 'A';
		//for upper part
		for(int i=1;i<=n;i++) {
			
			//for spaces 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//for Abc
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
		//for lower part
		for(int i=n-1;i>=1;i--) {
			//for spaces 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			//for Abc
			for(int j=1;j<=i;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
	}
}
