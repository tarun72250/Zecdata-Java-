package string;

public class A_01_ReverseTheSTring {

	public static void main(String[] args) {
		//Reverse the String
		String str = "Hello Tarun";
		
		//1. Approach 
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		//Time Complexity: O(n²) due to string concatenation (because strings are immutable in Java).
		
		//2. Approach 
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("\nreversed string :"+reversed);
		//Time Complexity: O(n)
		//Space Complexity: O(n)
		
		//3. Approach 
		StringBuilder reversed1 = new StringBuilder();
		for(int i=str.length()-1 ; i>=0;i--) {
			reversed1.append(str.charAt(i));
		}
		System.out.println(reversed);
		//Time Complexity: O(n)
		//Space Complexity: O(n)
		//Why better: Avoids the performance hit of += in string concatenation.
		
		//4. Approach
		char ch[] = str.toCharArray();
		
		for(int i=0 , j=ch.length-1;i<j;i++,j--) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(new String(ch));
		//✔ Efficient, O(n) time and in-place reversal.
		
	}
}
