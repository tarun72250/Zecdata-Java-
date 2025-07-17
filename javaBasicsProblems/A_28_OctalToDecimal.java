package javaBasicsProblems;

import java.util.Scanner;

// Multiply each digit by its power of 8:
//5 × 8⁰ = 5 × 1 = 5
//2 × 8¹ = 2 × 8 = 16
//7 × 8² = 7 × 64 = 448

//Add them up:
//448 + 16 + 5 = 469


public class A_28_OctalToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int num = sc.nextInt();
		int dec = 0;
		int count = 0;
		while(num >0) {//
			int r = num % 10;
			dec = dec + r * pow(8,count);
			count++;
			num = num / 10;
		}
		System.out.println("Decimal number is :-"+dec);
	}
	
	static int pow(int m , int p ) {
		
		int pw = 1;
		while( p>0) {
			pw =pw * m;
			p--;
		}
		return pw;
	}
}
