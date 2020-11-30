package com.rodrigoespeso.dp.singleton;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	/*
	 * volatile modifier tells the JVM to be cautious of the threads which runs
	 * concurrently
	 */
	private static volatile Logger instance;

	private Logger() {
		// Avoid the instantiation of the class from outside hiding the constructor
	}

	/*
	 * Only by calling getInstance the object is created, and only once.
	 * synchronized makes sured the method is accessed one thread at a time Other
	 * use of "synchronized" is to add it as a modifier in the method head. To
	 * acquire the lock is very expensive process so it has to be used more
	 * efficient as we can
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
	
	/*
	 * Override this method from Serializable so in case of being de-serialized get
	 * this instance and do not create another
	 */
	protected Object readResolve() {
		return instance;
	}
	
	/*
	 * Override to prohibit the cloning
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
