package com.rodrigoespeso.dpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmartphoneBuilderTest {
	
	@Test
	public void whenOneObjectIsAcreatedWithBuider_AndOtherNot_thenBothAreTheSame() {
		String brand = "Sumsang";
		Double price = 2000.0;
		Double screenSizeInches = 4.7;
		Integer frontCameraMPixels = 13;
		Integer backCameraMPixels = 94;
		boolean isSecondHand = false;
		Integer ramMemory = 512;
		String osVersion = "11.1.32.1";
		Long batteryAmperage = 3150L;
		
		Smartphone smartphone = new Smartphone.Builder().build();
		smartphone.setBrand(brand);
		smartphone.setPrice(price);
		smartphone.setScreenSizeInches(screenSizeInches);
		smartphone.setFrontCameraMPixels(frontCameraMPixels);
		smartphone.setBackCameraMPixels(backCameraMPixels);
		smartphone.setSecondHand(isSecondHand);
		smartphone.setRamMemory(ramMemory);
		smartphone.setOsVersion(osVersion);
		smartphone.setBatteryAmperage(batteryAmperage);
		
		Smartphone builtSartphone = new Smartphone.Builder()
				.withBrand(brand)
				.withPrice(price)
				.withScreenSizeInches(screenSizeInches)
				.withFrontCameraMPixels(frontCameraMPixels)
				.withBackCameraMPixels(backCameraMPixels)
				.withIsSecondHand(isSecondHand)
				.withramMemory(ramMemory)
				.withOsVersion(osVersion)
				.withBatteryAmperage(batteryAmperage)
				.build();
	
		// TODO is false, why?
		assertEquals(smartphone, builtSartphone);
		
	}
}
