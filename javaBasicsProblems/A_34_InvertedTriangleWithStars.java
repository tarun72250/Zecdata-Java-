package javaBasicsProblems;

import java.util.Scanner;

public class A_34_InvertedTriangleWithStars {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number :-");
		int n = scanner.nextInt();
		
		for(int i =0; i<n;i++) {
			//for spaces
			for(int j =0; j<i;j++) {
				System.out.print(" ");
			}
			
			//for opposite traingle 
			for(int k =0; k<2*(n-i)-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
