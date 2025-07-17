package javaBasicsProblems;

import java.util.Scanner;

//Def:	a	series	of	numbers	in	which	each	number	(	Fibonacci	number	)	is	the	sum	of	the	two	
//preceding	numbers.	The	simplest	is	the	series	1,	1,	2,	3,	5,	8, 13, 21, 34, 55  	etc.
public class A_17_FebonaccieSeries {

	public static int fibonnacieSeries(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonnacieSeries(n-1)+fibonnacieSeries(n-2);
	}
	
	public static void fib(int n) {
		
			if(n >= 1) {
			int a = 0 , b=1, c;
			System.out.println(a+" "+b);
			c =a+b;
			System.out.println(c);
			a=b;
			b=c;
			fib(n-1);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n =sc.nextInt();
		
		int result = fibonnacieSeries(n);
		System.out.println("result : "+result);
		
		System.out.println("===============");
		fib(n);
	}
}
