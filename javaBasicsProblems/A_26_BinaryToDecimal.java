package javaBasicsProblems;

import java.util.Scanner;

//Rating :-medium

public class A_26_BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary number....");
		long n = sc.nextLong();//101
		long dec = 0 ;
		int count = 0;
		while(n > 0) {//101    10     1
			long r = n % 10;//101%10=1     10%10=0      1%10=1     
			dec = dec + r*pow(2,count);//0+1*1=1        1+0*2=1       1+1*4=5
			count++;//1
			n=n/10;//101/10=10         10/10=1
		}
		System.out.println("Decimal Euivalent :- "+dec);
	}
	
	
	static int pow(int n , int p) {
		int pw = 1; 
		while(p>0) {
			pw = pw * n;//4
			p--;
		}
		return pw;
	}
	
}
