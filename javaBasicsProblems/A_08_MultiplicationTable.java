package javaBasicsProblems;

import java.util.Scanner;

public class A_08_MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print the table :- ");
		int n =sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
}
