package javaBasicsProblems;

import java.util.Scanner;

public class A_16_RangeOfStrongNo {

	public static int fact(int n) {
		int sum = 1;
		while( n!=0) {
			 sum = sum * n;
			 n--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till range of strong number :-");
		
		int range = sc.nextInt();
		for(int i = 1 ; i<= range ; i++) {
			int num = i;
			int t = num ;
			int sum = 0;
			
			
			while(num != 0) {
				int r = num % 10;
				sum += fact(r);
				num = num / 10;
			}
			if(sum == t)
				System.out.println(t+" is strong number");
			
		}
	}
}
