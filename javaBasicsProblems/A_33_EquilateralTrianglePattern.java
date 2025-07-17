package javaBasicsProblems;

import java.util.Scanner;

public class A_33_EquilateralTrianglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:-");
		int n = sc.nextInt();
		
		for(int i =0;i<n;i++) {//row
			for(int j = 0; j<n-i-1;j++) {//column
				System.out.print(" ");
			}
			for(int k = 0; k<=i;k++) {//column
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
