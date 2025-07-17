package string;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A_03_RemoveDuplicatesString {

	public static void main(String[] args) {
		
		//1.
		String input = "aaaabbbbbcccccccdd";
		 //assuming asscie char
		StringBuilder result = new StringBuilder();
		boolean[] seen = new boolean[256]; 
		for (char ch : input.toCharArray()){
			if(!seen[ch]) {
				result.append(ch);
				seen[ch] = true;
			}
		}
		System.out.println(result);
		//Time Complexity :-O(n) — where n is the length of the input string.
		//Each character is visited once , Set lookup (seen[ch]) is O(1).
		//Space Complexity :- O(1) for the fixed-size seen[256] array (constant space).
		//O(n) for the output string in worst case (all characters are unique).


		//2. Using TreeSet:
		String input1 = "dcbaaa";
		Set<Character> set = new TreeSet<Character>();
		for(char ch : input.toCharArray()) {
			set.add(ch);	
		}
		System.out.println(set);
		//Time Complexity :→ O(n log k)
		//Space Complexity:→ O(k)
		
		//3.
		String input2 = "dcbaaa";
		Set<Character> set2 = new LinkedHashSet<>();//Maintains insertion order (unlike HashSet, which is unordered), Automatically removes duplicates.
	    for (char ch2 : input2.toCharArray()) {
	        set2.add(ch2);
	    }
	    StringBuilder result2 = new StringBuilder();
	    for (char ch2 : set2) {
	        result2.append(ch2);
	    }
	    System.out.println(result2.toString());
	    
	    //4. Using Stream API 
	    String input3 = "dcbaaaaa";
	    String unique = input3.chars()
	    					.distinct()
	    					.sorted()
	    					.collect(StringBuilder::new,
	    							StringBuilder::appendCodePoint,
	    							StringBuilder::append)
	    					.toString();
	    System.out.println(unique);
	    //Time Complexity: O(n log k) due to sorting
	    //Space Complexity: O(k)
	}
}
