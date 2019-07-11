package slfforjDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
//business logic
	private Logger logger= LoggerFactory.getLogger(CarService.class);
	public void process(String msg)
	{   if(logger.isDebugEnabled())
	      { 
		    logger.debug("Processing Car: "+msg);
		   }
		logger.info("Processing Car in smart way:{} ",msg);
		logger.error("Processing Car in smart way:{} ",msg);
		System.out.println("Processed car");
	}
}
