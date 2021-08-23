package org.ssglobal.training.codes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Divide {

	private static Logger logger = Logger.getLogger(Divide.class.getName());
	
	public Divide() {
		logger.setLevel(Level.INFO);
	}
	
	public int div(int x, int y) throws ArithmeticException, Exception{
		logger.info("Execute div");
		
		logger.info("validation y == 0");
		if(y==0) {
			logger.severe("Error: Division by zero is not allowed");
			throw new ArithmeticException("Division by zero is not allowed");
		} else {
			logger.info("Exit without errors");
			return x / y;
		}
	}
}
