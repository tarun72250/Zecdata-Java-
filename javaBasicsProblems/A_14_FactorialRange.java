package javaBasicsProblems;

import java.util.Scanner;

public class A_14_FactorialRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :-");
		int num = sc.nextInt();
		
		for(int i =1;i<=num;i++) {
			int fact =1;
			for(int j =1;j<=i;j++) {
				fact *=j;
			}
			System.out.println("Factorial of "+i+" is "+fact);
		}
	}
}
