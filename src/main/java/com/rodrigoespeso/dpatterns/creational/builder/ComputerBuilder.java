package com.rodrigoespeso.dpatterns.creational.builder;

/**
 * In this version of a Builder pattern, the class to be build is declared out the builder class.
 * 
 * @author Rodrigo Espeso
 *
 */
public class ComputerBuilder {

		// same attributes as Computer
		private String computerCase;
		private String CPU;
		private String motherboard;
		private String GPU;
		private String HDD;
		private String operatingSystem;
		private int powerSupply;
		private int amountOfRAM;

		public ComputerBuilder withComputerCase(String computerCase) {
			this.computerCase = computerCase;
			return this;
		}

		public ComputerBuilder withCPU(String CPU) {
			this.CPU = CPU;
			return this;
		}

		public ComputerBuilder withMotherboard(String motherboard) {
			this.motherboard = motherboard;
			return this;
		}

		public ComputerBuilder withGPU(String GPU) {
			this.GPU = GPU;
			return this;
		}

		public ComputerBuilder withHDD(String HDD) {
			this.HDD = HDD;
			return this;
		}

		public ComputerBuilder withOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
			return this;
		}

		public ComputerBuilder withPowerSupply(int powerSupply) {
			this.powerSupply = powerSupply;
			return this;
		}

		public ComputerBuilder withAmountOfRam(int amountOfRAM) {
			this.amountOfRAM = amountOfRAM;
			return this;
		}

		public Computer build() {
			Computer computer = new Computer();
			computer.setComputerCase(computerCase);
			computer.setCPU(CPU);
			computer.setMotherboard(motherboard);
			computer.setGPU(GPU);
			computer.setHDD(HDD);
			computer.setOperatingSystem(operatingSystem);
			computer.setPowerSupply(powerSupply);
			computer.setAmountOfRAM(amountOfRAM);

			return computer;
		}

}
