package javaBasicsProblems;
import java.util.Scanner;
//Write	a	program	to	display	DIAMOND	with	stars?	

public class A_41_DiamondWIthStars {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		//upper Part 
		for(int i=1;i<n;i++) {
			//for leading spaces
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print(" ");
			}
			
			for(int j=1 ;j<=2*i-1 ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Lower Part
		for(int i=n-1 ;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
