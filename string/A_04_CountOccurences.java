package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// Count all occurrences of char
//Input: "aaabbbccdd"
// Output:
//a = 3  
//b = 3  
//c = 2  
//d = 2

public class A_04_CountOccurences {

	public static void main(String[] args) {
		
		//1. 
		String str = "aabaadcaaabccddabcd";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch :str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		//arranged in sorted list
		List<Character> list = new ArrayList<Character>(map.keySet());
		Collections.sort(list);
		for(char c :list) {
			System.out.println(c+" : "+map.get(c));//index or their value
		}
		
		//2. Using Stream API
		String str2 = "aaaabcddaacdd";
		Map<Character,Long> freqMap = str.chars().
				mapToObj(c->(char)c).
				collect(Collectors.groupingBy(
				Function.identity(),
				TreeMap::new,
				Collectors.counting())); 
		freqMap.forEach((ch,count)-> System.out.println(ch+" =  "+count));

	}
}
