package javaBasicsProblems;

import java.util.Scanner;

public class A_21_CheckPrimePalindromeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int n = sc.nextInt();
	int originalNumber = n ;
	int rev = 0;
	
	while(n != 0 ) {
		rev = rev * 10 +(n%10);
		n = n/10;
	}
	
	 if (rev == originalNumber) {
         // Check if the number is prime
         boolean isPrime = true;
         if (rev <= 1) {
             isPrime = false;//Not prime.
         } else {
             for (int i = 2; i <= Math.sqrt(rev); i++) {
                 if (rev % i == 0) {
                     isPrime = false;
                     break;
                 }
             }
         }
         
         if (isPrime) {
             System.out.println(originalNumber + " is a prime palindrome number");
         } else {
             System.out.println(originalNumber + " is a palindrome but not a prime number");
         }
     } else {
         System.out.println(originalNumber + " is not a palindrome number");
     }
	}
}
