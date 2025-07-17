package sorting;

import java.util.Arrays;
import java.util.Collections;

public class A_01_BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {50, 10, 25, 1,111, 17, 99, 33};
		Arrays.sort(arr);
		System.out.println("Ascending Order : "+Arrays.toString(arr));
		
		// Sort the array in descending order using
        // reverseOrder() method of Collections class
		
		Integer[] a = { 2, -1, 3, 4};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Descending Order : "+ Arrays.toString(a));
	}
}
