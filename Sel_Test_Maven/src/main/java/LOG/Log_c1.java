package LOG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class Log_c1 {
	
	static Logger log = LogManager.getLogger(Log_c1.class);
	@Test
	public void test1()
	{
		log.info("hi there");
	}

}
