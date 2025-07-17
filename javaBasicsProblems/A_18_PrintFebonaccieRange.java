package javaBasicsProblems;

import java.util.Scanner;

public class A_18_PrintFebonaccieRange {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter range till print febonaccie number");
		int n = sc.nextInt();
		
		int a=0 , b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<=n;i++) {
			c=a+b;
			if(c<=n) {
				System.out.println(c);
				a=b;
				b=c;
			}
			
		}
		
		
	}
}
