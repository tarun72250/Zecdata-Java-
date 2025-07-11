package day02;

public class A_01_DatatypeDemo
{
	
	public static void main(String [] args)
	{
		//Variable :- In Java variable is a container which hold some type of Value.(dataType)
		//Variables are containers for storing data values.
		
		//primitve 
		//dataType   Variable   operator   Value
		byte         b          =          1;
		short        s          =          2;
		int          a          =          10;
		long         l          =          12345;
		float        f          =          12.3f;
		double       d          =          12.3;
		char         ch         =          'a';
		boolean      bool       =           true; //false
		
		
		//Non-primitive
		String str = "aniket";//sequence of characters
		
		
		int mynum = 15;
		System.out.println(mynum);//15
		
		mynum = mynum + 10;//15+10
		System.out.println(mynum);//25
		
		// Final Variables
		// If you don't want others (or yourself) to overwrite existing values, 
		// use the final keyword (this will declare the variable as "final" or "constant",
		// which means unchangeable and read-only):
		final int num = 10;
		//num = 20;//The final local variable num cannot be assigned. It must be blank and not using a compound assignment
		
		/*
		 Other Types
		 A demonstration of how to declare variables of other types:
		 */
		int sourabh1 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		System.out.println("Concatenation "+sourabh1);
		System.out.println(sourabh1+" ---------- "+myFloatNum);//difference in two values
		
		
		//String Concatenation
				String str2 = "sarsaiya";
				String str3 = str +" "+str2;
				System.out.println(str3);
		//You can also use the + character to add a variable to another variable:
				String firstName = "Sourabh ";
				String middleName = "Kumar ";
				String lastName = "Rajput ";
				String fullName = (firstName + middleName + lastName) ;
				System.out.println(fullName);//Sourabh Kumar Rajput 
		
		//For numeric values, the + character works as a mathematical 
		//operator (notice that we use int (integer) variables here):
				int x = 5;
				int y = 6;
				System.out.println(y+x); // Print the value of x + y
				System.out.println(y+" "+x);
		
				
		// Declare Many Variables
		// To declare more than one variable of the same type, you can use a comma-separated list:
		// ExampleGet your own Java Server
		// Instead of writing:
				 
				int x1 = 5;
				int y1 = 6;
				int z1 = 50;
				System.out.println(x1 + y1 + z1);
				int aa , bb , cc;//define
				aa = 10 ; bb = 20 ; cc = 30;//declare 
				
				//You can simply write:
				int x2 = 5, y2 = 6 , z2 = 50 ;
				System.out.println(x2 + y2 + z2);
						
				//You can simply write:
				int x3, y3, z3;
				x3 = y3 = z3 = 50;
				System.out.println(x3 + y3 + z3);	
				
				/*
				Identifiers
				All Java variables must be identified with unique names.
				These unique names are called identifiers.
				Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
				Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
				 */
				// Good
				int minutesPerHour = 60; //camelCasing 

				// OK, but not so easy to understand what m actually is
				int m = 60;
				
				//Names are case sensitive ("myVar" and "myvar" are different variables) example
				String name5 = "manas";
				String Name5 = "Sumit"; // wrong convention
				
				
				/*
				The general rules for naming variables are:
					Names can contain letters, digits, underscores, and dollar signs
					Names must begin with a letter
					Names should start with a lowercase letter and it cannot contain whitespace(packages , variables ,methods , class , ProjectName)
					Names can also begin with $
					Names are case sensitive ("myVar" and "myvar" are different variables)
					Reserved words (like Java keywords, such as int or boolean) cannot be used as names(50) 
				 */
				
				
				
				
		
		
	}
	
}
