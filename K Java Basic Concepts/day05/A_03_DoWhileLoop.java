package day05;

import java.util.Scanner;

public class A_03_DoWhileLoop {

	public static void main(String[] args) {
		
		//The loop will always be executed at least once, even if the condition is false
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		
		
		
		int a =1;
		int num = sc.nextInt();
		do {
			System.out.println(a);
			a++;
		}while(a <=num);
		
		
		
		
		
	}
}
