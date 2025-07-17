package javaBasicsProblems;

import java.util.Scanner;

public class A_48_SequenceOftriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :-");
		int no = sc.nextInt();
		
		int n = 1;
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
