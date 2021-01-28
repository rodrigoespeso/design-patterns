package com.rodrigoespeso.dpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.rodrigoespeso.dpatterns.creational.singleton.Logger;

public class LoggerTest {
	
	// To test the console output
	// (https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println)
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private String path = "src/test/resources/logger.ser";
	
	@BeforeEach
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	
	@Test
	public void whenLogsSomeMsgInConsole_thenIsSavedTooInAlog() {
		// Given
		String msg = "test1";
		String output = msg.concat("\n");
		
		// When
		Logger logger = Logger.getInstance();
		logger.log("test1");
		
		// Then
		assertEquals(output, outContent.toString());
		assertEquals(output, logger.getLog());
	}
	
	@Test
	public void whenThereAreTwoLoggers_thenBothAreTheSameInstance() {
		// When
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		
		// Then
		assertEquals(logger1, logger2);
		assertEquals(logger1.hashCode(), logger2.hashCode());	// redundant
		assertEquals(logger1.toString(), logger2.toString());	// redundant
		
	}
	
	@Test
	public void whenThereAreTwoLoggerObjects_thenAllLogToTheSamePlace() {
		// Given
		String commonOutput = "test1\ntest2\n";
		
		// When
		Logger logger1 = Logger.getInstance();
		Logger logger2 = Logger.getInstance();
		logger1.log("test1");
		logger2.log("test2");
		
		// Then
		assertEquals(commonOutput, logger1.getLog());
		assertEquals(commonOutput, logger2.getLog());
		
	}
	
	@Test
	public void whenThereAreTwoThreadsUsingLogger_thenItWorksSynchronized() {
		// TODO
	}
	
	@Test
	public void whenAttempToCloneLogger_thenCloneNotSupportedExceptionIsThrown() {
		Logger logger = Logger.getInstance();
		
		// Then
		Throwable exception = assertThrows(CloneNotSupportedException.class, () -> logger.clone());
		assertEquals(null, exception.getMessage());
	}
	
	@Test
	public void whenLoggerIsDeserialized_thenGetTheInstance() throws FileNotFoundException, IOException, ClassNotFoundException {
		// When
		Logger logger = Logger.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File(path)));
		oos.writeObject(logger);

		Logger loggerSer = null;
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File(path)));
		loggerSer = (Logger) ois.readObject();
		
		oos.close();
		ois.close();

		assertEquals(logger, loggerSer);		
		
	}
	
}
