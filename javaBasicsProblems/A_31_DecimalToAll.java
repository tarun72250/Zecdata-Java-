package javaBasicsProblems;

import java.util.Scanner;

public class A_31_DecimalToAll {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number :-");
		 int n = sc.nextInt();
		 System.out.println("Enter the base :-");
		 int base = sc.nextInt();
		 System.out.println(base+" base equivalent :-"+convert(n, base));
	}
	
	static String convert(int num , int base)
	{
		String st = "0123456789ABCDEF";
		String b = "";
		while(num>0) {
			int r = num % base;
			b = st.charAt(r)+b;
			num = num / base;
		}
		return b;
	}
}
