package javaBasicsProblems;

import java.util.Scanner;

public class A_01_Print1toN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
	}
}
