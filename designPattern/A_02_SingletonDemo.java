package designPattern;
//eager way of creating singleton pattern
public class A_02_SingletonDemo {

	private static A_02_SingletonDemo a=new A_02_SingletonDemo();
	
	public static A_02_SingletonDemo getA() {
		return a;
	}
}
