package javaBasicsProblems;

import java.util.Scanner;

public class A_20_GCDNumber {

	
	public static int gcd(int m , int n) {
		if(m<n)//90<120
			return gcd(n,m);//gcd(120,90)
		if(n==0)
			return m;
		return gcd(n,m%n);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number :-");
		int p = sc.nextInt();//90
		System.out.println("Enter 2nd number :-");
		int q = sc.nextInt();//120
		
		int result = gcd(p,q);
		System.out.println(result);
	}
}
