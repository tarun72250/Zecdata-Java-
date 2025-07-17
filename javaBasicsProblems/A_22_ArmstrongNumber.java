package javaBasicsProblems;

import java.util.Scanner;

public class A_22_ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int n = sc.nextInt();
		boolean result = checkArmstrongNo(n);
		if(result) {
			System.out.println("Number is Armstrong number");
		}else
		{
			System.out.println("Number is not Armstrong number");
		}
	}
	
	public static int countDigit(int num) {
		int count =0;
		while(num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
	
	public static int pow(int m, int n)//3 3     5 3 
	{
	
		int pw = 1;//3   9   27          |       5   25   125
		while(n>0) {//3    2      1
			pw = pw * m;//1*3=3       3*3=9        9*3=27           |  1*5=5       5*5=25      25*5=125 
			n--;//3-1=2      2-1=1        
		}
		return pw;//27
	}
	public static boolean checkArmstrongNo(int n) {
		
		int count = countDigit(n);
		int t = n;
		int sum =0 ; 
		while( t > 0) {
			int r = t%10;//153%10=3    15%10=5     1%10=1
			sum = sum + pow(r, count);//3 3        5 3           1 3
			t = t/10;
		}
		if(sum == n)
			return true;
		else
			return false;
	}
}
