package com.rodrigoespeso.dp.factory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.rodrigoespeso.dp.factory.Female;
import com.rodrigoespeso.dp.factory.Male;
import com.rodrigoespeso.dp.factory.Person;
import com.rodrigoespeso.dp.factory.PersonFactory;
import com.rodrigoespeso.dp.factory.PersonFactory.Gender;

public class PersonFactoryTest {
	
	@Test
	public void whenMaleFlagIsGiven_thenCreateMalePerson() {
		// When
		Person male = PersonFactory.create(Gender.MALE);
		
		// Then
		assertTrue(male instanceof Male);
		assertEquals("I have to goo to the Gentlemens Toilet", male.wichToiletIsForMe());
		
	}
	
	@Test
	public void whenFemaleFlagIsGiven_thenCreateFemalePerson() {
		// When
		Person female = PersonFactory.create(Gender.FEMALE);
		
		// Then
		assertTrue(female instanceof Female);
		assertEquals("I have to goo to the Ladies' Toilet", female.wichToiletIsForMe());
	}
	
}
