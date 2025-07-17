package array;
//Array Basics
//Array is a container which can hold fix number of items and these items should be of same type. 
//Most of the datastructure make use of array to implement their algorithms. 
//Following are important terms to understand the concepts of Array
//Element − Each item stored in an array is called an element.
//Index − Each location of an element in an array has a numerical index which is used to identify the element.
//Index starts with 0.
//Array length is 8 which means it can store 8 elements.
//Each element can be accessed via its index. For example, we can fetch element at index 6 as 9.
//Basic Operations
//Following are the basic operations supported by an array.
//Insertion − add an element at given index.
//Deletion − delete an element at given index.
//Search − search an element using given index or by value.
//Update − update an element at given index.

public class A_01_ArrayDemo {

	public static void main(String[] args) {
		//declaration
		int arr [];
		//initilization 8 size array
		arr = new int[8];
		
		System.out.println("Array Before adding data");
		display(arr);
		System.out.println("\n\n=====================");
		 // Operation : Insertion 
	     // Add elements in the array 
		int num = 1;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Adding "+i+" at index "+num);
			arr[i]=num;
			num++;
		}
		 System.out.println("\n\n=====================");

	     System.out.println("Array after adding data.");
	     display(arr);
	      
	     System.out.println("\n\n=====================");
	     // Operation : Insertion 
	     // Element at any location can be updated directly 
	     int index = 5;
	     arr[index] = 10;
	     
	     System.out.println("Array after updating element at index " + index);
	      display(arr);
	     System.out.println();
	      
	      // Operation : Search using index
	      // Search an element using index.
	      System.out.println("Data at index " + index + ": "+ arr[index]);
	      
	      // Operation : Search using value
	      // Search an element using value.
	      int value = 4;
	      for(int i=0;i<arr.length;i++) {
	    	  if(value == arr[i]) {
	    		  System.out.println(value +" found at index "+i);
	    		  break;
	    	  }  
	      }
	}
	
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
