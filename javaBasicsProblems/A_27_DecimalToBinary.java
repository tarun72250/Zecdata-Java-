package javaBasicsProblems;

import java.util.Scanner;

public class A_27_DecimalToBinary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Decimal number :-");
		int n= sc.nextInt();
		String bin = "";
		while(n>0) {//5   2    1
			int r = n%2;//5%2=1     2%2=0    1%2=1
			bin = r + bin; //1    01   101
			n = n/2;//5/2=2    2/2=1   1/2=0
		}
		System.out.println("Binary number :-"+bin);
	}
}
