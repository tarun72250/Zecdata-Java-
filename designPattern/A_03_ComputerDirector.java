package designPattern;

public class A_03_ComputerDirector {

	private A_03_ComputerBuilder computerBuilder;
	
	public A_03_ComputerDirector(A_03_ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	public A_03_Computer constructComputer() {
		return computerBuilder.
				buildProcessor("Intel V7").
				buildMemory(16).
				buildStorage(512).
				buildGraphicsCard("NVIDIA GTX 1660").
				build();
	}
}
