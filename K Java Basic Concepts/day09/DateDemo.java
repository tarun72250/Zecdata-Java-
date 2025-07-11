package day09;

public class DateDemo {

	public static void main(String[] args) {
		Date d ; //non-primitive , refrence variable 
		d = new Date();//new is operator.
		//new is responsible for doing 2 things 
		//1. allocate memory in heap
		//2. calling constructor.
		d.display();
		
		
		Date d1 ;
		d1 = new Date(11,04,2025);
		d1.display();
	}
}

