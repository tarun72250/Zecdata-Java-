package designPattern;

public class A_03_DesktopComputerBuilder implements A_03_ComputerBuilder{

	private A_03_Computer computer;

	public A_03_DesktopComputerBuilder() {
	computer = new A_03_Computer();
	}
	
	@Override
	public A_03_ComputerBuilder buildProcessor(String processor) {
		computer.setProcessor(processor);
		return this;
	}

	@Override
	public A_03_ComputerBuilder buildMemory(int memory) {
		computer.setMemory(memory);
		return this;
	}

	@Override
	public A_03_ComputerBuilder buildStorage(int storage) {
		computer.setStorage(storage);
		return this;
	}

	@Override
	public A_03_ComputerBuilder buildGraphicsCard(String graphicsCard) {
		computer.setGraphicsCard(graphicsCard);
		return this;
	}

	@Override
	public A_03_Computer build() {
		return computer;
	}
	
}
