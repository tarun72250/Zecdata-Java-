package day09;

public class BoxDemo {

	public static void main(String[] args) {
		
		Box b1 ;//refrence variable 
		b1 = new Box();//object created 
		b1.calVolume();//0
		b1.calVolume(1, 2, 3);//6
		b1.calVolume(1, 2);//2
		
		Box b2 ;//refrence variable 
		b2 = new Box();//object created 
		
		
		Box b3 ;//refrence variable 
		b3 = new Box();//object created 
	}
}
