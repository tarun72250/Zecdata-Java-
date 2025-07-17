package javaBasicsProblems;

import java.util.Scanner;

public class A_10_PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :-");
		int num = sc.nextInt();
		
		int sum= 1;
		for(int i = 2;i<=num/2;i++) {
			if(num%i ==0) {
				sum += i;
			}
			
		}
		
		if(num == sum) {
			System.out.println(num+ " is perfect number");
		}
		else	
			System.out.println(num+" is	not	a Perfect number");	
	}
}
