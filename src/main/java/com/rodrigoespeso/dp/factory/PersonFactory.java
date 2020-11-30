package com.rodrigoespeso.dp.factory;

public class PersonFactory {
	
	public static Person create(String gender) {
		Person person = null;

		if ("male".equals(gender)) {
			person = new Male();
		}
		if ("female".equals(gender)) {
			person = new Female();
		}

		return person;
	}
	
}
