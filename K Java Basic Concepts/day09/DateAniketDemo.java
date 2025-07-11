package day09;

public class DateAniketDemo {

	public static void main(String[] args) {
		
		DateAniket d;//refrence variable
		d = new DateAniket();//d is object create using new operator
		d.display();
		
		
		DateAniket d1;//refrence variable 
		d1 = new DateAniket(18,04,2024);
		d1.display();
		
		DateAniket d2;//refrence variable 
		d2 = new DateAniket(18,04);
		d2.display();
		
		
	}
}
