package day04;

public class A_03_IfElseIfStatement {

	public static void main(String[] args) {
		
		//Use :-Use when only one condition should execute	
		int time = 19;
		
		if(time <= 12  && time >= 0) {
			System.out.println("Good Morning AM");
		}else if(time <= 16 && time > 12) {
			System.out.println("Good Afternoon Pm");
		}else if(time <= 18 && time > 16) {
			System.out.println("Good Evening ");
		}else {
			System.out.println("Good Night");
		}
		
	}
}
