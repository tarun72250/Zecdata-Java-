package day07;

public class A_01_MathMaxClass {

	public static void main(String[] args) {
//		/Math class :- The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and trigonometric functions.
		System.out.println("max :- "+Math.max(3,5));
		
		int result = Math.min(3, 5);
		System.out.println("min :- "+result);
		
		
		double sqrt = Math.sqrt(64);//implicit typecasting
		System.out.println("sqrt "+sqrt);
		
		double absolute = Math.abs(-2.6);
		System.out.println("absolute "+absolute);
		
		System.out.println("random "+Math.random());
		
		int randomNum = (int)(Math.random() * 101);  // 0 to 100  //explicit typecasting
		System.out.println(randomNum);
	}
}
