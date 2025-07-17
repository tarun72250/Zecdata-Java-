package javaBasicsProblems;

import java.util.Scanner;
//56 
//80
public class A_29_DecimalToOctal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number:-");
		int n = sc.nextInt();
		String oct = "";
		while(n>0) {
			int r = n%8;
			oct = r+oct;
			n=n/8;
		}
		System.out.println("Octal number :-"+oct);
		
		
	}
}
