package com.rodrigoespeso.dp.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	/*
	 * volatile modifier tells the JVM to be cautious of the threads which runs
	 * concurrently
	 */
	private static volatile Logger instance;
	private String log;
	
	private Logger() {
		// Avoid the instantiation of the class from outside hiding the constructor
	}
	
	/**
	 * Show message in console and add it to a log variable.
	 * @param msg A {@link String} message to be logged.
	 */
	public void log (String msg) {
		System.out.println(msg);
		if(null == log)
			log = "";
		log = log.concat(msg).concat("\n");
	}

	/**
	 * Only by calling getInstance the object is created, and only once.
	 * synchronized makes sured the method is accessed one thread at a time Other
	 * use of "synchronized" is to add it as a modifier in the method head. To
	 * acquire the lock is very expensive process so it has to be used more
	 * efficient as we can.
	 * 
	 * @return The {@link} Logger instance.
	 */
	public static synchronized Logger getInstance() {
		if (instance == null)
			synchronized (Logger.class) {
				if (instance == null) { // double check is Ok 
					instance = new Logger();
				}
			}
		return instance;

	}

	/**
	 * Return the instance already created.
	 * Overrided from Serializable so in case of being deserialized get
	 * this instance and do not create another
	 * 
	 * @return The {@link Object} instance 
	 */
	protected Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public String getLog() {
		return log;
	}

}
