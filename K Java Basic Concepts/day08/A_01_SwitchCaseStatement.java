package day08;

import java.util.Scanner;

public class A_01_SwitchCaseStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println(" your output is "+1);
			break;
		case 2:
			System.out.println(" your output is "+2);
			break;
		case 3:
			System.out.println(" your output is "+3);
			break;
		case 4:
			System.out.println(" your output is "+ 4);
			break;
		default :System.out.println("No number is valid");
		}
		
		System.out.println("Enter WeekDays : ");
		String day = sc.next();
		
		switch (day) {
		case "monday" : 
			System.out.println("Day is Monday");
			break;
		case "tuesday" : 
			System.out.println("Day is Tuesday");
			break;
		case "wednesday" : 
			System.out.println("Day is Wednesday");
			break;
		case "thursay" : 
			System.out.println("Day is Thursday");
			break;
		case "friday" : 
			System.out.println("Day is Friday");
			break;
		case "satday" : 
			System.out.println("Day is Saturday");
			break;
		case "sunday" : 
			System.out.println("Day is Sunday");
			break;
		default:
			System.out.println("Invalid day");
		}
	}
}
