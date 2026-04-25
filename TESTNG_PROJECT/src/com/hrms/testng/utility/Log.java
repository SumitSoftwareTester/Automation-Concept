package com.hrms.testng.utility;
import org.apache.log4j.Logger;

public class Log {
 		 //Initialize Log4j logs
        private static Logger Log = Logger.getLogger(Log.class.getName());
            // Need to create these methods, so that they can be called
        public static void info(String message) {
        Log.info(message);
        }
}
