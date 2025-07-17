package javaBasicsProblems;

public class A_24_SwapTwoNumber {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		System.out.println(i+" "+j);
		i = i+j;//i= 30
		j = i - j;//30-20=10  
		i = i - j;
		System.out.println(i+" "+j);
	}
}
