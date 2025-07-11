package day04;

public class A_04_NestedIfStatement {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 4;
		
		if(a > b)
			System.out.println("a is bigger");
		if(b > c)
			System.out.println("b is bigger");
		if(c > a)
			System.out.println("c is bigger");
		if(c > b)
			System.out.println("c is bigger");
		
		//Note :-Checks all conditions, regardless of earlier matches
		//Use when multiple conditions can be true independently

		String str1 = "Aniket";
		String str2 = "Aniket ";
		String str3 = "Aniket";
		
		if(str1 == str2)
			System.out.println("Both are same ");
		if(str1 == str3)
			System.out.println("Both are same");
	}
}
