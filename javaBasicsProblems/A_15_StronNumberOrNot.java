package javaBasicsProblems;

import java.util.Scanner;

//Write	program	to	check	the	given	number	is	STRONG	or	not?	
//Def:	Strong	numbers	are	the	numbers	whose	sum	of	factorial	of	digits	is	equal	to	the	
//original	number.		
//Example:	145	is	a	strong	number.


public class A_15_StronNumberOrNot {

	public static int fact(int n) {
		int fact = 1;
		while(n !=0) {
			fact = fact * n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check :-");
		int n = sc.nextInt();
		int num = n;
		int t = num;
		int sum = 0;
		while(num != 0) {
			int r = num % 10;
			sum = sum + fact(r);
			num = num / 10;
		}
		
		if(sum == t) {
			System.out.println(t+" is strong number");
		}else
		{
			System.out.println(t+" is not strong number");	
		}
	}
}
