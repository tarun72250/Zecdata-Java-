package demoInterface;

class MyRunable implements  Runnable{
	public void run() {
		System.out.println("Thread is running....!");
	}
}

public class A_09_RunnableInterfaceMultiThreadingDemo {

	public static void main(String[] args) {
		MyRunable r = new MyRunable();
		Thread t = new Thread(r);
		t.start();
	}
	
}
