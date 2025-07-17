package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Using Java 8 Stream (Used for Java 8+)
//Best used for concise and parallelizable with other operations with the Time complexity of O(N).
public class A_02_ArrayLargestUsingStreams {

	public static void main(String[] args) {
		int arr [] = {20, 10, 200, 4, 100};
		
		//1. Approach
		//Java Stream and max to find the 
      	// max element in array 
		int max = Arrays.stream(arr).max().getAsInt();	
		System.out.println(max);
		//Complexity Analysis:

		//Time Complexity: O(N)
		//Space Complexity: O(1)
		//2. Approach
		//Sorting the Array (Used when Sorting is essential)
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		//Complexity Analysis:

		//Time Complexity: O(N log(N) )
		//Space Complexity: O(1)
		
		//3. Approach 
		//Using Collections.max() (Used with ArrayList)
		int arr1 [] = {20, 10, 200, 4, 100};
		List<Integer>  list = new ArrayList<Integer>();
		for(int i=0;i<arr1.length;i++) {
			list.add(arr1[i]);
		}
		
		System.out.println(Collections.max(list));
		//Complexity Analysis:

		//Time Complexity: O(N)
		//Space Complexity: O(N)
		
		//4. 
	}
}
//Complexity Analysis:
//
//Time Complexity: O(N)
//Space Complexity: O(1)