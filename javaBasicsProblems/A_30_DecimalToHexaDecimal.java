package javaBasicsProblems;

import java.util.Scanner;
//469 
//1DF
public class A_30_DecimalToHexaDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Decimal number");
		int n = sc.nextInt();
		String hex = "";
		while(n>0) {
			int r = n%16;
			switch(r)
			{
			case 10: hex = "A"+hex;
					break;
			case 11: hex = "B"+hex;
			break;
			case 12: hex = "C"+hex;
			break;
			case 13: hex = "D"+hex;
			break;
			case 14: hex = "E"+hex;
			break;
			case 15: hex = "F"+hex;
			break;
			
			default : hex = r+hex;
			break;
			
			}
			n=n/16;
		}
		
		System.out.println("HexaDecimal number :- "+hex);
	}
}
