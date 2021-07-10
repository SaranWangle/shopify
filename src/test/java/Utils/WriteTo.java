package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;


public class WriteTo {
	
	static Logger log = LogManager.getLogger(WriteTo.class);
	WriteTo(){
	 //DOMConfigurator.configure("log4j.properties");
		//PropertyConfigurator.configure("log4j2.properties");
	}
	public static void LogInfo(String str) {
		log.info(str);
	}
	public void LogWarn(String str) {
		log.warn(str);
	}
	public void LogError(String str) {
		log.error(str);
	}
	public void LogTrace(String str) {
		log.trace(str);
	}
	public void LogDebug(String str) {
		log.debug(str);
	}
	public static void Log(String str) {
		
		log.info(str);
		log.warn(str);
		log.error(str);
		log.trace(str);
		log.debug(str);
	}
}
