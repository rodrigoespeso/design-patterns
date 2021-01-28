package com.rodrigoespeso.dpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComputerBuilderTest {
	
	@Test
	public void whenOneObjectIsAcreatedWithBuider_AndOtherNot_thenBothAreTheSame() {
		String computerCase = "big";
		String CPU = "2.9 GHz";
		String motherboard = "AMD";
		String GPU = "Intel Graphics 12";
		String HDD = "512 Gb";
		String operatingSystem = "Doors 10";
		int powerSupply = 12;
		int amountOfRAM = 16;
		
		Computer computer = new Computer(computerCase, CPU, motherboard, GPU, HDD, operatingSystem, powerSupply,
				amountOfRAM);
		
		Computer builtComputer = new ComputerBuilder()
				.withComputerCase(computerCase)
				.withCPU(CPU)
				.withMotherboard(motherboard)
				.withGPU(GPU)
				.withHDD(HDD)
				.withOperatingSystem(operatingSystem)
				.withPowerSupply(powerSupply)
				.withAmountOfRam(amountOfRAM)
				.build();
		
		assertEquals(computer, builtComputer);
	}
}
