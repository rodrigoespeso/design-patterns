package com.rodrigoespeso.dpatterns.creational.builder;

public class Computer {
	private String computerCase;
	private String CPU;
	private String motherboard;
	private String GPU;
	private String HDD;
	private String operatingSystem;
	private int powerSupply;
	private int amountOfRAM;

	public Computer() {}
	
	public Computer(String computerCase, String CPU, String motherboard, String GPU, String HDD, String operatingSystem,
			int powerSupply, int amountOfRAM) {
		this.computerCase = computerCase;
		this.CPU = CPU;
		this.motherboard = motherboard;
		this.GPU = GPU;
		this.HDD = HDD;
		this.operatingSystem = operatingSystem;
		this.powerSupply = powerSupply;
		this.amountOfRAM = amountOfRAM;
	}

	public String getComputerCase() {
		return computerCase;
	}

	public void setComputerCase(String computerCase) {
		this.computerCase = computerCase;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public String getGPU() {
		return GPU;
	}

	public void setGPU(String gPU) {
		GPU = gPU;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(int powerSupply) {
		this.powerSupply = powerSupply;
	}

	public int getAmountOfRAM() {
		return amountOfRAM;
	}

	public void setAmountOfRAM(int amountOfRAM) {
		this.amountOfRAM = amountOfRAM;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPU == null) ? 0 : CPU.hashCode());
		result = prime * result + ((GPU == null) ? 0 : GPU.hashCode());
		result = prime * result + ((HDD == null) ? 0 : HDD.hashCode());
		result = prime * result + amountOfRAM;
		result = prime * result + ((computerCase == null) ? 0 : computerCase.hashCode());
		result = prime * result + ((motherboard == null) ? 0 : motherboard.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		result = prime * result + powerSupply;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (CPU == null) {
			if (other.CPU != null)
				return false;
		} else if (!CPU.equals(other.CPU))
			return false;
		if (GPU == null) {
			if (other.GPU != null)
				return false;
		} else if (!GPU.equals(other.GPU))
			return false;
		if (HDD == null) {
			if (other.HDD != null)
				return false;
		} else if (!HDD.equals(other.HDD))
			return false;
		if (amountOfRAM != other.amountOfRAM)
			return false;
		if (computerCase == null) {
			if (other.computerCase != null)
				return false;
		} else if (!computerCase.equals(other.computerCase))
			return false;
		if (motherboard == null) {
			if (other.motherboard != null)
				return false;
		} else if (!motherboard.equals(other.motherboard))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		if (powerSupply != other.powerSupply)
			return false;
		return true;
	}
	
}
