package log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Test {
       public static void main(String[] args) {
    	   Logger logger = (Logger) LogManager.getLogger(Test.class.getName());   
           logger.trace("trace");  
           logger.debug("debug");  
           logger.info("hello");  
           logger.warn("warn");  
           logger.error("error");  
           logger.fatal("fatal");  
	}
}
