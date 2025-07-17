package javaBasicsProblems;

import java.util.Scanner;

public class A_04_CheckEvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number to check :-");
		int n = sc.nextInt();
		
		if(n%2 == 0) {
			System.out.println(n+" is even");
		}else {
			System.out.println(n+" is odd");
		}
	}
}
