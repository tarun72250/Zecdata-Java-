package javaBasicsProblems;

import java.util.Scanner;

public class A_47_MPatternWithStars {

	public static void main(String[] args) {
		
		int spaces = 8;
		for(int i =1;i<=5;i++)
		{
			//for star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			//for spaces
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			//again star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			spaces -=2;
		}
	}
}
