package day03;

public class A_08_BitwiseOperator {

	public static void main(String[] args) {
		
		int a,b,c;
		a=5;
		b=6;
		c=7;
		
		//or
		int z;
		int y;
		int x;
		
		//Bitwise and operator (&)
		System.out.println(a>b & b>c);//false
		System.out.println(a<b & b<c);//true
		System.out.println(a>b & b<c);//false
		
		//Bitwise or operator (|)
		//if both true return true
		System.out.println(a>b | b>c);//false
		System.out.println(a<b | b<c);//true
		System.out.println(a>b | b<c);//true
	
		//Bitwise Xor operator (^)
		//if both true ans false
		System.out.println(a>b ^ b>c);//false
		System.out.println(a<b ^ b<c);//false
		System.out.println(a>b ^ b<c);//true
	}
}
