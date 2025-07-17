package demoInterface;

//interface inside class
class Machine{
	interface Startable {
		void start();
	}
}

class Engine implements Machine.Startable{
	
	public void start()
	{
		System.out.println("Engine started");
	}
}


public class A_05_NestedInterface {

	public static void main(String[] args) {
		
		Machine.Startable e = new Engine();
		e.start();
	}
}
