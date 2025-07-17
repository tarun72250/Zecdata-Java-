package javaBasicsProblems;

import java.util.Scanner;

public class A_19_ReverseTheNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to reverse :-");
		int num = sc.nextInt();
		System.out.println("Original number :-"+num);
		int t= num;
		int rev=0;
		while(num!=0) {
			rev =rev*10 + (num%10);
			num =num / 10;
		}
		System.out.println("Reversed number :-"+rev);
		
	}
}
