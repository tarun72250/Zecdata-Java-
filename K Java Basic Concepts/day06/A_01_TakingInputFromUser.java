package day06;

import java.util.Scanner;

public class A_01_TakingInputFromUser {

	public static void main(String[] args) {
		
		//Scanner is a class which is use to take input from user.
		Scanner sc = new Scanner(System.in);//pre-defined //built in class in java 
		System.out.println("Enter num");
		int num = sc.nextInt();//to getting integer value 
		System.out.println("num is :- "+num);
		
		
		System.out.println("Enter true or false");
		boolean isPrime = sc.nextBoolean();
		System.out.println("your value is :- "+isPrime);
		
		
	}
}
