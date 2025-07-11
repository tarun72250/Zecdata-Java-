package day09;

public class Box {

	//instance dm , state
	private int height;
	private int width;
	private int depth;
	
	//instance methods , behaviour
	public void calVolume() {
		int result = height * width * depth;
		System.out.println("Volume of Box :- "+ result);
	}
	
	public void calVolume(int h , int w , int d) {
		int result = h * w * d;
		System.out.println("Volume of Box :- "+ result);
	}
	
	public void calVolume(int h , int w) {
		int result = h * w ;
		System.out.println("Volume of Box :- "+ result);
	}
}
