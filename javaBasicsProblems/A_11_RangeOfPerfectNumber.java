package javaBasicsProblems;

import java.util.Scanner;

public class A_11_RangeOfPerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter range to print the Perfect number :-");
		int num = sc.nextInt();
		
		for(int i =1 ;i<=num ;i++) {
			int sum =1;
			for(int j =2 ; j<=i/2;j++) {
				
				if(i%j ==0) {
					sum +=j;
				}
			}
			if(sum == i) {
				System.out.println(i+" is perfect number");
			}
		}
	}
}
