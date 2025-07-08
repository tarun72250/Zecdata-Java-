package designPattern;

import java.lang.reflect.Constructor;

public class A_01_Demo {

	public static void main(String[] args)throws Exception {
		
//		A_01_SingletonDesignPattern a1 = A_01_SingletonDesignPattern.getA();
//		System.out.println(a1.hashCode());//617901222
//		
//		A_01_SingletonDesignPattern a2 = A_01_SingletonDesignPattern.getA();
//		System.out.println(a2.hashCode());//617901222
//		
//		System.out.println(A_02_SingletonDemo.getA().hashCode());//925858445
//		System.out.println(A_02_SingletonDemo.getA().hashCode());//925858445
		
		//1.reflection APi to break singleton design pattern 
		//if object is already exist ==> thrown exception from inside constructor
		
		//2. use enum inside ther default cons
		
		A_01_SingletonDesignPattern a = A_01_SingletonDesignPattern.getA();
		System.out.println(a.hashCode());//617901222
		
		Constructor<A_01_SingletonDesignPattern> constructor = A_01_SingletonDesignPattern.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		A_01_SingletonDesignPattern as = constructor.newInstance();
		System.out.println(as.hashCode());//804564176
	}
}
