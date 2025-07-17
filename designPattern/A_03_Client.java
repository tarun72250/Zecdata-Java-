package designPattern;

public class A_03_Client {

	public static void main(String[] args) {
		
		A_03_ComputerBuilder computerBuilder = new A_03_DesktopComputerBuilder();
		A_03_ComputerDirector director = new A_03_ComputerDirector(computerBuilder);
		A_03_Computer desktop = director.constructComputer();
		
		System.out.println(desktop);
	}
}
