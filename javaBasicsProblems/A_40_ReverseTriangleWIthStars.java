package javaBasicsProblems;

import java.util.Scanner;

public class A_40_ReverseTriangleWIthStars {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			//print leading spaces
			for(int j=0;j<i;j++) {
					System.out.print(" ");
			}
			//print stars
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
