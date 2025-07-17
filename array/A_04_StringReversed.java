package array;

public class A_04_StringReversed {

	public static void main(String[] args) {
		
		String input ="Sachin Tendulkar";
		System.out.println("Original String : "+input);
		String reversed = new StringBuffer(input).reverse().toString();
		System.out.println("Reversed String : "+reversed);//rakludneT nihcaS
		
		//each word in the string is reversed, but the word order remains the same.
		String input1 ="Sachin Tendulkar";
		String [] words = input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word :words) {
			String reversedWord = new StringBuilder(word).reverse().toString();
			result.append(reversedWord).append(" ");
		}
		System.out.println("output "+ result.toString().trim());
		
		
		
	}
}
