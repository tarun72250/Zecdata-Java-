package javaBasicsProblems;

import java.util.Scanner;

public class A_12_PalindromeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to chekc the palindrom :-");
		int num = sc.nextInt();
		
		int t = num, rev = 0;
		while(num !=0) {
			rev = (rev*10)+(num%10);
			num = num /10;
		}
		if(t==rev) {
			System.out.println(rev+" is palindrome number.");
		}else {
			System.out.println(rev+" is not palindrome number");
		}
	}
}
