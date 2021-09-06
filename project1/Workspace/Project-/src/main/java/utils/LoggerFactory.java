package utils;

import org.apache.log4j.Logger;

public class LoggerFactory {
	private static Logger logger;
	
	public LoggerFactory() {
		logger = Logger.getLogger(LoggerFactory.class.getName());
	}
	public Logger getLogger() {
		return logger;
	}
	
}
