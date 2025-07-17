package string;

import java.util.Arrays;

public class A_05_LongestString {

	public static void main(String[] args) {
		
		//1.
		String str = "I love programming in java";
		String [] words = str.split(" ");//split by spaces
		String longest = "";
		
		for(String word :words) {
			if(word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println("Longest String : "+longest);
		//Time Complexity: O(n)
		//✔ Space Complexity: O(n) (because of split() creating an array)
		
		//2. Using Stream API 
		String longest1 = Arrays.stream(str.split(" ")).max((a,b)->a.length() - b.length()).orElse("");
		System.out.println("Longest String : "+longest1);
	}
}
