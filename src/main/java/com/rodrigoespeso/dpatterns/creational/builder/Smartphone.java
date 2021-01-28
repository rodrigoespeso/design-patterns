package com.rodrigoespeso.dpatterns.creational.builder;

/**
 * The Builder pattern allows us to write readable, understandable code to set
 * up complex objects.
 * 
 * @author Rodrigo Espeso
 *
 */
public class Smartphone {

	public static class Builder {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backCameraMPixels == null) ? 0 : backCameraMPixels.hashCode());
		result = prime * result + ((batteryAmperage == null) ? 0 : batteryAmperage.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((frontCameraMPixels == null) ? 0 : frontCameraMPixels.hashCode());
		result = prime * result + (isSecondHand ? 1231 : 1237);
		result = prime * result + ((osVersion == null) ? 0 : osVersion.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((ramMemory == null) ? 0 : ramMemory.hashCode());
		result = prime * result + ((screenSizeInches == null) ? 0 : screenSizeInches.hashCode());
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
		Smartphone other = (Smartphone) obj;
		if (backCameraMPixels == null) {
			if (other.backCameraMPixels != null)
				return false;
		} else if (!backCameraMPixels.equals(other.backCameraMPixels))
			return false;
		if (batteryAmperage == null) {
			if (other.batteryAmperage != null)
				return false;
		} else if (!batteryAmperage.equals(other.batteryAmperage))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (frontCameraMPixels == null) {
			if (other.frontCameraMPixels != null)
				return false;
		} else if (!frontCameraMPixels.equals(other.frontCameraMPixels))
			return false;
		if (isSecondHand != other.isSecondHand)
			return false;
		if (osVersion == null) {
			if (other.osVersion != null)
				return false;
		} else if (!osVersion.equals(other.osVersion))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (ramMemory == null) {
			if (other.ramMemory != null)
				return false;
		} else if (!ramMemory.equals(other.ramMemory))
			return false;
		if (screenSizeInches == null) {
			if (other.screenSizeInches != null)
				return false;
		} else if (!screenSizeInches.equals(other.screenSizeInches))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Smartphone [brand=" + brand + ", price=" + price + ", screenSizeInches=" + screenSizeInches
				+ ", frontCameraMPixels=" + frontCameraMPixels + ", backCameraMPixels=" + backCameraMPixels
				+ ", isSecondHand=" + isSecondHand + ", ramMemory=" + ramMemory + ", osVersion=" + osVersion
				+ ", batteryAmperage=" + batteryAmperage + "]";
	}
	
}
