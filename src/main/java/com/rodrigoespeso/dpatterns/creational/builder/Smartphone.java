package com.rodrigoespeso.dpatterns.creational.builder;

/**
 * The Builder pattern allows us to write readable, understandable code to set
 * up complex objects.
 * 
 * @author Rodrigo Espeso
 *
 */
public class Smartphone {

	public class Builder {
		/*
		 * The same attributes as the object to be build
		 */
		private String brand;
		private Double price;
		private Double screenSizeInches;
		private Integer frontCameraMPixels;
		private Integer backCameraMPixels;
		private boolean isSecondHand;
		private Integer ramMemory;
		private String osVersion;
		private Long batteryAmperage;

		public Builder withBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public Builder withPrice(Double price) {
			this.price = price;
			return this;
		}

		public Builder withScreenSizeInches(Double screenSizeInches) {
			this.screenSizeInches = screenSizeInches;
			return this;
		}

		public Builder withFrontCameraMPixels(Integer frontCameraMPixels) {
			this.frontCameraMPixels = frontCameraMPixels;
			return this;
		}

		public Builder withBackCameraMPixels(Integer backCameraMPixels) {
			this.backCameraMPixels = backCameraMPixels;
			return this;
		}

		public Builder withIsSecondHand(boolean isSecondHand) {
			this.isSecondHand = isSecondHand;
			return this;
		}

		public Builder withramMemory(Integer ramMemory) {
			this.ramMemory = ramMemory;
			return this;
		}

		public Builder withOsVersion(String osVersion) {
			this.osVersion = osVersion;
			return this;
		}

		public Builder withBatteryAmperage(Long batteryAmperage) {
			this.batteryAmperage = batteryAmperage;
			return this;
		}

		public Smartphone build() {
			Smartphone smartphone = new Smartphone();
			smartphone.brand = this.brand;
			smartphone.price = this.price;
			smartphone.screenSizeInches = this.screenSizeInches;
			smartphone.frontCameraMPixels = this.frontCameraMPixels;
			smartphone.backCameraMPixels = this.backCameraMPixels;
			smartphone.isSecondHand = this.isSecondHand;
			smartphone.ramMemory = this.ramMemory;
			smartphone.osVersion = this.osVersion;
			smartphone.batteryAmperage = this.batteryAmperage;

			return smartphone;
		}

	}

	private Smartphone() {
		/*
		 * This object only can be now initialized through builder
		 */
	}
	
	private String brand;
	private Double price;
	private Double screenSizeInches;
	private Integer frontCameraMPixels;
	private Integer backCameraMPixels;
	private boolean isSecondHand;
	private Integer ramMemory;
	private String osVersion;
	private Long batteryAmperage;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getScreenSizeInches() {
		return screenSizeInches;
	}

	public void setScreenSizeInches(Double screenSizeInches) {
		this.screenSizeInches = screenSizeInches;
	}

	public Integer getFrontCameraMPixels() {
		return frontCameraMPixels;
	}

	public void setFrontCameraMPixels(Integer frontCameraMPixels) {
		this.frontCameraMPixels = frontCameraMPixels;
	}

	public Integer getBackCameraMPixels() {
		return backCameraMPixels;
	}

	public void setBackCameraMPixels(Integer backCameraMPixels) {
		this.backCameraMPixels = backCameraMPixels;
	}

	public boolean isSecondHand() {
		return isSecondHand;
	}

	public void setSecondHand(boolean isSecondHand) {
		this.isSecondHand = isSecondHand;
	}

	public Integer getRamMemory() {
		return ramMemory;
	}

	public void setRamMemory(Integer ramMemory) {
		this.ramMemory = ramMemory;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public Long getBatteryAmperage() {
		return batteryAmperage;
	}

	public void setBatteryAmperage(Long batteryAmperage) {
		this.batteryAmperage = batteryAmperage;
	}

}
