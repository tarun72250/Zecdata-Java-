package day05;

import java.util.Scanner;

public class A_02_WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		
		
		//The while loop loops through a block of code as long as a specified condition is true:
		int a = 1;
		
//		while(a <=10) {
//			System.out.println(a);
//			a++;
//		}
		
		
		
		while(a<=num) {
			System.out.println(a);
			a++;
		}
		
		
	}
}
