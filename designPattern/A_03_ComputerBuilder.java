package designPattern;

public interface A_03_ComputerBuilder {
	A_03_ComputerBuilder buildProcessor(String processor);
	A_03_ComputerBuilder buildMemory(int memory);
	A_03_ComputerBuilder buildStorage(int storage);
	A_03_ComputerBuilder buildGraphicsCard(String graphicsCard);
    A_03_Computer build();
}
