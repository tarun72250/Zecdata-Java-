package javaBasicsProblems;

import java.util.Scanner;

public class A_03_SumTonNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :-");
		int n =sc.nextInt();
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		System.out.println("Sum is :-"+sum);
	}
}
