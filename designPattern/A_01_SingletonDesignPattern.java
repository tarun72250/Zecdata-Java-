package designPattern;
//lazy way of singleton class
public class A_01_SingletonDesignPattern {

	private static A_01_SingletonDesignPattern a;
	
	private A_01_SingletonDesignPattern() {
		if(a==null) {
			throw new RuntimeException("u are trying to break the singleton pattern");
		}
	}
	
	//lazy way of creating singleton object
	public static A_01_SingletonDesignPattern getA() {
		if(a==null) {
			a = new A_01_SingletonDesignPattern();
		}
		return a;
	}
}
