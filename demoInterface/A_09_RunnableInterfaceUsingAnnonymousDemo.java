package demoInterface;

public class A_09_RunnableInterfaceUsingAnnonymousDemo {

	public static void main(String[] args) {
		
		//2.way Using Anonymous Class
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
			System.out.println("Thread is running.....!");
			}
		};
		new Thread(r).start();
		
		//3. way using Lambda Expression (Java 8+)
		Runnable r1 = ()-> System.out.println("Thread with lambda...>!");
		new Thread(r1).start();
	}
}
