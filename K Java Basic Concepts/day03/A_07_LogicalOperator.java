package day03;

public class A_07_LogicalOperator {

	public static void main(String[] args) {
		
		int a,b,c;//declaration
		a=5;//initilization
		b=6;
		c=7;
		
		//or
		int z;//declaration
		int y;
		int x;
		
		//Logical and operator (&&)
		
		System.out.println(a>b && b>c);//false
		System.out.println(a<b && b<c);//true
		System.out.println(a<b && b>c);//false
		
		//Logical or operator (&&)
		System.out.println(a>b || b>c);//false
		System.out.println(a<b || b<c);//true
		System.out.println(a<b || b>c);//true

	}
}
