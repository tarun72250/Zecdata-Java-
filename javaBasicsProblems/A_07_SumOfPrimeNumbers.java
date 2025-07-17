package javaBasicsProblems;

import java.util.Scanner;

public class A_07_SumOfPrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the range	to print sum of	prime Nos.....");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println("\nSum is :-"+sum);	
	}
	
	public static boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
