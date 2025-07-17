package javaBasicsProblems;

import java.util.Scanner;

public class A_23_RangeOfArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		for(int i =0;i<=num;i++) {
			
			boolean r = armstrongNumber(i);
			if(r) {
				System.out.println(i+" is a armstrong number");
			}
		}
	}
	
	public static int countDigit(int num) {
		int count = 0;
		while(num > 0) {
			count++;
			num = num/10;
		}
		return count;
	}
	
	public static int pow(int r , int count) {
		
		int power = 1;
		while(count > 0) {
			power = power * r;
			count--;
		}
		return power;
	}
	
	public static boolean armstrongNumber(int n ) {
		
		int count = countDigit(n);
		
		int t = n;
		int sum = 0;
		while(t >0) {
			int r = t%10;
			sum = sum + pow(r , count);
			t = t/10;
		}
		
		if(sum == n)
			return true;
		else
			return false;
	}
}
