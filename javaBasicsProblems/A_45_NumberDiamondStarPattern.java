package javaBasicsProblems;

import java.util.Scanner;

//Write	a	program	to	display	NUMBERS	in	DIAMOND	shape?	

public class A_45_NumberDiamondStarPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int num =1;
		//upper Part
		for(int i=1;i<=n;i++) {
			//for spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			//for number
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//lower part 
		for(int i=n-1;i>=1;i--) {
			//for spaces 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
