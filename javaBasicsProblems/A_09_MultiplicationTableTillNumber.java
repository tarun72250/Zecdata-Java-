package javaBasicsProblems;

import java.util.Scanner;

public class A_09_MultiplicationTableTillNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
	}
}
