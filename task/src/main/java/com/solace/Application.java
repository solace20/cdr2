package com.solace;

import com.solace.quartz.MyJob;
import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by solace on 2017/2/9.
 * function use
 */
public class Application {
    public static void main(String args[]){
        Logger logger = Logger.getLogger(MyJob.class);
        logger.debug("solace log________________________________________________________________");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz.xml");

    }
}
