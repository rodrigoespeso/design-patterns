package com.rodrigoespeso.dpatterns.creational.factory;

public class PersonFactory {
	
	public enum Gender {
		MALE, FEMALE
	}
	
	public static Person create(Gender gender) {
		Person person = null;

		if (Gender.MALE.equals(gender)) {
			person = new Male();
		}
		if (Gender.FEMALE.equals(gender)) {
			person = new Female();
		}

		return person;
	}
	
}
