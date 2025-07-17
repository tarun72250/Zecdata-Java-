package javaBasicsProblems;

import java.util.Scanner;

public class A_06_CheckIsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check :-");
		int n = sc.nextInt();
		
		//============================1way====================================
		if(n==1) {
			System.out.println(n+" prime number starts from 2");
		}
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			
			if(n%i == 0) {
				isPrime= false;
				System.out.println(n+" is not prime");
				break;
			}	
		}
		if(isPrime) {
			System.out.println(n+" is Prime");
		}
		

		//============================2way====================================
		if(n==1) {
			System.out.println(n+" prime number starts from 2");
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+ " is not prime");
				break;
			}
			if(n==i) {
				System.out.println(n+" is prime");
			}
		}
	}
}
